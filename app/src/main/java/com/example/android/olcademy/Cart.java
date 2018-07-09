package com.example.android.olcademy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Cart extends AppCompatActivity {

    RecyclerView recyclerView;

    String[] productDescription={"JBL Ear phone","Puma Slippers","Wildcraft Bag","Samsung Tv"};
    int[] imageUrl = new int[]{R.drawable.ear, R.drawable.slippers,R.drawable.bag,R.drawable.tv};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_adapter);

        recyclerView=(RecyclerView)findViewById(R.id.cart_recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Cartadapter(productDescription,imageUrl,this));
    }
}
