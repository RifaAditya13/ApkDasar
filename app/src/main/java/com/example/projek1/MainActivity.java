package com.example.projek1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView ucapan = (TextView) findViewById(R.id.txtUcapan);
        Button pagi = (Button) findViewById(R.id.btnPagi);
        Button siang = (Button) findViewById(R.id.btnSiang);
        Button malam = (Button) findViewById(R.id.btnMalam);

        pagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ucapan.setText("Selamat Pagi");
            }
        });
        siang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ucapan.setText("Selamat Siang");
            }
        });
        malam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ucapan.setText("Selamat Malam");
            }
        });
    }
}