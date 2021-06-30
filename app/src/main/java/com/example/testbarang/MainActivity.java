package com.example.testbarang;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.testbarang.Database.TambahTeman;

public class MainActivity extends AppCompatActivity {
    Button tambahbtn,lihatbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tambahbtn = findViewById(R.id.btnInsert);
        lihatbtn = findViewById(R.id.btnSelect);

        tambahbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(MainActivity.this, TambahTeman.class);
                startActivity(intent);
            }
        });

        lihatbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(MainActivity.this, LihatTeman.class);
                startActivity(intent);

            }
        });
    }
}

