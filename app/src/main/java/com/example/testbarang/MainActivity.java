package com.example.testbarang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.testbarang.Database.LihatTeman;
import com.example.testbarang.R;

public class MainActivity extends AppCompatActivity {
    Button tambahbtn,lihatbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tambahbtn = findViewById(R.id.btnInsert);
        lihatbtn = findViewById(R.id.btnSelect);

        lihatbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(MainActivity.this,LihatTeman.class);
                startActivity(intent);

            }
        });
    }
}
