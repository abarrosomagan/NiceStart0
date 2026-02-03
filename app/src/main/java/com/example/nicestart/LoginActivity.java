package com.example.nicestart;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        MaterialButton btnLogin = findViewById(R.id.btnLogin);
        TextView tvGoSignup = findViewById(R.id.tvGoSignup);

        Toast.makeText(this, "Login cargado", Toast.LENGTH_SHORT).show();

        tvGoSignup.setOnClickListener(v -> {
            Toast.makeText(this, "Click en registrate", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(LoginActivity.this, SignupActivity.class));
        });

        btnLogin.setOnClickListener(v -> {
            Toast.makeText(this, "Click en login", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
            finish();
        });
    }
}
