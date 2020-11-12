package com.example.taulaperiodica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InfoElemetns extends AppCompatActivity {

    TextView InfoNom;
    TextView InfoNumero;
    TextView InfoSimbol;
    TextView InfoPes;
    TextView InfoPesAtomic;
    TextView InfoLink;
    Button enviarInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_elemetns);

        InfoNom = findViewById(R.id.InfoNom);
        InfoNumero = findViewById(R.id.InfoNumero);
        InfoSimbol = findViewById(R.id.InfoSimbol);
        InfoPes = findViewById(R.id.InfoPes);
        InfoPesAtomic = findViewById(R.id.InfoPesAtomic);
        InfoLink = findViewById(R.id.InfoLink);
        enviarInfo = findViewById(R.id.enviarInfo);

        Bundle bundle = getIntent().getExtras();
        final String [] rebreInfo = bundle.getStringArray("1234");
        InfoNom.setText(rebreInfo[0]);
        InfoNumero.setText(rebreInfo[1]);
        InfoSimbol.setText(rebreInfo[2]);
        InfoPes.setText(rebreInfo[3]);
        InfoPesAtomic.setText(rebreInfo[4]);
        InfoLink.setText(rebreInfo[5]);

        InfoLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(InfoLink.getText().toString()));
                startActivity(i);
            }
        });

        enviarInfo.setOnClickListener(v -> {
            Intent compartir = new Intent(android.content.Intent.ACTION_SEND);
            compartir.setType("text/plain");
            String mensaje = "Element: "+rebreInfo[0]+" \nSimbol: "+rebreInfo[1]+" \nPes atomic: "+rebreInfo[2]+" \nNumero Atomic: "+rebreInfo[3]+ "\nPes del element: "+rebreInfo[4]+" \n+Info: "+rebreInfo[5];
            compartir.putExtra(android.content.Intent.EXTRA_TEXT, mensaje);
            startActivity(Intent.createChooser(compartir, ""));
        });

    }
}