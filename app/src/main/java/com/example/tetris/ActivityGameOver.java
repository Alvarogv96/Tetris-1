package com.example.tetris;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityGameOver extends Activity {

    private Button tryAgain;
    private Button verRanking;
    private Button volver;
    private Button añadir;
    private EditText editText;
    private TextView puntuacion;
    private String nombreArchivo = "Ranking.txt";

    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameover);

        this.volver = findViewById(R.id.botonVolver);
        this.tryAgain = findViewById(R.id.botonTryagain);
        this.verRanking = findViewById(R.id.botonVerRanking);
        this.añadir = findViewById(R.id.botonAñadir);
        this.editText = findViewById(R.id.entradaNombre);
        this.puntuacion = findViewById(R.id.textViewPuntuacion);

        this.puntuacion.setText(getIntent().getIntExtra("puntuacion",0)+ " puntos");

    }


    public void volverAlMain(View view){
        finish();
    }


   public void insertarNombre(View view){
        this.volver.setEnabled(true);
        this.tryAgain.setEnabled(true);
        this.verRanking.setEnabled(true);
        this.añadir.setEnabled(false);
        this.editText.setEnabled(false);
    }


    public void jugarDeNuevo(View view){
        finish();
        Intent intent = new Intent(this, ActivityClasico.class);
        startActivity(intent);
    }

    public void verRanking(View view){
        finish();

        Intent intent = new Intent(this, ActivityRanking.class);
        intent.putExtra("puntuacion",getIntent().getIntExtra("puntuacion",0));
        intent.putExtra("datoNuevo",Boolean.TRUE);
        intent.putExtra("nombre",this.editText.getText().toString());
        intent.putExtra("modo",getIntent().getStringExtra("modo"));

        startActivity(intent);
    }
}
