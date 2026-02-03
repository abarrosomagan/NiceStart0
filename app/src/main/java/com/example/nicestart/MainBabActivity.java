package com.example.nicestart;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.material.appbar.MaterialToolbar;

public class MainBabActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_bab);

        MaterialToolbar topAppBarBab = findViewById(R.id.topAppBarBab);

        // Botón volver (flecha izquierda)
        topAppBarBab.setNavigationOnClickListener(v -> finish());
    }
}
