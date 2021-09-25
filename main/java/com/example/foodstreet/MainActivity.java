package com.example.foodstreet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    TextView txt1,des,name,t1l2,eid;
    ImageView img;
    Button btn,b1;
    int count=0;
    RelativeLayout ll2;
    LinearLayout linearLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // eid=(TextView)findViewById(R.id.e1);
        ll2=(RelativeLayout)findViewById(R.id.ll2);
        t1l2=(TextView)findViewById(R.id.t1l2);
        b1=(Button)findViewById(R.id.b1);
        linearLayout=(LinearLayout)findViewById(R.id.linearLayout);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                loadFragment(new Fragment1());
                linearLayout.setVisibility(View.INVISIBLE);

            }
        });



    }

    private void loadFragment(Fragment fragment){
        FragmentManager fm=getFragmentManager();
        androidx.fragment.app.FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,fragment);
        fragmentTransaction.commit();


    }


    /*public void edit(View view)
    {
        Intent in = new Intent(MainActivity.this,MainActivity.class);
        startActivity(in);

    }*/
    public void home(View view){

        Intent in = new Intent(MainActivity.this,MainActivity.class);
        startActivity(in);

    }


}
