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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ActivityRanking extends Activity{

    private final String rutaFichero = "RankingTetris.txt";
    private final int apartadosRanking = 10;
    private TextView textViewRanking;

    @SuppressLint("ResourceType")
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);

        this.textViewRanking = findViewById(R.id.textViewRanking);

        try {
            ranking();
        } catch (FileNotFoundException e) {

        }

    }


    public void volverAlMenu(View view){
        finish();
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }


    private boolean existeFichero(){
        File fichero = new File(this.rutaFichero);
        return fichero.exists();
    }


    private void crearFichero(){
        try{
            openFileOutput(this.rutaFichero, Context.MODE_PRIVATE);
        }catch (IOException e){

        }

    }

    public List<DatosRanking> pasarListaDato(List<String> listaRanking){

        String nombre;
        String modo;
        String puntuacion;
        List<DatosRanking> datosRankings = new ArrayList<>();

        for(String aux:listaRanking){

            nombre = aux.substring(aux.lastIndexOf("/"));
            aux = aux.substring(aux.lastIndexOf("/",aux.length()));
            modo = aux.substring(aux.lastIndexOf("/"));
            aux = aux.substring(aux.lastIndexOf("/",aux.length()));
            puntuacion = aux.substring(aux.lastIndexOf("/"));
            aux = aux.substring(aux.lastIndexOf("/",aux.length()));

            DatosRanking datos = new DatosRanking(nombre,Integer.getInteger(modo),Integer.getInteger(puntuacion));
            datosRankings.add(datos);
        }

        return datosRankings;

    }


    private List<DatosRanking> añadirPartida() throws IOException{
        DatosRanking datos = new DatosRanking(getIntent().getStringExtra("nombre"),getIntent().getIntExtra("modo",0),getIntent().getIntExtra("puntuacion",0));

        String aux;
        List<String> listaRanking = new ArrayList<>();


        try{
            BufferedReader buffer = (new BufferedReader( new InputStreamReader(openFileInput(this.rutaFichero))));

            while((aux = buffer.readLine()) != null){
                listaRanking.add(aux);
            }

            buffer.close();



        }catch(IOException e){

        }

         List<DatosRanking> datosRankings = pasarListaDato(listaRanking);

        datosRankings.add(datos);

        Collections.sort(datosRankings, new Comparator<DatosRanking>() {
            @Override
            public int compare(DatosRanking o1, DatosRanking o2) {
                return Integer.compare(o1.puntuacion,o2.puntuacion);
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
                aux.concat(" ");
            }
        }
        else if(aux.length()>espacios){
            aux.substring(0,espacios-1);
        }

        return aux;
    }

    public void mostrarEnActividad(List<DatosRanking> datosRanking){
        String linea ="";
        for(DatosRanking aux:datosRanking){
            linea = meteEspacios(aux.getNombre(),20);
            linea.concat(meteEspacios(aux.modo,10));
            linea.concat(meteEspacios(String.valueOf(aux.puntuacion),10));
            linea.concat("\n");

        }
        this.textViewRanking.setText(linea);
    }


    public void guardarFichero(List<DatosRanking> datosRankings){

        String linea = "";
        FileOutputStream outputStream;
        try{
            outputStream = openFileOutput(this.rutaFichero, Context.MODE_PRIVATE);

            for(DatosRanking aux:datosRankings){
                linea.concat(aux.nombre + "/");
                linea.concat(aux.modo + "/");
                linea.concat(aux.puntuacion + "\n");

                outputStream.write(linea.getBytes());
                linea = "";
            }
            outputStream.close();

        }catch(IOException e){

        }

    }


    private void ranking() throws FileNotFoundException {
        if(!existeFichero()){
            crearFichero();
        }

        List<DatosRanking> datosRankings = null;
        try {
            datosRankings = añadirPartida();
        } catch (IOException e) {
            e.printStackTrace();
        }
        mostrarEnActividad(datosRankings);
        guardarFichero(datosRankings);
    }


    private class DatosRanking{
        private String nombre;
        private String modo;
        private  int puntuacion;

        public DatosRanking(String nombre, int modo, int puntuacion){
            this.nombre = nombre;
            this.puntuacion = puntuacion;

            switch (modo){
                case 0:
                    this.modo = "Clasico";
                    break;
                case 1:
                    this.modo = "Modo1";
                    break;
                case 2:
                    this.modo = "Modo2";
                    break;
                default:
                    this.modo = "Error";
                    break;
            }


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
