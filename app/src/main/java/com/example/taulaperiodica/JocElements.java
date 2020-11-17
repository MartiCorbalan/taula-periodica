package com.example.taulaperiodica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;

public class JocElements extends AppCompatActivity {

    TextView enunciat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joc_elements);

        enunciat = findViewById(R.id.textEnunciat);

        preguntes();

        RadioButton resp1;
        RadioButton resp2;
        RadioButton resp3;

        resp1 = findViewById(R.id.resposta1);
        resp2 = findViewById(R.id.resposta2);
        resp3 = findViewById(R.id.resposta3);

        resp1.setText(MainActivity.elements[(int) (Math.random()*116+0].getSimbol());


    }

    public void preguntes(){

        int respuesta = (int) (Math.random()*116+0);
        int Inrepetitivo = (int) (Math.random()*3+0);
        String enunciat2 = "sel·lecciona el símbol d'aquest element:" + MainActivity.elements[respuesta].getNom();

        enunciat.setText(enunciat2);







    }
}