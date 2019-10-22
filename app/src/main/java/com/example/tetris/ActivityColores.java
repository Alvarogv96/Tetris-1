package com.example.tetris;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ActivityColores extends AppCompatActivity {

    private List<String> listaPaletas;
    private int numeroPaleta;
    private TextView mostrarPaleta;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colores);

        this.numeroPaleta =  getIntent().getIntExtra("paleta",0);

        this.mostrarPaleta = findViewById(R.id.vistaModo);

        this.iniciarListaPaletas();

        this.mostrarPaleta.setText(this.listaPaletas.get(this.numeroPaleta));

    }

    private void iniciarListaPaletas(){
        this.listaPaletas = new ArrayList<>();
        this.listaPaletas.add("Original");
        this.listaPaletas.add("Roja");
        this.listaPaletas.add("Azul");
        this.listaPaletas.add("Verde");
    }

    public void anterior(View view){
        if(this.numeroPaleta>0){
            this.numeroPaleta--;
        }else{
            this.numeroPaleta = this.listaPaletas.size()-1;
        }

        this.mostrarPaleta.setText(this.listaPaletas.get(this.numeroPaleta));
    }

    public void siguiente(View view){
        if(this.numeroPaleta<this.listaPaletas.size()-1){
            this.numeroPaleta++;
            this.mostrarPaleta.setText(this.listaPaletas.get(this.numeroPaleta));
        }
        else{
            this.numeroPaleta = 0;
        }
        this.mostrarPaleta.setText(this.listaPaletas.get(this.numeroPaleta));
    }

    public void cambiarMain(View view){
        finish();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("paleta",numeroPaleta);
        startActivity(intent);
    }


}
