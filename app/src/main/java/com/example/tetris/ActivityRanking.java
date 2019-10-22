package com.example.tetris;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ActivityRanking extends Activity{

    private final String rutaFichero = "RankingTetris.txt";
    private final int apartadosRanking = 10;

    private TextView textViewRankingNombre;
    private TextView textViewRankingModo;
    private TextView textViewRankingPuntuacion;

    private boolean datoNuevo;

    @SuppressLint("ResourceType")
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);

        //this.textViewRanking = findViewById(R.id.textViewRanking);
        this.textViewRankingNombre = findViewById(R.id.textViewRanking1);
        this.textViewRankingModo = findViewById(R.id.textViewRanking2);
        this.textViewRankingPuntuacion = findViewById(R.id.textViewRanking3);

        this.datoNuevo = getIntent().getBooleanExtra("datoNuevo",Boolean.FALSE);

        try {
            ranking();
        } catch (IOException e) {

        }
    }


    public void volverAlMenu(View view){
        finish();
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }


    public List<DatosRanking> pasarListaDato(List<String> listaRanking){

        String nombre;
        String modo;
        String puntuacion;
        List<DatosRanking> datosRankings = new ArrayList<>();

        for(String aux:listaRanking){

            nombre = aux.substring(0,aux.indexOf("/"));
            aux = aux.substring(aux.indexOf("/")+1);
            modo = aux.substring(0,aux.indexOf("/"));
            aux = aux.substring(aux.indexOf("/")+1);
            puntuacion = aux.substring(0);

            DatosRanking datos = new DatosRanking(nombre,modo,Integer.parseInt(puntuacion));
            datosRankings.add(datos);
        }

        return datosRankings;

    }


    private List<DatosRanking> añadirPartida(){

        String aux;
        List<String> listaRanking = new ArrayList<>();

        try{
            BufferedReader buffer =
                    new BufferedReader(
                            new InputStreamReader(
                                    openFileInput(this.rutaFichero)));


            while((aux = buffer.readLine()) != null){
                listaRanking.add(aux);
            }

            buffer.close();

        }catch(Exception e){

        }


        List<DatosRanking> datosRankings = pasarListaDato(listaRanking);

        if(this.datoNuevo){
            String nombre = getIntent().getStringExtra("nombre");
            String modo = getIntent().getStringExtra("modo");
            int puntuacion = getIntent().getIntExtra("puntuacion",0);


            DatosRanking datos = new DatosRanking(nombre,modo,puntuacion);
            datosRankings.add(datos);
        }


        Collections.sort(datosRankings, new Comparator<DatosRanking>() {
            @Override
            public int compare(DatosRanking o1, DatosRanking o2) {
                return Integer.compare(o2.puntuacion,o1.puntuacion);
            }
        });


        if(datosRankings.size()>this.apartadosRanking){
            datosRankings.remove(datosRankings.size()-1);
        }


        return datosRankings;
    }

    public String meteEspacios(String aux, int espacios){
        if(aux.length()<espacios){
            for(int i=aux.length();i<espacios;i++){
                aux = aux + " ";
            }
        }
        else if(aux.length()>espacios){
            aux = aux.substring(0,espacios-1);
        }

        aux = aux + " ";

        return aux;
    }

    public void mostrarEnActividad(List<DatosRanking> datosRanking){

        String text1 = "";
        String text2 = "";
        String text3 = "";


        text1 = meteEspacios("Nombre",15) + "\n";
        text2 = meteEspacios("Modo",10) + "\n";
        text3 = meteEspacios("Puntuación",10) + "\n";


        for(DatosRanking aux:datosRanking){

            text1 = text1 + meteEspacios(aux.getNombre(),15) + "\n";

            text2 = text2 + meteEspacios(aux.getModo(),10) + "\n";

            text3 = text3 + aux.puntuacion + "\n";

        }

        this.textViewRankingNombre.setText(text1);
        this.textViewRankingModo.setText(text2);
        this.textViewRankingPuntuacion.setText(text3);
    }


    public void guardarFichero(List<DatosRanking> datosRankings){

        String linea = "";

        try{

            OutputStreamWriter writer =
                    new OutputStreamWriter(
                            openFileOutput(this.rutaFichero,Context.MODE_PRIVATE));

            for(DatosRanking aux:datosRankings){
                linea = (aux.nombre + "/" + aux.modo + "/" + aux.puntuacion + "\n");

                writer.write(linea);

                linea = "";
            }

            writer.flush();
            writer.close();

        }catch(Exception e){

        }

    }


    private void ranking() throws IOException {


        List<DatosRanking> datosRankings = null;
        datosRankings = añadirPartida();
        mostrarEnActividad(datosRankings);
        guardarFichero(datosRankings);



    }


    private class DatosRanking{
        private String nombre;
        private String modo;
        private  int puntuacion;

        public DatosRanking(String nombre, String modo, int puntuacion){
            this.nombre = nombre;
            this.puntuacion = puntuacion;
            this.modo = modo;



        }

        public String getNombre(){
            return this.nombre;
        }

        public String getModo(){
            return this.modo;
        }

        public int getPuntuacion(){
            return this.puntuacion;
        }

    }

}
