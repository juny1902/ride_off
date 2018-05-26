package com.example.juny.ride_off;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class OffActivity extends AppCompatActivity {
    Button btn_search,btn_go_back,btn_off;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_off);
        btn_search = findViewById(R.id.btn_search_off);
        btn_go_back = findViewById(R.id.btn_back_from_off);
        btn_off = findViewById(R.id.btn_off);
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
        btn_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
