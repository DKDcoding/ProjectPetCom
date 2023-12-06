package com.example.projectpetcom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button6 = findViewById(R.id.button6);

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open Task3Activity when Button6 is clicked
                startActivity(new Intent(MainActivity.this, Task3.class));
            }
        });
    }
}