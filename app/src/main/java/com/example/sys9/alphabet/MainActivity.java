package com.example.sys9.alphabet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private MediaAdapter mAdapter;
    private String[] alphabet = {"A", "B", "C", "D", "E", "F", "G",
            "H", "I", "J", "K", "L", "M", "N",
            "O", "P", "Q", "R", "S", "T", "U",
            "V", "W", "X", "Y", "Z"};
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));
//        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));
//        mRecyclerView.setHasFixedSize(true);
        mAdapter = new MediaAdapter(MainActivity.this, alphabet);
        mRecyclerView.setAdapter(this.mAdapter);
        mAdapter.notifyDataSetChanged();

    }
}
