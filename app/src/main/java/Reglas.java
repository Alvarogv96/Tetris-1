public class Reglas {
    public boolean permisoDesplazamintoDer(int [][] matrizCoords){
        boolean permiso = true;

        for(int i = 0; i < matrizCoords.length; i++){
            if (matrizCoords[i][0] > 10){
                permiso = false;
            }
        }

        return permiso;
    }

    public boolean permisoDesplazamintoIzq(int [][] matrizCoords){
        boolean permiso = true;

        for(int i = 0; i < matrizCoords.length; i++){
            if (matrizCoords[i][0] < 0){
                permiso = false;
            }
        }

        return permiso;
    }

}
