package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText username, password;
    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.etUsername);
        password = findViewById(R.id.etPassword);
        Login = findViewById(R.id.btnLogin);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("admin")
                        && password.getText().toString().equals("admin")){

                    Toast.makeText(LoginActivity.this, "Login Successful",
                            Toast.LENGTH_SHORT).show();
                }else{

                    Toast.makeText(LoginActivity.this, "Login Failed",
                            Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}