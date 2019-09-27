public class Pieza {
    private int[][] matrizCoords;
    private int color;
    private boolean rota;

    public Pieza(int tipo){
        switch (tipo){
            case 1:
                this.crearPieza1(1);
            break;
            case 2:
                this.crearPieza2(2);
            break;
            case 3:
                this.crearPieza3(3);
            break;
            case 4:
                this.crearPieza4(4);
            break;
            case 5:
                this.crearPieza5(5);
            break;
            case 6:
                this.crearPieza6(6);
            break;
            case 7:
                this.crearPieza7(7);
            break;
            default:
        }
    }

    private void crearPieza1(int color) {
        this.color = color;
        this.matrizCoords = new int[][]{{3, 21}, {4, 21}, {5, 21}, {6, 21}};
        this.rota = true;
    }

    private void crearPieza2(int color) {
        this.color = color;
        this.matrizCoords = new int[][]{{3,21},{4,21},{5,21},{4,22}};
        this.rota = true;
    }

    private void crearPieza3(int color) {
        this.color = color;
        this.matrizCoords = new int[][]{{3,21},{4,21},{5,21},{3,22}};
        this.rota = true;
    }

    private void crearPieza4(int color) {
        this.color = color;
        this.matrizCoords = new int[][]{{3,21},{4,21},{5,21},{5,22}};
        this.rota = true;
    }

    private void crearPieza5(int color) {
        this.color = color;
        this.matrizCoords = new int[][]{{4,21},{5,21},{4,22},{5,22}};
        this.rota = false;
    }

    private void crearPieza6(int color) {
        this.color = color;
        this.matrizCoords = new int[][]{{3,21},{4,21},{4,22},{5,22}};
        this.rota = true;
    }

    private void crearPieza7(int color) {
        this.color = color;
        this.matrizCoords = new int[][]{{3,22},{4,22},{4,21},{5,21}};
        this.rota = true;
    }

    public void rotarIzq(){

    }

    public void rotarDer(){

    }

    public void desplazarIzq(){

    }

    public void desplazarDer(){
        
    }
}
