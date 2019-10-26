package com.example.tetris;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
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
        this.modosDeJuego.add("Piece Madness");
        this.modosDeJuego.add("Color Party");
    }

    public void ejecutarJuego(View view){
        finish();

        Intent intent;

        switch(this.modosDeJuego.get(this.numeroModo)){
            case "Clasico":
                intent = new Intent(this, ActivityClasico.class);
                break;
            case "Piece Madness":
                intent = new Intent(this, ActivityPieceMadness.class);
                break;
            case "Color Party":
                intent = new Intent(this, ActivityColorParty.class);
                break;
            default:
                intent = new Intent(this, ActivityClasico.class);
        }


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
