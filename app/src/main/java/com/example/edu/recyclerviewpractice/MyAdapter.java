package com.example.edu.recyclerviewpractice;

import android.support.annotation.NonNull;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

private ArrayList<ItemData> arrayList;

    public MyAdapter(ArrayList<ItemData> arrayList) {
        this.arrayList = arrayList;
    }

    public class MyViewHolder extends  RecyclerView.ViewHolder{
        TextView mTextName, mTextNum;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextName=itemView.findViewById(R.id.textname);
            mTextNum=itemView.findViewById(R.id.num);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.itemview,viewGroup,false);


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
       MyViewHolder myViewHolder=(MyViewHolder)viewHolder;
       myViewHolder.mTextName.setText(arrayList.get(i).getName());
       myViewHolder.mTextNum.setText(arrayList.get(i).getNum());
}




    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
