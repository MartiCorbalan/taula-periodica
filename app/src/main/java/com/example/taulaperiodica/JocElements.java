package com.example.taulaperiodica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class JocElements extends AppCompatActivity {

    TextView enunciat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joc_elements);

        enunciat = findViewById(R.id.textEnunciat);


    }
}