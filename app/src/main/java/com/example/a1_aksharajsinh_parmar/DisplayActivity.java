package com.example.a1_aksharajsinh_parmar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity {
    private TextView tvDisplay;
    private Button btnGotcha, btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        tvDisplay = findViewById(R.id.tvDisplay);
        btnGotcha = findViewById(R.id.btnGotcha);
        btnHome = findViewById(R.id.btnHome);

        String userName = getIntent().getStringExtra("userName");
        String member1 = getIntent().getStringExtra("member1");
        String member2 = getIntent().getStringExtra("member2");
        String member3 = getIntent().getStringExtra("member3");

        tvDisplay.setText("User: " + userName + "\nTeam Members: " + member1 + ", " + member2 + ", " + member3);

        btnGotcha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DisplayActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DisplayActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
