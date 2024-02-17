package com.namans.kinghills;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private double calculatedAmount;
    private TextView amountTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_main);
       // amountTextView = findViewById(R.id.amountTextView);

        // Calculate the amount to be paid (assuming you've calculated it somewhere in your code)
        calculatedAmount = calculateAmountToBePaid();

        // Set the calculated amount to the TextView
        amountTextView.setText("Amount to be paid: Rs" + calculatedAmount);
    }

    private double calculateAmountToBePaid() {
        // Calculation
        return 100.00;
    }
}

