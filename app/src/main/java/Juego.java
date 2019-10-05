import java.util.LinkedList;
import java.util.List;

public class Juego {
    private final long timer = 1000;
    private final byte nPiezasEnElArray = 2;
    //cada vez que coloquemos una pieza en su destino final hay que llamar en un while a la funcion booleana filaCompleta de la clase Reglas
    //por como esta programado solo se saldra del while cuanndo filaCompleta de false
    //quedaría de esta forma:
    //while(filaCompleta){
    //  puntuacion += 30;
    //}

    /*public boolean checkGameOver(Tablero tablero, Reglas regla){
        boolean check = false;



        return check;
    }*/

    private Tablero borrarPieza(Pieza pieza, Tablero tablero){

        tablero.actualizarTablero(pieza.getCoords(),0);

        return tablero;
    }


    private Tablero hacerDesplazamiento(Pieza pieza, Tablero tablero, Reglas regla, int opcion){
        tablero = this.borrarPieza(pieza,tablero);
        Pieza piezaAux = pieza.clone();

        if(opcion == 0){    //desplazamiento izquierda
            pieza.desplazarIzq();
        }else{              //desplazamiento derecha
            pieza.desplazarDer();
        }

        if(regla.permisoDesplazamiento(pieza.getCoords(), tablero.getMatrizTablero())){
            tablero.actualizarTablero(pieza.getCoords(),pieza.getColor());
        }else{
            tablero.actualizarTablero(piezaAux.getCoords(), pieza.getColor());
        }

        return tablero;
    }

    private Tablero hacerRotaciones(Pieza pieza, Tablero tablero, Reglas regla, int opcion){
        tablero = this.borrarPieza(pieza, tablero);
        Pieza piezaAux = pieza.clone();

        if(opcion  == 0){   //rotacion izquierda
            pieza.rotarIzq();
        }else{              //rotacion derecha
            pieza.rotarDer();
        }

        if(!regla.superaTopeInferior(pieza.getCoords()) && regla.permisoDesplazamiento(pieza.getCoords(), tablero.getMatrizTablero())){
            tablero.actualizarTablero(pieza.getCoords(), pieza.getColor());
        }else{
            tablero.actualizarTablero(piezaAux.getCoords(), pieza.getColor());
        }

        return tablero;
    }


    private Tablero bajarPieza(Pieza pieza, Tablero tablero, Reglas reglas){
        tablero = this.borrarPieza(pieza, tablero);
        Pieza piezaAux = pieza.clone();

        pieza.desplazarAbajo();

        if(!reglas.superaTopeInferior(pieza.getCoords()) && reglas.permisoDesplazamientoInferior(pieza.getCoords(), tablero.getMatrizTablero())){
            tablero.actualizarTablero(pieza.getCoords(), pieza.getColor());
        }else{
            tablero.actualizarTablero(piezaAux.getCoords(), pieza.getColor());
        }

        return tablero;
    }

    /*public void insertarFichaEnTablero(Pieza pieza,Tablero tablero){
        for(int i=0;i<pieza.getCoords().length){

        }
    }*/

    public void juego(){
        List<Pieza> piezas = new LinkedList<>();

        for(int i=0;i<this.nPiezasEnElArray;i++){
            Pieza pieza = new Pieza((int)Math.random()*7+1);
            piezas.add(pieza);
        }


        Tablero tablero = new Tablero();
        Reglas reglas = new Reglas();


        do{

            tablero.actualizarTablero(piezas.get(0).getCoords(),piezas.get(0).getColor());

            Pieza aux = new Pieza((int)Math.random()*7+1);
            piezas.add(aux);

            while(reglas.permisoDesplazamientoInferior(piezas.get(0).getCoords(),tablero.getMatrizTablero())){

                Pieza piezaActual = piezas.get(0);

                long ini = 0;
                long fin = System.currentTimeMillis() + this.timer;

                while(ini<fin){
                    ini = System.currentTimeMillis();

                    //funcion de recibir entrada de desplazamiento
                    //funcion de comprobar desplazamiento, y realizar o declinar
                    int opcion = 0;

                    tablero = this.hacerDesplazamiento(piezaActual,tablero,reglas, opcion);

                    //funcion de recibir entrada de rotacion
                    //funcion de comprobar ratacion, y realizar o declinar

                    tablero = this.hacerRotaciones(piezaActual,tablero, reglas, opcion);

                }

                tablero = this.bajarPieza(piezaActual, tablero, reglas);

                //bajarFila() sePermiteBajarFila???
            }
        }while(reglas.gameOver(tablero.getMatrizTablero()));
    }
}
