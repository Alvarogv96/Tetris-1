package com.example.tetris;


import android.os.Looper;
import android.view.View;

import java.util.LinkedList;
import java.util.List;

public class Juego extends Thread{
    //cada vez que coloquemos una pieza en su destino final hay que llamar en un while a la funcion booleana filaCompleta de la clase com.example.tetris.Reglas
    //por como esta programado solo se saldra del while cuanndo filaCompleta de false
    //quedaría de esta forma:
    //while(filaCompleta){
    //  puntuacion += 30;
    //}

    private final long timer = 1000;
    private final int nPiezasEnElArray = 2;
    List<Integer> listaMovimientos;             // 0 -> desplazamiento izquierda; 1 -> desplazamiento derecha; 2 -> rotacion izquierda; 3 ->rotacion derecha



    //*****Parte de funciones llamadas por botones*****

    synchronized public void pulsadoDeplazamientoIzq(){
        this.listaMovimientos.add(0);
        this.listaMovimientos.notify();
    }

    synchronized public void pulsadoDesplazamientoDer(){
        this.listaMovimientos.add(1);
        this.listaMovimientos.notify();
    }

    synchronized public void pulsadoRotacionIzq(){
        this.listaMovimientos.add(2);
        this.listaMovimientos.notify();
    }

    synchronized public void pulsadoRotacionDer(){
        this.listaMovimientos.add(3);
        this.listaMovimientos.notify();
    }

    //*****Parte de funciones llamadas por botones*****



    private Tablero borrarPieza(Pieza pieza, Tablero tablero){

        tablero.actualizarTablero(pieza.getCoords(),0);

        return tablero;
    }


    public Tablero hacerDesplazamiento(Pieza pieza, Tablero tablero, Reglas regla, VistaTablero vista, int opcion){
        tablero = this.borrarPieza(pieza,tablero);
        Pieza piezaAux = pieza.clone();

        if(opcion < 0){                     //desplazamiento izquierda
            pieza.desplazarIzq();
        }else{              //desplazamiento derecha
            pieza.desplazarDer();
        }

        if(regla.permisoDesplazamiento(pieza.getCoords(), tablero.getMatrizTablero())){
            tablero.actualizarTablero(pieza.getCoords(),pieza.getColor());
        }else{
            tablero.actualizarTablero(piezaAux.getCoords(), pieza.getColor());
        }

        vista.actualizarTablero(tablero.getMatrizTablero());

        return tablero;
    }

    public Tablero hacerRotaciones(Pieza pieza, Tablero tablero, Reglas regla, VistaTablero vista, int opcion){
        tablero = this.borrarPieza(pieza, tablero);
        Pieza piezaAux = pieza.clone();

        if(opcion  == 0){        //rotacion izquierda
            pieza.rotarIzq();

        }else{                  //rotacion derecha
            pieza.rotarDer();
        }

        if(!regla.superaTopeInferior(pieza.getCoords()) && regla.permisoDesplazamiento(pieza.getCoords(), tablero.getMatrizTablero())){
            tablero.actualizarTablero(pieza.getCoords(), pieza.getColor());
        }else{
            tablero.actualizarTablero(piezaAux.getCoords(), pieza.getColor());
        }

        vista.actualizarTablero(tablero.getMatrizTablero());

        return tablero;
    }


    public Tablero bajarPieza(Pieza pieza, Tablero tablero, VistaTablero vista, Reglas reglas){
        tablero = this.borrarPieza(pieza, tablero);
        Pieza piezaAux = pieza.clone();

        pieza.desplazarAbajo();

        if(!reglas.superaTopeInferior(pieza.getCoords()) && reglas.permisoDesplazamientoInferior(pieza.getCoords(), tablero.getMatrizTablero())){
            tablero.actualizarTablero(pieza.getCoords(), pieza.getColor());
        }else{
            tablero.actualizarTablero(piezaAux.getCoords(), pieza.getColor());
        }

        vista.actualizarTablero(tablero.getMatrizTablero());

        return tablero;
    }


    //***** Funcion en la que se usa el wait y viene la entrada de botones*****


    private Tablero seleccionarMovimiento(Pieza piezaActual, Tablero tablero, Reglas reglas, VistaTablero vista) throws InterruptedException {

        long ini = 0;
        long fin = System.currentTimeMillis() + this.timer;

        while(ini<fin){
            ini = System.currentTimeMillis();       //poner al principio del ciclo while o despues???

            wait();

            for(Integer movimiento:this.listaMovimientos){
                switch (movimiento){
                    case 0:
                        tablero = this.hacerDesplazamiento(piezaActual,tablero,reglas,vista,0);
                        break;
                    case 1:
                        tablero = this.hacerDesplazamiento(piezaActual,tablero,reglas,vista,1);
                        break;
                    case 2:
                        tablero = this.hacerRotaciones(piezaActual,tablero,reglas,vista,0);
                        break;
                    case 3:
                        tablero = this.hacerRotaciones(piezaActual,tablero,reglas,vista,1);
                        break;
                }
            }

        }

        this.listaMovimientos.clear();

        return tablero;
    }


    //***** Funcion en la que se usa el wait y viene la entrada de botones*****


    public void run(){
        List<Pieza> piezas = new LinkedList<>();
        this.listaMovimientos = new LinkedList<>();
        Looper.prepare();

        for(int i=0;i<this.nPiezasEnElArray;i++){
            Pieza pieza = new Pieza((int)Math.random()*7+1);
            piezas.add(pieza);
        }


        Tablero tablero = new Tablero();
        Reglas reglas = new Reglas();
        VistaTablero vista = new VistaTablero();


        do{

            tablero.actualizarTablero(piezas.get(0).getCoords(),piezas.get(0).getColor());

            Pieza aux = new Pieza((int)Math.random()*7+1);
            piezas.add(aux);

            while(reglas.permisoDesplazamientoInferior(piezas.get(0).getCoords(),tablero.getMatrizTablero())){

                Pieza piezaActual = piezas.get(0);

                //***** Funcion en la que se usa el wait y viene la entrada de botones*****

                try{
                    tablero = this.seleccionarMovimiento(piezaActual, tablero, reglas, vista);
                }catch (InterruptedException ex){

                }

                //***** Funcion en la que se usa el wait y viene la entrada de botones*****

                tablero = this.bajarPieza(piezaActual, tablero, vista,reglas);

            }
        }while(reglas.gameOver(tablero.getMatrizTablero()));
    }


}
