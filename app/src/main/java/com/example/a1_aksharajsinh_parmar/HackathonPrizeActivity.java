package com.example.a1_aksharajsinh_parmar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class HackathonPrizeActivity extends AppCompatActivity {
    private TextView tvPrizes;
    private Button btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hackathon_prize);

        tvPrizes = findViewById(R.id.tvPrizes);
        btnHome = findViewById(R.id.btnHome);

        // Set the prizes information
        tvPrizes.setText("1st Place: $500\n2nd Place: $300\n3rd Place: $100");

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HackathonPrizeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
