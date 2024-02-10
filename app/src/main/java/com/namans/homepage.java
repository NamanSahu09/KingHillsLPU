package com.namans;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import com.namans.kinghillslpu.R;

public class homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        Button continueWithPhoneButton = findViewById(R.id.continueWithPhoneButton1);
        continueWithPhoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the next activity
                Intent intent = new Intent(homepage.this, LoginOTP.class);
                startActivity(intent);
            }
        });

    }
}