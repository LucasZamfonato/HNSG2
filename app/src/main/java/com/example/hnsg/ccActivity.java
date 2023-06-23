package com.example.hnsg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class ccActivity extends AppCompatActivity {

    WebView wv1;
    String url;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cc);

        url="http://portal.gracas.org.br/rubiweb/";

        wv1=findViewById(R.id.wv);
        wv1.loadUrl(url);
    }
}