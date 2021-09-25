package com.example.foodstreet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    TextView t1,t2;
    ImageView img1;
    String r1,r2,r3,r4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        t1=(TextView)findViewById(R.id.t1);

        t2=(TextView)findViewById(R.id.t2);
        img1=(ImageView)findViewById(R.id.img1);
        r1="Description: \n" +
                "Preheat oven to 350 degrees F.\n" +
                "Sift cake flour into a bowl, then add the baking powder,\n" +
                "baking soda and salt.\n" +
                "Whip butter and sugar until pale and fluffy. \n" +
                "Then mix in the egg and egg whites.\n" +
                "Whisk together the buttermilk, \n" +
                "part of the strawberry puree and vanilla extract.\n" +
                "Add the flour mixture and buttermilk\n" +
                "mixture to the butter mixture \n" +
                "Bake until toothpick \n" +
                "inserted into the center comes out clean.";
        r2="Description: \n" +
                "Beat cake mix, water, eggs, and oil in a\n" +
                "bowl using an electric mixer \n" +
                "on low speed for 30 seconds.\n" +
                "Increase speed to medium and beat for \n" +
                "2 minutes more. Pour batter into the prepared baking\n"+
                "Bake in the preheated oven until a toothpick \n" +
                "inserted in the center comes out clean, 28 to 33 minutes.\n" +
                "Cool completely, at least 1 hour";
        r3="Description: \n" +
                "Cream butter and sugar together until light in colour. Add eggs one at a time, beating well after each addition to combine well.\n" +
                "In a smaller bowl, mix together oil, remaining cocoa powder, red food colouring and vanilla until smooth. Stir colour mixture and vinegar through the creamed sugar mixture to combine.\n" +
                "Sift together flour, baking soda and salt in a separate bowl. Add half of the dry ingredients and half of the buttermilk to the wet ingredients; mix well. Repeat with remaining dry ingredients and buttermilk. ";
        r4="Description: \n" +
                "Make a mixture with tomato yoghurt, puree, green chilli paste, ginger garlic paste, red chilli powder, roasted cumin powder, turmeric powder, garam masala powder, coriander powder and salt.\n" +
                "2. Take the chicken and marinade it in the same mixture. Let it rest for 3-4 hours.\n" +
                "3. Put oil in a pan, heat it and fry onions till they turn golden brown.\n" +
                "4. Now, to this add the marinated chicken and cook the entire mixture for 10 mints.\n" +
                "5. After that in a pressure cooker, take the rice and add 3 1/2 cups of water to it. Also, take the saffron, mix with the milk and add to the rice.";

        String data=getIntent().getStringExtra("rec").toString();





        if(data.contains("cupcake"))
        {
            t1.setText(data);
            img1.setImageResource(R.drawable.cupcake);
            t2.setText(r1);

        }
        if(data.contains("cakeballs"))
        {
            t1.setText(data);
            img1.setImageResource(R.drawable.cakeballs);
            t2.setText(r2);

        }
        if(data.contains("redvelvet"))
        {
            t1.setText(data);
            img1.setImageResource(R.drawable.redvelvet);
            t2.setText(r3);

        }
        if(data.contains("biryani"))
        {
            t1.setText(data);
            img1.setImageResource(R.drawable.biryani);
            t2.setText(r4);

        }


    }
    public void home(View view){

        Intent in = new Intent(Activity3.this,MainActivity.class);
        startActivity(in);

    }
}