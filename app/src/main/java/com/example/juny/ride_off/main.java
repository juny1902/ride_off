package com.example.juny.ride_off;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class main extends AppCompatActivity {
    Button btnRide;
    Button btnOff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnRide = findViewById(R.id.btn_ride);
        btnOff = findViewById(R.id.btn_off);
        btnRide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_Tayo = new Intent(getApplicationContext(), TayoActivity.class);
                startActivity(intent_Tayo);
            }
        });
        btnOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_Off = new Intent(getApplicationContext(), OffActivity.class);
                startActivity(intent_Off);
            }
        });
    }
}
