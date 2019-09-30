import java.util.LinkedList;
import java.util.List;

public class Juego {
    //cada vez que coloquemos una pieza en su destino final hay que llamar en un while a la funcion booleana filaCompleta de la clase Reglas
    //por como esta programado solo se saldra del while cuanndo filaCompleta de false
    //quedaría de esta forma:
    //while(filaCompleta){
    //  puntuacion += 30;
    //}

    public boolean checkGameOver(Tablero tablero){

    }

    public boolean checkFilaBajada(Tablero tablero){

    }

    public void insertarFichaEnTablero(Pieza pieza,Tablero tablero){

    }

    public void juego(){
        List<Pieza> piezas = new LinkedList<Pieza>();
        Tablero tablero = new Tablero();


        while(this.checkGameOver(tablero)){
            this.insertarFichaEnTablero(piezas.get(0),tablero);
                while(checkFilaBajada(tablero)){

                    long ini = 0;
                    long fin = 1000;

                    while(ini<fin){
                        ini = System.currentTimeMillis();

                        //funcion de recibir entrada de desplazamiento
                        //funcion de comprobar desplazamiento, y realizar o declinar

                        //funcion de recibir entrada de rotacion
                        //funcion de comprobar ratacion, y realizar o declinar

                    }

                    //bajarFila() sePermiteBajarFila???
                }
        }
    }
}
