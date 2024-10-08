package com.example.a1_aksharajsinh_parmar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class HackathonInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hackathon_info);

        // Initialize TextView for rules
        TextView tvInfo = findViewById(R.id.tvInfo);
        String rules = "1. Teams must consist of up to 4 members.\n" +
                "2. All submissions must be made by the deadline.\n" +
                "3. Projects must be related to the hackathon theme.\n" +
                "4. Each team must present their project.\n" +
                "5. Prizes will be awarded to the top three teams.";
        tvInfo.setText(rules);

        // Button to view prizes
        Button btnPrizes = findViewById(R.id.btnPrizes);
        btnPrizes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HackathonInfoActivity.this, HackathonPrizeActivity.class);
                startActivity(intent);
            }
        });

        // Button to go back to home
        Button btnHome = findViewById(R.id.btnHome);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HackathonInfoActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
