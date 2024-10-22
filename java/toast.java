package com.example.toastexample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button toastButton = findViewById(R.id.toastButton);
        toastButton.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "This is a Toast message", Toast.LENGTH_SHORT).show();
        });
    }
}
