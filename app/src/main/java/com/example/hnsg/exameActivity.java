package com.example.hnsg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class exameActivity extends AppCompatActivity {

    WebView wv2;
    String url;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cc);

        url="http://laudos.gracas.org.br:8081/laudos/";

        wv2=findViewById(R.id.wv);
        wv2.loadUrl(url);
    }
}