package com.example.hnsg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menuActivity extends AppCompatActivity {

    private Button bt1;
    private Button bt4;
    private Button bt6;
    private Button bt7;
    private Button bt9;
    private Button bt2;
    private Button bt5;
    private Button bt3;
    private Button bt8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        bt1 = findViewById(R.id.bt1);
        bt4 = findViewById(R.id.bt4);
        bt6 = findViewById(R.id.bt6);
        bt7 = findViewById(R.id.bt7);
        bt9 = findViewById(R.id.bt9);
        bt2 = findViewById(R.id.bt2);
        bt5 = findViewById(R.id.bt5);
        bt3 = findViewById(R.id.bt3);
        bt8 = findViewById(R.id.bt8);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = "+555192844726";
                String message = "Olá, estou entrando em contato pelo aplicativo.";

                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:" + phoneNumber));
                intent.setPackage("com.whatsapp");
                intent.putExtra("sms_body", message);
                startActivity(intent);
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menuActivity.this, exameActivity.class);
                startActivity(intent);
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menuActivity.this, epeciaActivity.class);
                startActivity(intent);
            }
        });

        bt6.setOnClickListener(v -> {
            String emailAddress = "ouvidoria@gracas.org.br";
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:" + emailAddress));
            startActivity(intent);
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menuActivity.this, RamaisActivity.class);
                startActivity(intent);
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menuActivity.this, VisitaActivity.class);
                startActivity(intent);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menuActivity.this, HorariosActivity.class);
                startActivity(intent);
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Localização desejada
                String location = "av santos ferreira. 1864, canoas";

                // Substitua espaços em branco por caracteres especiais para o URI
                location = location.replace(" ", "+");

                // URI do Google Maps
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + location);

                // Criando a Intent
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");

                // Verificando se o Google Maps está instalado no dispositivo
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    // Abrindo o Google Maps
                    startActivity(mapIntent);
                }
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menuActivity.this, LogActivity.class);
                startActivity(intent);
            }
        });
    }
}