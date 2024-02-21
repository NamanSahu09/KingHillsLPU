package com.namans.kinghillslpu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.namans.MapsActivity;

public class MainActivity extends AppCompatActivity {
    private double calculatedAmount;
    private TextView amountTextView;

    private int quantity = 0;
    private int costPerItem = 10;
    private TextView quantityTextView;
    private TextView totalCostTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find views by their IDs
        amountTextView = findViewById(R.id.amountTextView);
        quantityTextView = findViewById(R.id.quantityTextView);
        totalCostTextView = findViewById(R.id.totalCostTextView);
        Button incrementButton = findViewById(R.id.incrementButton);
        Button decrementButton = findViewById(R.id.decrementButton);

        // Set initial values
        updateQuantityTextView();
        updateTotalCostTextView();

        // Set click listeners for buttons
        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementQuantity();
            }
        });

        decrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrementQuantity();
            }
        });

        // Calculate the amount to be paid after initializing quantity
        //calculatedAmount = calculateAmountToBePaid();

        // Set the calculated amount to the TextView
      //  amountTextView.setText("Amount to be paid: Rs " + String.format("%.2f", calculatedAmount));
    }
    // Override onBackPressed to navigate back to MapsActivity
    @Override
    public void onBackPressed() {
        super.onBackPressed(); // Call super method first
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
        finish(); // Finish the current activity so that it's removed from the back stack
    }


    private void incrementQuantity() {
        quantity++;
        updateQuantityTextView();
        updateTotalCostTextView();
    }

    private void decrementQuantity() {
        if (quantity > 0) {
            quantity--;
            updateQuantityTextView();
            updateTotalCostTextView();
        }
    }

    private void updateQuantityTextView() {
        quantityTextView.setText("Quantity: " + quantity);
    }

    private void updateTotalCostTextView() {
        double totalCost = (quantity * costPerItem);
        double s = 15.00;
        totalCostTextView.setText("Cost: Rs " + (totalCost));
        amountTextView.setText("Amount to be paid: Rs " + String.format("%.2f", (s+totalCost)));

    }





    }
