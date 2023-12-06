package com.example.projectpetcom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class vet2 extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vet2);

        Button addReviewButton = findViewById(R.id.button7);
        Button addReviewButton2 = findViewById(R.id.button8);
        Button homeButton = findViewById(R.id.button13);
        Button prev=findViewById(R.id.button12);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open MainActivity when Home button is clicked
                startActivity(new Intent(vet2.this, MainActivity.class)
                        .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK));
                finish();
            }
        });

        addReviewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open SubmitReviewActivity when Add review button is clicked
                startActivity(new Intent(vet2.this, SubmitReviews.class));
            }
        });
        addReviewButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open SubmitReviewActivity when Add review button is clicked
                startActivity(new Intent(vet2.this, SubmitReviews.class));
            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open SubmitReviewActivity when Add review button is clicked
                startActivity(new Intent(vet2.this, Veterarians.class));
            }
        });

    }
}