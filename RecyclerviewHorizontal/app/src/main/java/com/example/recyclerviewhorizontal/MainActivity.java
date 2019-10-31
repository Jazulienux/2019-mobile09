package com.example.recyclerviewhorizontal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.recyclerviewhorizontal.adapters.SuperHeroAdapters;
import com.example.recyclerviewhorizontal.models.SuperHero;

import java.util.ArrayList;
import java.util.List;

import static android.widget.LinearLayout.HORIZONTAL;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvSuperHero;

    List<SuperHero> listSuperHero = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvSuperHero = findViewById(R.id.rvSuperHero);

        SuperHero superHero = new SuperHero("Lemon",R.drawable.lemon);
        listSuperHero.add(superHero);
        superHero = new SuperHero("Lavender",R.drawable.lavender);
        listSuperHero.add(superHero);
        superHero = new SuperHero("Orchid",R.drawable.orchid);
        listSuperHero.add(superHero);
        superHero = new SuperHero("Peach",R.drawable.peach);
        listSuperHero.add(superHero);
        superHero = new SuperHero("Rose",R.drawable.rose);
        listSuperHero.add(superHero);
        SuperHeroAdapters superHeroAdapter = new SuperHeroAdapters(listSuperHero);
        //set adapter dan layoutmanager
        rvSuperHero.setAdapter(superHeroAdapter);
        rvSuperHero.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
    }
}
