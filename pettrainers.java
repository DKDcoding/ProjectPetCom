package com.example.projectpetcom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pettrainers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pettrainers);

        Button addReviewButton = findViewById(R.id.button7);
        Button addReviewButton2 = findViewById(R.id.button8);
        Button homeButton = findViewById(R.id.button13);
        Button serve=findViewById(R.id.button10);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open MainActivity when Home button is clicked
                startActivity(new Intent(pettrainers.this, MainActivity.class)
                        .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK));
                finish();
            }
        });

        addReviewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open SubmitReviewActivity when Add review button is clicked
                startActivity(new Intent(pettrainers.this, SubmitReviews.class));
            }
        });
        addReviewButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open SubmitReviewActivity when Add review button is clicked
                startActivity(new Intent(pettrainers.this, SubmitReviews.class));
            }
        });

        serve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open SubmitReviewActivity when Add review button is clicked
                startActivity(new Intent(pettrainers.this, Task3.class));
            }
        });
    }

}