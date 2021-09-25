package com.example.foodstreet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        et=(EditText)findViewById(R.id.e1);

    }

    public void home(View view){

        Intent in = new Intent(MainActivity2.this,MainActivity.class);
        startActivity(in);

    }
    public void go(View view){

        String sen=et.getText().toString();
        Intent in = new Intent(MainActivity2.this,Activity3.class);
        in.putExtra("rec",sen);
        startActivity(in);


    }
}