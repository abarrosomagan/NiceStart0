package com.example.nicestart;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        MaterialButton btnCreateAccount = findViewById(R.id.btnCreateAccount);
        TextView tvGoLogin = findViewById(R.id.tvGoLogin);

        btnCreateAccount.setOnClickListener(v -> {
            startActivity(new Intent(SignupActivity.this, MainActivity.class));
            finish();
        });

        tvGoLogin.setOnClickListener(v -> finish());
    }
}
