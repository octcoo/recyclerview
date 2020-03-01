package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvBts;
    private ArrayList<BtsesModel> listBts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvBts = findViewById(R.id.rv_bts);
        rvBts.setHasFixedSize(true);
        listBts.addAll(BtsesData.getBtsList());

        showRecyclerList();
    }

    private void showRecyclerList() {
        rvBts.setLayoutManager(new LinearLayoutManager(this));
        BtsesAdapter btsesAdapter = new BtsesAdapter(this);
        btsesAdapter.setListBts(listBts);
        rvBts.setAdapter(btsesAdapter);
    }
}
