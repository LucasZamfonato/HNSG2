package com.example.hnsg;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LogActivity extends AppCompatActivity {

    private EditText login, senha;
    private Button bt24;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);

        mAuth = FirebaseAuth.getInstance();

        login = findViewById(R.id.login);
        senha = findViewById(R.id.senha);
        bt24 = findViewById(R.id.bt24);

        bt24.setOnClickListener(v -> {
            String email = login.getText().toString().trim();
            String password = senha.getText().toString().trim();

            // Faz o login no Firebase com email e senha
            mAuth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                // O login foi bem-sucedido
                                Toast.makeText(LogActivity.this, "Login realizado com sucesso",
                                        Toast.LENGTH_SHORT).show();

                                // Redireciona o usuário para a ColaboradorActivity
                                Intent intent = new Intent(LogActivity.this,colaboradorActivity.class);
                                startActivity(intent);


                            } else {
                                // O login falhou
                                Toast.makeText(LogActivity.this, "Falha no login: " + task.getException(),
                                        Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        });
    }
}
