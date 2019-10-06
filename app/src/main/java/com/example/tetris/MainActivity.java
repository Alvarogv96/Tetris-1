package com.example.tetris;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static ArrayList<TextView> ListaCeldas;
    private TextView ayuda;

    private final long timer = 500;
    private final int nPiezasEnElArray = 2;
    List<Integer> listaMovimientos;
    List<Pieza> piezas;
    Tablero tablero;
    Reglas reglas;
    Handler handler = new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.piezas = new LinkedList<>();
        this.listaMovimientos = new LinkedList<>();
        this.tablero = new Tablero();
        this.reglas = new Reglas();

        ListaCeldas = new ArrayList<TextView>(200);
        ayuda = (TextView) findViewById(R.id.a1);
        ListaCeldas.add(ayuda);
        ayuda = (TextView) findViewById(R.id.b1);
        ListaCeldas.add(ayuda);
        ayuda = (TextView) findViewById(R.id.c1);
        ListaCeldas.add(ayuda);
        ayuda = (TextView) findViewById(R.id.d1);
        ListaCeldas.add(ayuda);
        ayuda = (TextView) findViewById(R.id.e1);
        ListaCeldas.add(ayuda);
        ayuda = (TextView) findViewById(R.id.f1);
        ListaCeldas.add(ayuda);
        ayuda = (TextView) findViewById(R.id.g1);
        ListaCeldas.add(ayuda);
        ayuda = (TextView) findViewById(R.id.h1);
        ListaCeldas.add(ayuda);
        ayuda = (TextView) findViewById(R.id.i1);
        ListaCeldas.add(ayuda);
        ayuda = (TextView) findViewById(R.id.j1);
        ListaCeldas.add(ayuda);

        ayuda = (TextView) findViewById(R.id.a2);
        ListaCeldas.add(ayuda);
        ayuda = (TextView) findViewById(R.id.b2);
        ListaCeldas.add(ayuda);
        ayuda = (TextView) findViewById(R.id.c2);
        ListaCeldas.add(ayuda);
        ayuda = (TextView) findViewById(R.id.d2);
        ListaCeldas.add(ayuda);
        ayuda = (TextView) findViewById(R.id.e2);
        ListaCeldas.add(ayuda);
        ayuda = (TextView) findViewById(R.id.f2);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.g2);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.h2);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.i2);
        ListaCeldas.add(ayuda);
        ayuda = (TextView) findViewById(R.id.j2);
        ListaCeldas.add(ayuda);

        ayuda = (TextView)findViewById(R.id.a3);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.b3);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.c3);
        ListaCeldas.add(ayuda);
        ayuda =(TextView) findViewById(R.id.d3);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.e3);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.f3);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.g3);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.h3);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.i3);
        ListaCeldas.add(ayuda);
        ayuda = (TextView) findViewById(R.id.j3);
        ListaCeldas.add(ayuda);

        ayuda = (TextView)findViewById(R.id.a4);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.b4);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.c4);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.d4);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.e4);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.f4);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.g4);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.h4);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.i4);
        ListaCeldas.add(ayuda);
        ayuda = (TextView) findViewById(R.id.j4);
        ListaCeldas.add(ayuda);

        ayuda = (TextView)findViewById(R.id.a5);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.b5);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.c5);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.d5);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.e5);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.f5);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.g5);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.h5);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.i5);
        ListaCeldas.add(ayuda);
        ayuda = (TextView) findViewById(R.id.j5);
        ListaCeldas.add(ayuda);

        ayuda = (TextView)findViewById(R.id.a6);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.b6);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.c6);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.d6);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.e6);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.f6);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.g6);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.h6);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.i6);
        ListaCeldas.add(ayuda);
        ayuda = (TextView) findViewById(R.id.j6);
        ListaCeldas.add(ayuda);

        ayuda = (TextView)findViewById(R.id.a8);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.b8);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.c8);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.d8);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.e8);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.f8);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.g8);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.h8);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.i8);
        ListaCeldas.add(ayuda);
        ayuda = (TextView) findViewById(R.id.j8);
        ListaCeldas.add(ayuda);

        ayuda = (TextView)findViewById(R.id.a9);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.b9);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.c9);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.d9);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.e9);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.f9);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.g9);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.h9);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.i9);
        ListaCeldas.add(ayuda);
        ayuda = (TextView) findViewById(R.id.j9);
        ListaCeldas.add(ayuda);

        ayuda = (TextView)findViewById(R.id.a10);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.b10);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.c10);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.d10);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.e10);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.f10);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.g10);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.h10);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.i10);
        ListaCeldas.add(ayuda);
        ayuda = (TextView) findViewById(R.id.j10);
        ListaCeldas.add(ayuda);

        ayuda = (TextView)findViewById(R.id.a11);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.b11);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.c11);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.d11);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.e11);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.f11);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.g11);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.h11);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.i11);
        ListaCeldas.add(ayuda);
        ayuda = (TextView) findViewById(R.id.j11);
        ListaCeldas.add(ayuda);

        ayuda = (TextView)findViewById(R.id.a12);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.b12);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.c12);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.d12);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.e12);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.f12);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.g12);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.h12);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.i12);
        ListaCeldas.add(ayuda);
        ayuda = (TextView) findViewById(R.id.j12);
        ListaCeldas.add(ayuda);

        ayuda = (TextView)findViewById(R.id.a13);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.b13);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.c13);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.d13);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.e13);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.f13);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.g13);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.h13);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.i13);
        ListaCeldas.add(ayuda);
        ayuda = (TextView) findViewById(R.id.j13);
        ListaCeldas.add(ayuda);

        ayuda = (TextView)findViewById(R.id.a14);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.b14);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.c14);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.d14);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.e14);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.f14);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.g14);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.h14);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.i14);
        ListaCeldas.add(ayuda);
        ayuda = (TextView) findViewById(R.id.j14);
        ListaCeldas.add(ayuda);

        ayuda = (TextView)findViewById(R.id.a15);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.b15);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.c15);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.d15);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.e15);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.f15);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.g15);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.h15);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.i15);
        ListaCeldas.add(ayuda);
        ayuda = (TextView) findViewById(R.id.j15);
        ListaCeldas.add(ayuda);

        ayuda = (TextView)findViewById(R.id.a16);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.b16);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.c16);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.d16);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.e16);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.f16);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.g16);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.h16);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.i16);
        ListaCeldas.add(ayuda);
        ayuda = (TextView) findViewById(R.id.j16);
        ListaCeldas.add(ayuda);

        ayuda = (TextView)findViewById(R.id.a17);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.b17);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.c17);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.d17);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.e17);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.f17);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.g17);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.h17);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.i17);
        ListaCeldas.add(ayuda);
        ayuda = (TextView) findViewById(R.id.j17);
        ListaCeldas.add(ayuda);

        ayuda = (TextView)findViewById(R.id.a18);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.b18);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.c18);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.d18);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.e18);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.f18);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.g18);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.h18);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.i18);
        ListaCeldas.add(ayuda);
        ayuda = (TextView) findViewById(R.id.j18);
        ListaCeldas.add(ayuda);

        ayuda = (TextView)findViewById(R.id.a19);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.b19);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.c19);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.d19);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.e19);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.f19);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.g19);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.h19);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.i19);
        ListaCeldas.add(ayuda);
        ayuda = (TextView) findViewById(R.id.j19);
        ListaCeldas.add(ayuda);

        ayuda = (TextView)findViewById(R.id.a20);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.b20);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.c20);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.d20);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.e20);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.f20);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.g20);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.h20);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.i20);
        ListaCeldas.add(ayuda);
        ayuda = (TextView) findViewById(R.id.j20);
        ListaCeldas.add(ayuda);


        ayuda = (TextView)findViewById(R.id.a21);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.b21);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.c21);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.d21);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.e21);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.f21);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.g21);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.h21);
        ListaCeldas.add(ayuda);
        ayuda = (TextView)findViewById(R.id.i21);
        ListaCeldas.add(ayuda);
        ayuda = (TextView) findViewById(R.id.j21);
        ListaCeldas.add(ayuda);
    }


    public void desplazaIzq(View vista){
        this.listaMovimientos.add(0);
    }

    public void desplazaDer(View vista){
        this.listaMovimientos.add(1);
    }

    public void rotaIzq(View vista){
        this.listaMovimientos.add(2);
    }

    public void rotaDer(View vista){
        this.listaMovimientos.add(3);
    }


    private Tablero borrarPieza(Pieza pieza, Tablero tablero){

        tablero.actualizarTablero(pieza.getCoords(),0);

        return tablero;
    }


    public Tablero hacerDesplazamiento(Pieza pieza, Tablero tablero, Reglas regla, int opcion){
        tablero.actualizarTablero(pieza.getCoords(), 0);
        Pieza piezaAux = pieza.clone();

        if(opcion == 0){                     //desplazamiento izquierda
            piezaAux.desplazarIzq();
        }else if(opcion == 1){              //desplazamiento derecha
            piezaAux.desplazarDer();
        }

        if(regla.permisoDesplazamiento(piezaAux.getCoords(), tablero.getMatrizTablero())){
            tablero.actualizarTablero(piezaAux.getCoords(),piezaAux.getColor());
            if(opcion == 0){                     //desplazamiento izquierda
                pieza.desplazarIzq();
            }else if(opcion == 1){              //desplazamiento derecha
                pieza.desplazarDer();
            }
        }else{
            tablero.actualizarTablero(pieza.getCoords(), pieza.getColor());
        }

        return tablero;
    }


    public Tablero hacerRotaciones(Pieza pieza, Tablero tablero, Reglas regla, int opcion){
        Pieza piezaAux = pieza.clone();
        tablero.actualizarTablero(piezaAux.getCoords(), 0);

        if(opcion == 0){
            piezaAux.rotarIzq();
        }else{
            piezaAux.rotarDer();
        }

        if(!regla.superaTopeInferior(piezaAux.getCoords()) && regla.permisoDesplazamiento(piezaAux.getCoords(), tablero.getMatrizTablero())){
            tablero.actualizarTablero(piezaAux.getCoords(), piezaAux.getColor());

            if(opcion == 0){
                pieza.rotarIzq();
            }else{
                pieza.rotarDer();
            }
        }else{
            tablero.actualizarTablero(pieza.getCoords(), pieza.getColor());
        }

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

        this.actualizarTablero(tablero.getMatrizTablero());


        return tablero;
    }


    public boolean comprobarInferiores(Pieza pieza, Tablero tablero, Reglas reglas){
        boolean permiso = true;

        Pieza piezaAux = pieza.clone();

        tablero.actualizarTablero(piezaAux.getCoords(), 0);

        piezaAux.desplazarAbajo();

        if(!reglas.superaTopeInferior(piezaAux.getCoords()) && reglas.permisoDesplazamientoInferior(piezaAux.getCoords(), tablero.getMatrizTablero())){
            permiso = true;
        }else{
            permiso = false;
        }

        tablero.actualizarTablero(pieza.getCoords(), pieza.getColor());

        return permiso;
    }


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


    public void iniciarChingada(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                executea();
            }
        };
        new Thread(runnable).start();
    }


    public void iniciar(View vista){
        Button botonStart = findViewById(R.id.button1);
        botonStart.setEnabled(false);

        iniciarChingada();
    }

    int cont = 0;
    public void executea() {

        int puntuacion = 0;

        TextView muestraPuntos = (TextView) findViewById(R.id.textView3);

        for (int i = 0; i < this.nPiezasEnElArray; i++) {
            Pieza pieza = new Pieza((int) (Math.random() * 7 + 1));
            piezas.add(pieza);
        }

        Pieza piezaActual = piezas.get(0);
        piezas.remove(0);
        tablero.actualizarTablero(piezaActual.getCoords(), piezaActual.getColor());
        Pieza pieza = new Pieza((int) (Math.random() * 7 + 1));
        piezas.add(pieza);

        do {

            if (!comprobarInferiores(piezaActual, tablero, reglas)) {
                while(reglas.filaCompleta(this.tablero.getMatrizTablero(), tablero)){
                    puntuacion += 30;
                    muestraPuntos.setText(puntuacion+"");
                }
                piezaActual = piezas.get(0);
                piezas.remove(0);
                tablero.actualizarTablero(piezaActual.getCoords(), piezaActual.getColor());
                Pieza aux = new Pieza((int) (Math.random() * 7 + 1));
                piezas.add(aux);

            }


            long ini = 0;
            long fin = System.currentTimeMillis() + this.timer;

            while (ini < fin) {
                ini = System.currentTimeMillis();

                tablero = this.seleccionarMovimiento(piezaActual, tablero, reglas);
            }


            tablero = this.bajarPieza(piezaActual, tablero, reglas);


            try {
                Thread.sleep(16);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            handler.post(new Runnable() {
                @Override
                public void run() {

                    this.actualizarTablero(tablero.getMatrizTablero());
                    this.cambiarSiguiente(piezas.get(0).getColor());
                }


                private void cambiarSiguiente(int pieza){

                    ImageView aux = (ImageView) findViewById(R.id.siguientePieza);
                    switch(pieza){
                        case 1:
                            aux.setImageResource(R.drawable.piezai);
                            break;
                        case 2:
                            aux.setImageResource(R.drawable.piezat);
                            break;
                        case 3:
                            aux.setImageResource(R.drawable.piezaj);
                            break;
                        case 4:
                            aux.setImageResource(R.drawable.piezal);
                            break;
                        case 5:
                            aux.setImageResource(R.drawable.piezao);
                            break;
                        case 6:
                            aux.setImageResource(R.drawable.piezas);
                            break;
                        case 7:
                            aux.setImageResource(R.drawable.piezaz);
                            break;
                    }

                }


                private void actualizarTablero(int[][] matrizTablero) {
                    int index = 0;

                    for (int i = 4; i<=23; i++){
                        for (int j=0;j<=9;j++){
                            TextView auxiliar  = (TextView)ListaCeldas.get(index);
                            cambiarColor(matrizTablero[i][j],auxiliar);
                            index ++;
                        }
                    }
                }
            });


        } while (this.comprobarInferiores(piezaActual, tablero, reglas) | !reglas.gameOver(piezaActual, tablero.getMatrizTablero()));

    }


    public static void actualizarTablero(int[][] matriz){
        int index = 0;

        for (int i = 4; i<=23; i++){
            for (int j=0;j<=9;j++){
                TextView auxiliar  = (TextView)ListaCeldas.get(index);
                cambiarColor(matriz[i][j],auxiliar);
                index ++;
            }
        }
    }


    public static void cambiarColor(int color, TextView vista){
        switch(color) {
            case 0:
                vista.setBackgroundColor(Color.parseColor("#FFFFFF"));

                break;
            case 1:
                vista.setBackgroundColor(Color.parseColor("#00FFFF"));

                break;
            case 2:
                vista.setBackgroundColor(Color.parseColor("#cc00cc"));

                break;
            case 3:
                vista.setBackgroundColor(Color.parseColor("#0000FF"));

                break;
            case 4:
                vista.setBackgroundColor(Color.parseColor("#FF6600"));

                break;
            case 5:
                vista.setBackgroundColor(Color.parseColor("#FFFF00"));

                break;
            case 6:
                vista.setBackgroundColor(Color.parseColor("#33cc33"));

                break;
            case 7:
                vista.setBackgroundColor(Color.parseColor("#FF0000"));

                break;
        }
    }

}
