package com.example.a1_aksharajsinh_parmar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class TeamRegistrationActivity extends AppCompatActivity {
    private EditText etTeamMember1, etTeamMember2, etTeamMember3;
    private Button btnRegister;
    private String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_registration);

        etTeamMember1 = findViewById(R.id.etTeamMember1);
        etTeamMember2 = findViewById(R.id.etTeamMember2);
        etTeamMember3 = findViewById(R.id.etTeamMember3);
        btnRegister = findViewById(R.id.btnRegister);

        userName = getIntent().getStringExtra("userName");

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeamRegistrationActivity.this, DisplayActivity.class);
                intent.putExtra("userName", userName);
                intent.putExtra("member1", etTeamMember1.getText().toString());
                intent.putExtra("member2", etTeamMember2.getText().toString());
                intent.putExtra("member3", etTeamMember3.getText().toString());
                startActivity(intent);
            }
        });
    }
}
