package com.example.taulaperiodica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class JocElements extends AppCompatActivity {

    TextView enunciat;
    int random;
    RadioButton resp1;
    RadioButton resp2;
    RadioButton resp3;
    Button corretgir;
    int puntuacio;
    int fallar;

    int respuesta ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joc_elements);

        enunciat = findViewById(R.id.textEnunciat);
        corretgir = findViewById(R.id.btncorretgir);
        resp1 = findViewById(R.id.resposta1);
        resp2 = findViewById(R.id.resposta2);
        resp3 = findViewById(R.id.resposta3);

        mostrarInfo();


        corretgir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preguntes();


            }
        });


    }

    public void preguntes(){
        int aux=-1;
        fallar=0;

            if (resp1.isChecked()){

                if (resp1.getText().toString().equalsIgnoreCase(MainActivity.elements[respuesta].getSimbol())){

                    puntuacio ++;
                    fallar=1;
                }

            }else{
                if (resp2.isChecked()){

                    if (resp2.getText().toString().equalsIgnoreCase(MainActivity.elements[respuesta].getSimbol())){

                        puntuacio ++;
                        fallar=2;
                    }
                }else{

                    if (resp3.isChecked()){

                        if (resp3.getText().toString().equalsIgnoreCase(MainActivity.elements[respuesta].getSimbol())){

                            puntuacio ++;
                            fallar=3;
                        }
                    }
                }
            }


            if (fallar != 0){
                Toast.makeText(JocElements.this,"Molt be!! element encertat!!", Toast.LENGTH_SHORT).show();
            }else{

                if (fallar==0){
                    Toast.makeText(JocElements.this,"Has fallat!!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent (JocElements.this,MainActivity.class);
                    startActivity(intent);
                }


            }
        mostrarInfo();
    }


    public void mostrarInfo(){
        respuesta= (int) (Math.random()*116+0);
        int norepit = (int) (Math.random()*3+1);
        String enunciat2 = "sel·lecciona el símbol d'aquest element:" + MainActivity.elements[respuesta].getNom();

        enunciat.setText(enunciat2);

        if (norepit == 1){

            resp1.setText(MainActivity.elements[respuesta].getSimbol());
            resp2.setText(MainActivity.elements[(int) (Math.random()*116+0)].getSimbol());
            resp3.setText(MainActivity.elements[(int) (Math.random()*116+0)].getSimbol());

        }else{
            if (norepit == 2){

                resp1.setText(MainActivity.elements[(int) (Math.random()*116+0)].getSimbol());
                resp2.setText(MainActivity.elements[respuesta].getSimbol());
                resp3.setText(MainActivity.elements[(int) (Math.random()*116+0)].getSimbol());

            }else {
                if (norepit == 3){

                    resp1.setText(MainActivity.elements[(int) (Math.random()*116+0)].getSimbol());
                    resp2.setText(MainActivity.elements[(int) (Math.random()*116+0)].getSimbol());
                    resp3.setText(MainActivity.elements[respuesta].getSimbol());

                }
            }
        }
    }







}