package com.example.tetris;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView modos;
    private List<String> modosDeJuego;
    private int numeroModo;
    private int paleta;

    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.paleta = getIntent().getIntExtra("paleta",0);
        this.modos = findViewById(R.id.vistaModo);

        this.inicializarListaDeModos();

        this.modos.setText(this.modosDeJuego.get(this.numeroModo));
    }

    public void inicializarListaDeModos(){
        this.numeroModo=0;
        this.modosDeJuego = new LinkedList<String>();
        this.modosDeJuego.add("Clasico");
        this.modosDeJuego.add("Modo2");
        this.modosDeJuego.add("Modo3");
    }

    public void ejecutarJuego(View view){
        finish();
        Intent intent = new Intent(this, ActivityJuego.class);
        intent.putExtra("paleta",this.paleta);
        intent.putExtra("modo",this.modosDeJuego.get(this.numeroModo));
        startActivity(intent);
    }

    public void ejecutarOpciones(View view){
        finish();
        Intent intent = new Intent(this, ActivityColores.class);
        intent.putExtra("paleta",this.paleta);
        startActivity(intent);
    }
    
    public void ejecutarSalir(View view){
        this.finish();
    }

    public void anterior(View view){
        if(this.numeroModo>0){
            this.numeroModo--;
            this.modos.setText(this.modosDeJuego.get(this.numeroModo));
        }
    }

    public void siguiente(View view){
        if(this.numeroModo<this.modosDeJuego.size()-1){
            this.numeroModo++;
            this.modos.setText(this.modosDeJuego.get(this.numeroModo));
        }
    }


    public void ejecutarRanking(View view){
        finish();
        Intent intent = new Intent(this, ActivityRanking.class);
        intent.putExtra("datoNuevo",Boolean.FALSE);
        startActivity(intent);
    }

}
