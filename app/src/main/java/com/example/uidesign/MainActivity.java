package com.example.uidesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView topimg, bottomimg, middleimg, playimg;
    TextView titletxt, desctext, starttxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topimg=findViewById(R.id.toprounded);
        bottomimg=findViewById(R.id.btmdesign);
        middleimg=findViewById(R.id.topimage);
        playimg=findViewById(R.id.playbutton);


        titletxt=findViewById(R.id.txttitle);
        desctext=findViewById(R.id.txtdesc);

        //add onClick listener on the start text
        starttxt=findViewById(R.id.txtstart);
        starttxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), loginscreen.class);
                startActivity(intent);
                finish();
            }
        });
    }
}