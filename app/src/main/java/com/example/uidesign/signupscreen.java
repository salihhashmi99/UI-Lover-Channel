package com.example.uidesign;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class signupscreen extends AppCompatActivity {
    ImageView imgview;
    EditText edtName, edtEmail, edtPassword, edtConfirmPassword;
    Button btnSignUp;
    TextView txtLogin;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signupscreen);

        imgview=findViewById(R.id.imgplaybtn);

        edtName=findViewById(R.id.edtname);
        edtEmail=findViewById(R.id.edtemail);
        edtPassword=findViewById(R.id.edtpassword);
        edtConfirmPassword=findViewById(R.id.edtconfirm);

        //Add onCLick listener on the SignUp button
        btnSignUp=findViewById(R.id.btnSignup);
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), loginscreen.class);
                startActivity(intent);
                finish();
            }
        });

        //Add onClick listener on the Login text
        txtLogin=findViewById(R.id.txtLogIn);
        txtLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), loginscreen.class);
                startActivity(intent);
                finish();
            }
        });


    }
}