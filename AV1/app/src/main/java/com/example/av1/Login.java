package com.example.av1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    TextView login,senha;
    Button  acessar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = findViewById(R.id.editTextLogin);
        senha = findViewById(R.id.editTextSenha);
        acessar = findViewById(R.id.buttonAcessar);

        acessar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent proximo  = new Intent(Login.this,MainActivity.class);
                startActivity(proximo);

            }
        });


    }
}
