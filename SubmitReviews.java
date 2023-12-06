package com.example.projectpetcom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class SubmitReviews extends AppCompatActivity {



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_submit_reviews);

            Button homeButton = findViewById(R.id.button13);
            Button submitButton = findViewById(R.id.button9);

            homeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Open MainActivity when Home button is clicked
                    startActivity(new Intent(SubmitReviews.this, MainActivity.class)
                            .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK));
                    finish();
                }
            });

            submitButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Get the review text and rating from the input fields
                    String reviewText = ((TextInputEditText) findViewById(R.id.textInputEditText2)).getText().toString();
                    String rating = ((TextInputEditText) findViewById(R.id.textInputEditText)).getText().toString();

                    // Perform submission actions here (e.g., send data to server, save locally, etc.)

                    // Example: Display a toast message with the review text and rating
                    Toast.makeText(SubmitReviews.this, "Review: " + reviewText + "\nRating: " + rating, Toast.LENGTH_SHORT).show();
                }
            });

            Button submit = findViewById(R.id.button9);

            submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Open SubmittedActivity when Submit button is clicked
                    startActivity(new Intent(SubmitReviews.this, Sumitted.class));
                }
            });
        }
    }

