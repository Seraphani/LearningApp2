package com.seraph.learningapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Carambola extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carambola);

        Button c_reserve_btn = findViewById(R.id.reservation_btn);
        c_reserve_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent link = new Intent(getApplicationContext(), CarambolaReservation.class);
                startActivity(link);
            }
        });

        TextView txt = findViewById(R.id.phone);
        txt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent call_link = new Intent(Intent.ACTION_DIAL);
                call_link.setData(Uri.parse("tel:+18694659090"));
                startActivity(call_link);
            }
        });
    }
}
