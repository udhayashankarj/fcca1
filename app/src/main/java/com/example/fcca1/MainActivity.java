package com.example.fcca1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onclick(View view){
        TextView fv = findViewById(R.id.fname);
        TextView sv = findViewById(R.id.sname);
        TextView ev = findViewById(R.id.email);
        EditText fe=findViewById(R.id.ettf);
        EditText se=findViewById(R.id.etts);
        EditText ee=findViewById(R.id.ettel);
        fv.setText("First Name: "+fe.getText().toString());
        sv.setText("Second Name: "+se.getText().toString());
        ev.setText("Email: "+ee.getText().toString());
    }
}