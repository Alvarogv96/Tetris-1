public class Tablero {
    private int [][] matrizTablero;

    public Tablero(){
        this.matrizTablero = new int[24][10];
    }

    //Este método tendrá que ser  llamado 2 veces, 1 para mover la pieza, y otra para borrar la pieza de su posición anterior, es decir pasándole un 0 como color
    //y guardando las anteriores coordenas.
    public void actualizarTablero(int [][] matrizCoords, int color){
        for(int i = 0; i < matrizCoords.length; i++){
            this.matrizTablero[matrizCoords[i][0]][matrizCoords[i][1]] = color;
        }
    }

    public void vaciarFila (int fila){
        for(int j = 0; j < 10; j++){
            this.matrizTablero[fila][j] = 0;

        }
        bajarFila();
    }

    private void bajarFila (){
        int color;
        for(int i = 22; i >= 0; i--){
            for(int j = 0; j < 10; j++){
                if(matrizTablero[i + 1][j] == 0){
                    color = matrizTablero[i][j];
                    matrizTablero[i][j] = 0;
                    matrizTablero[i + 1][j] = color;
                }
            }
        }
    }
}
