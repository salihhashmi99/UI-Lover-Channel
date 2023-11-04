package com.example.uidesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class loginscreen extends AppCompatActivity {
    ImageView imgView;
    EditText edtEmail, edtPassword;
    Button btnLogin;
    TextView txtforget, txtsignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginscreen);

        imgView=findViewById(R.id.imgplaybtn);
        edtEmail=findViewById(R.id.edtemail);
        edtPassword=findViewById(R.id.edtpassword);

        txtforget=findViewById(R.id.txtforgetpassword);

        //add onClick Listener on the btnSign
        txtsignup=findViewById(R.id.txtSignUp);
        txtsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), signupscreen.class);
                startActivity(intent);
                finish();
            }
        });

        //add onClick listener on the btn Login
        btnLogin=findViewById(R.id.btnSignup);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), homescreen.class);
                startActivity(intent);
                finish();
            }
        });


    }
}