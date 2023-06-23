package com.example.hnsg;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RamaisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ramais);

        Button bt12 = findViewById(R.id.bt12);
        bt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = "tel:05121021000";
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse(numero));
                startActivity(intent);
            }
        });
    }
}