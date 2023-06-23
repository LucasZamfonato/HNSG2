package com.example.hnsg;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hnsg.R;

public class colaboradorActivity extends AppCompatActivity {

    private Button whatsappButton;
    private Button emailButton;
    private Button browserButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colaborador);

        whatsappButton = findViewById(R.id.w1);
        emailButton = findViewById(R.id.em1);
        browserButton = findViewById(R.id.cc1);

        whatsappButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWhatsApp();
            }
        });

        emailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendEmail();
            }
        });

        browserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(colaboradorActivity.this, ccActivity.class);
                startActivity(intent);
            }
        });
    }

    private void openWhatsApp() {
        String phoneNumber = "+5551992091521";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://api.whatsapp.com/send?phone=" + phoneNumber));
        startActivity(intent);
    }

    private void sendEmail() {
        String emailAddress = "rh@gracas.org.br";
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:" + emailAddress));
        startActivity(intent);
    }
}
