package com.example.android.olcademy;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



/**
 * Created by Manish on 7/8/2018.
 */

public class Cartadapter extends RecyclerView.Adapter<Cartadapter.CartViewHolder> {

    String[] productDescription;
    int[] imageUrl;
    Context context;

    public Cartadapter(String[] productDescription,int[] imageUrl, Context context ){
        this.productDescription=productDescription;
        this.imageUrl=imageUrl;
        this.context=context;

    }

    @Override
    public CartViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.cart_layout,parent,false);
        return new CartViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CartViewHolder holder, int position) {
        String title=productDescription[position];
        holder.productDes.setText(title);

        holder.productImageView.setImageResource(imageUrl[position]);
    }

    @Override
    public int getItemCount() {
        return productDescription.length;
    }

    public class CartViewHolder extends RecyclerView.ViewHolder{
        ImageView productImageView;
        TextView productDes;
        TextView order;

        public CartViewHolder(View itemView) {
            super(itemView);
            productImageView=itemView.findViewById(R.id.product_image);
            productDes=(TextView)itemView.findViewById(R.id.product_des);
            order=(TextView)itemView.findViewById(R.id.stock);
        }
    }
}
