package com.example.tetris;

public class Tablero {

    private int [][] matrizTablero;

    public Tablero(){
        this.matrizTablero = new int[24][10];
    }

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

    public int[][] getMatrizTablero() {
        return matrizTablero;
    }
}