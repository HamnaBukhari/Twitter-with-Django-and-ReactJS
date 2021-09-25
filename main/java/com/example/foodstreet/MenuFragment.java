package com.example.foodstreet;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MenuFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MenuFragment extends Fragment {


    String[] title =new String[]{
            "StrawBerry cake",
            "Cake Balls",
            "Red Velvet Cake",
            "Biryani"
    };
    String[] description =new String[]{
            " Description: \n" +
                    " Preheat oven to 350 degrees F.\n" +
                    "Sift cake flour into a bowl, then add the baking powder,\n" +
                    "baking soda and salt.\n" +
                    "Whip butter and sugar until pale and fluffy. \n " +
                    "Then mix in the egg and egg whites.\n" +
                    "Whisk together the buttermilk, \n " +
                    "part of the strawberry puree and vanilla extract.\n" +
                    "Add the flour mixture and buttermilk\n " +
                    "mixture to the butter mixture \n" +
                    "Bake until toothpick \n " +
                    "inserted into the center comes out clean.",
            "Description: \n" +
                    "Beat cake mix, water, eggs, and oil in a\n" +
                    "bowl using an electric mixer \n " +
                    "on low speed for 30 seconds.\n " +
                    "Increase speed to medium and beat for \n " +
                    "2 minutes more. Pour batter into the prepared baking  \n"+
                    "Bake in the preheated oven until a toothpick \n" +
                    "inserted in the center comes out clean, 28 to 33 minutes.\n " +
                    "Cool completely, at least 1 hour",
            "Description: \n" +
                    "Cream butter and sugar together until light in colour. Add eggs one at a time, beating well after each addition to combine well.\n" +
                    "In a smaller bowl, mix together oil, remaining cocoa powder, red food colouring and vanilla until smooth. Stir colour mixture and vinegar through the creamed sugar mixture to combine.\n" +
                    "Sift together flour, baking soda and salt in a separate bowl. Add half of the dry ingredients and half of the buttermilk to the wet ingredients; mix well. Repeat with remaining dry ingredients and buttermilk. ",
            "Description: \n" +
                    "Make a mixture with tomato yoghurt, puree, green chilli paste, ginger garlic paste, red chilli powder, roasted cumin powder, turmeric powder, garam masala powder, coriander powder and salt.\n" +
                    "2. Take the chicken and marinade it in the same mixture. Let it rest for 3-4 hours.\n" +
                    "3. Put oil in a pan, heat it and fry onions till they turn golden brown.\n" +
                    "4. Now, to this add the marinated chicken and cook the entire mixture for 10 mints.\n" +
                    "5. After that in a pressure cooker, take the rice and add 3 1/2 cups of water to it. Also, take the saffron, mix with the milk and add to the rice."



    };

    int[] pic=new  int[]{

            R.drawable.cupcake,
            R.drawable.cakeballs,
            R.drawable.redvelvet,
            R.drawable.biryani

    };
    ImageView img;
    TextView txt1,des;
    int count=0;
    Button btn1,btn2,btn3;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MenuFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MenuFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MenuFragment newInstance(String param1, String param2) {
        MenuFragment fragment = new MenuFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_menu, container, false);

        img =(ImageView)v.findViewById(R.id.img);
        txt1=(TextView)v.findViewById(R.id.txt1);
        des=(TextView)v.findViewById(R.id.des);
        btn1=(Button)v.findViewById(R.id.btn1);
        btn2=(Button)v.findViewById(R.id.btn2);
        btn3=(Button)v.findViewById(R.id.btn3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                txt1.setText(title[count]);
                img.setImageResource(pic[count]);
                img.setVisibility(view.VISIBLE);
                des.setVisibility(view.GONE);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                des.setText(description[count]);
                img.setVisibility(view.GONE);
                des.setVisibility(view.VISIBLE);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                txt1.setText(title[count]);
                img.setImageResource(pic[count]);
                img.setVisibility(view.VISIBLE);
                des.setVisibility(view.GONE);
            }
        });

        return v;
    }


}