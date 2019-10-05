package com.example.tetris;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.LinkedList;
import java.util.List;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // La actividad se crea.


        Juego proceso = new Juego();
        proceso.start();
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
