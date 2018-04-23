package com.example.ayshidebnath.loginc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.widget.CardView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText Name;
    private EditText Password;

    private Button Login;
    private TextView Me;
    private ImageView user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Name = (EditText) findViewById(R.id.etName);
        Password = (EditText) findViewById(R.id.etPassword);

        Login = (Button) findViewById(R.id.btnLogin);
        Me = (TextView) findViewById(R.id.me);
        user = (ImageView) findViewById(R.id.logo);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Name.getText().toString().equals("Shayla") && Password.getText().toString().equals("1234")) {

                    Intent i = new Intent("com.example.ayshidebnath.loginc.SecondActivity");
                    startActivity(i);
                }
                else {
      Toast.makeText(getApplicationContext(), "Username or Password is Incorrect!!!", Toast.LENGTH_SHORT).show();
  }
            }
        });

    }

}