package com.example.sharedpreferencesexample;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText inputText;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = findViewById(R.id.inputText);
        Button saveButton = findViewById(R.id.saveButton);
        Button loadButton = findViewById(R.id.loadButton);

        sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);

        saveButton.setOnClickListener(v -> {
            String text = inputText.getText().toString();
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("savedText", text);
            editor.apply();
            Toast.makeText(MainActivity.this, "Saved", Toast.LENGTH_SHORT).show();
        });

        loadButton.setOnClickListener(v -> {
            String savedText = sharedPreferences.getString("savedText", "No data found");
            inputText.setText(savedText);
            Toast.makeText(MainActivity.this, "Loaded: " + savedText, Toast.LENGTH_SHORT).show();
        });
    }
}
