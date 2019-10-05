package com.example.tetris;

import java.util.AbstractSequentialList;
import java.util.LinkedList;
import java.util.List;
import java.util.*;

public class Juego{
    //cada vez que coloquemos una pieza en su destino final hay que llamar en un while a la funcion booleana filaCompleta de la clase com.example.tetris.Reglas
    //por como esta programado solo se saldra del while cuanndo filaCompleta de false
    //quedaría de esta forma:
    //while(filaCompleta){
    //  puntuacion += 30;
    //}

    private final long timer = 1000;
    private final int nPiezasEnElArray = 2;
    List<Integer> listaMovimientos;             // 0 -> desplazamiento izquierda; 1 -> desplazamiento derecha; 2 -> rotacion izquierda; 3 ->rotacion derecha
    List<Pieza> piezas;
    Tablero tablero;
    Reglas reglas;

    public Juego(){
        this.piezas = new LinkedList<>();
        this.listaMovimientos = new LinkedList<>();
        this.tablero = new Tablero();
        this.reglas = new Reglas();
    }


    //*****Parte de funciones llamadas por botones*****

    public void pulsadoDeplazamientoIzq(){
        this.listaMovimientos.add(0);
    }

    synchronized public void pulsadoDesplazamientoDer(){
        this.listaMovimientos.add(1);
    }

    synchronized public void pulsadoRotacionIzq(){
        this.listaMovimientos.add(2);
    }

    synchronized public void pulsadoRotacionDer(){
        this.listaMovimientos.add(3);
    }

    //*****Parte de funciones llamadas por botones*****



    private Tablero borrarPieza(Pieza pieza, Tablero tablero){

        tablero.actualizarTablero(pieza.getCoords(),0);

        return tablero;
    }


    public Tablero hacerDesplazamiento(Pieza pieza, Tablero tablero, Reglas regla, int opcion){
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

        MainActivity.actualizarTablero(tablero.getMatrizTablero());

        return tablero;
    }

    public Tablero hacerRotaciones(Pieza pieza, Tablero tablero, Reglas regla, int opcion){
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

        MainActivity.actualizarTablero(tablero.getMatrizTablero());

        return tablero;
    }


    public Tablero bajarPieza(Pieza pieza, Tablero tablero, Reglas reglas){
        tablero = this.borrarPieza(pieza, tablero);
        Pieza piezaAux = pieza.clone();

        pieza.desplazarAbajo();

        if(!reglas.superaTopeInferior(pieza.getCoords()) && reglas.permisoDesplazamientoInferior(pieza.getCoords(), tablero.getMatrizTablero())){
            tablero.actualizarTablero(pieza.getCoords(), pieza.getColor());
        }else{
            tablero.actualizarTablero(piezaAux.getCoords(), pieza.getColor());
        }

        MainActivity.actualizarTablero(tablero.getMatrizTablero());

        return tablero;
    }

    public boolean comprobarInferiores(Pieza pieza, Tablero tablero, Reglas reglas){
        boolean permiso = true;
        tablero = this.borrarPieza(pieza, tablero);
        Pieza piezaAux = pieza.clone();

        pieza.desplazarAbajo();

        if(!reglas.superaTopeInferior(pieza.getCoords()) && reglas.permisoDesplazamientoInferior(pieza.getCoords(), tablero.getMatrizTablero())){
            permiso = true;
        }else{
            permiso = false;
        }

        return permiso;
    }


    //***** Funcion en la que se usa el wait y viene la entrada de botones*****


    private Tablero seleccionarMovimiento(Pieza piezaActual, Tablero tablero, Reglas reglas){

            if(!listaMovimientos.isEmpty()){
                int movimiento = listaMovimientos.get(0);
                switch (movimiento){
                    case 0:
                        tablero = this.hacerDesplazamiento(piezaActual,tablero,reglas,0);
                        break;
                    case 1:
                        tablero = this.hacerDesplazamiento(piezaActual,tablero,reglas,1);
                        break;
                    case 2:
                        tablero = this.hacerRotaciones(piezaActual,tablero,reglas,0);
                        break;
                    case 3:
                        tablero = this.hacerRotaciones(piezaActual,tablero,reglas,1);
                        break;
                }
                this.listaMovimientos.clear();
            }

        return tablero;
    }


    //***** Funcion en la que se usa el wait y viene la entrada de botones*****


    public void run(){

        for(int i=0;i<this.nPiezasEnElArray;i++){
            Pieza pieza = new Pieza((int)(Math.random()*7+1));
            piezas.add(pieza);
        }

        Pieza piezaActual = piezas.get(0);
        piezas.remove(0);
        tablero.actualizarTablero(piezaActual.getCoords(), piezaActual.getColor());
        Pieza pieza = new Pieza((int)(Math.random()*7+1));
        piezas.add(pieza);

        do{
            if(!comprobarInferiores(pieza, tablero, reglas)){
                piezaActual = piezas.get(0);
                piezas.remove(0);
                tablero.actualizarTablero(piezaActual.getCoords(), piezaActual.getColor());
                Pieza aux = new Pieza((int)(Math.random()*7+1));
                piezas.add(aux);
            }

            //***** Funcion en la que se usa el wait y viene la entrada de botones*****

            long ini = 0;
            long fin = System.currentTimeMillis() + this.timer;

            while(ini<fin){
                ini = System.currentTimeMillis();

                tablero = this.seleccionarMovimiento(piezaActual, tablero, reglas);
            }

            //***** Funcion en la que se usa el wait y viene la entrada de botones*****

            tablero = this.bajarPieza(piezaActual, tablero, reglas);
            MainActivity.actualizarTablero(tablero.getMatrizTablero());

        }while(true);
    }


}
