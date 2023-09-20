package com.example.fcca1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.reg) {
            System.out.println("Registered");
            setContentView(R.layout.login);
        }
        else if(view.getId()==R.id.loginButton)
                System.out.println("logged in");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button reg = findViewById(R.id.reg);
        reg.setOnClickListener(this);
    }
    public void login(View view){
        setContentView(R.layout.login);
    }
    public void forgetpasswordpage(View view){
        /*TextView phNo = findViewById(R.id.editPhNo);
        TextView email = findViewById(R.id.editEmail);
        TextView pass = findViewById(R.id.editPassword);
        System.out.println(phNo.getText());
        System.out.println(email.getText());
        System.out.println(pass.getText());*/
        setContentView(R.layout.forgetpassword);
    }


}