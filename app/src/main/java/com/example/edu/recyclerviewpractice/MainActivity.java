package com.example.edu.recyclerviewpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView=findViewById(R.id.recyclerview);
        mLayoutManager=new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setHasFixedSize(true);

        ArrayList<ItemData> arrayList=new ArrayList<>();
        arrayList.add(new ItemData("aaaa","111111"));
        arrayList.add(new ItemData("bbb","2222"));
        arrayList.add(new ItemData("ccc","3333"));
        arrayList.add(new ItemData("ddd","4444"));

        MyAdapter myAdapter=new  MyAdapter(arrayList);
        mRecyclerView.setAdapter(myAdapter);

    }
}
