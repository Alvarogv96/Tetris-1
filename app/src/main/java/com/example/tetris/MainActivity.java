package com.example.tetris;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.LinkedList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private int balanceDesplazamiento = 0;  // Si es cero, esta balanceado. Si es negativo se desplaza las unidades negativas a la izquierda. Si es positivo se desplaza las unidaddes positivas a la derecha.
    private int balanceRotacion = 0;        // Si es cero, esta balanceado. Si es negativo se rota las unidades negativas a la izquierda. Si es positivo se rota las unidaddes positivas a la derecha.
    private final int nPiezasEnElArray = 2;
    private final long timer = 1000;


    private void pulsadoDeplazamientoIzq(View vista){
        this.balanceDesplazamiento--;
    }

    private void pulsadoDesplazamientoDer(View vista){
        this.balanceDesplazamiento++;
    }

    private void pulsadoRotacionIzq(View vista){
        this.balanceRotacion--;
    }

    private void pulsadoRotacionDer(View vista){
        this.balanceRotacion++;
    }


    private void iniciarJuego(View vista){
        vista.setVisibility(View.GONE);

        Juego juego = new Juego();

        this.ejecucion(juego);
    }

    private void ejecucion(Juego juego){
        List<Pieza> piezas = new LinkedList<>();

        for(int i=0;i<this.nPiezasEnElArray;i++){
            Pieza pieza = new Pieza((int)Math.random()*7+1);
            piezas.add(pieza);
        }

        Tablero tablero = new Tablero();
        Reglas reglas = new Reglas();
        VistaTablero vista = new VistaTablero();

        do{
            tablero.actualizarTablero(piezas.remove(0).getCoords(),piezas.get(0).getColor());

            Pieza aux = new Pieza((int)Math.random()*7+1);
            piezas.add(aux);

            while(reglas.permisoDesplazamientoInferior(piezas.get(0).getCoords(),tablero.getMatrizTablero())){

                Pieza piezaActual = piezas.get(0);

                long ini = 0;
                long fin = System.currentTimeMillis() + this.timer;

                while(ini<fin){
                    ini = System.currentTimeMillis();

                    tablero = juego.hacerDesplazamiento(piezaActual,tablero,reglas,vista, this.balanceDesplazamiento);

                    tablero = juego.hacerRotaciones(piezaActual,tablero, reglas, vista, this.balanceRotacion);

                }

                tablero = juego.bajarPieza(piezaActual, tablero, vista,reglas);

            }

            piezas.remove(0);

        }while(reglas.gameOver(tablero.getMatrizTablero()));
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // La actividad se crea.
    }
    @Override
    protected void onStart() {
        super.onStart();
        // La actividad está iniciando.
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Aplicacíon iniciada", Toast.LENGTH_SHORT).show();
        // La actividad se hace visible.
    }
    @Override
    protected void onPause() {
        super.onPause();
        //La actividad se está pausando.
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Pausando", Toast.LENGTH_SHORT).show();
        // La actividad se detiene.
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        // La actividad se destruye.
    }

}
