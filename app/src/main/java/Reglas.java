public class Reglas {

    //Las coordenadas para realizar las comprobaciones hay que pasarlas desplazadas, es decir con las coordenadas destino deseadas.
    public boolean permisoDesplazamiento(int [][] matrizCoords, int [][] matrizTablero){
        boolean permiso = true;

        for(int i = 0; i < matrizCoords.length; i++){
            if (matrizCoords[i][0] > 9 || matrizCoords[i][0] < 0){
                permiso = false;
            }
        }
        if(permiso){
            for(int i = 0; i < matrizCoords.length; i++){
                if(matrizTablero[matrizCoords[i][0]][matrizCoords[i][1]] != 0){
                    permiso = false;
                }
            }
        }

        return permiso;
    }

    public boolean permisoDesplazamientoInferior(int [][] matrizCoords, int [][] matrizTablero){
        boolean permiso = true;

        for(int j = 0; j < matrizCoords.length; j++){
            if(matrizTablero[matrizCoords[0][j]][matrizCoords[1][j]] != 0){
                permiso = false;
            }
        }

        return permiso;
    }

    public boolean topeInferior(int [][] matrizCoords){
        boolean tope = false;

        for (int i = 0; i < matrizCoords.length; i++){
            if(matrizCoords[i][1] > 23){
                tope = true;
            }
        }
        return tope;
    }

    public boolean filaCompleta (int [][] matrizTablero, Tablero tablero){
        boolean resultado = false;
        for (int i = 23; i >= 0; i--){
            if(!resultado){
                boolean incompleta = false;
                for(int j = 0; j < matrizTablero.length; j++){
                    if(matrizTablero[i][j] == 0){
                        incompleta = true;
                    }
                }
                if(!incompleta){
                    resultado = true;
                    tablero.vaciarFila(i);
                }
            }
        }
        return resultado;
    }

}
