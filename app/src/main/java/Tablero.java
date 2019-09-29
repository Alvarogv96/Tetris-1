public class Tablero {
    private int [][] matrizTablero;

    public Tablero(){
        this.matrizTablero = new int[9][23];
    }

    //Este método tendrá que ser  llamado 2 veces, 1 para mover la pieza, y otra para borrar la pieza de su posición anterior, es decir pasándole un 0 como color
    //y guardando las anteriores coordenas.
    public void actualizarTablero(int [][] matrizCoords, int color){
        for(int i = 0; i < matrizCoords.length; i++){
            this.matrizTablero[matrizCoords[i][0]][matrizCoords[i][1]] = color;
        }
    }
}
