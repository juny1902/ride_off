package com.example.juny.ride_off;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class TayoActivity extends AppCompatActivity {
    Button btn_search, btn_go_back, btn_tayo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tayo);
        btn_search = findViewById(R.id.btn_search_ride);
        btn_go_back = findViewById(R.id.btn_back_from_ride);
        btn_tayo = findViewById(R.id.btn_ride);

        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btn_go_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btn_tayo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
