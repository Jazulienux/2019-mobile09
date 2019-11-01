package com.example.recyclerviewgrid.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewgrid.R;
import com.example.recyclerviewgrid.adapter.PokemonAdapter;
import com.example.recyclerviewgrid.models.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvPokemon;

    List<Pokemon> pokemonList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPokemon = findViewById(R.id.rvPokemonID);

        Pokemon pokemon = new Pokemon("Pikachu", (float) 3.5,R.drawable.pikachu,"Lightning");

        pokemonList.add(pokemon);

        pokemon = new Pokemon("Bellsprout", (float) 3.0,R.drawable.bellsprout,"Water");

        pokemonList.add(pokemon);

        pokemon = new Pokemon("Caterpie", (float) 4.0,R.drawable.caterpie,"Wind");

        pokemonList.add(pokemon);

        pokemon = new Pokemon("Charmander", (float) 3.5,R.drawable.charmander,"Fire");

        pokemonList.add(pokemon);

        pokemon = new Pokemon("Bullbasaur", (float) 4.5,R.drawable.bullbasaur,"Plan");

        pokemonList.add(pokemon);

        pokemon = new Pokemon("Dratini", (float) 4.5,R.drawable.dratini,"Water");

        pokemonList.add(pokemon);

        pokemon = new Pokemon("Eevee", (float) 5,R.drawable.eevee,"Wind");

        pokemonList.add(pokemon);

        pokemon = new Pokemon("Jigglypuff", (float) 4.5,R.drawable.jigglypuff,"Wind");

        pokemonList.add(pokemon);

        pokemon = new Pokemon("Mankey", (float) 3.0,R.drawable.mankey,"Wind");

        pokemonList.add(pokemon);

        pokemon = new Pokemon("Meowth", (float) 3.5,R.drawable.meowth,"Wind");

        pokemonList.add(pokemon);

        pokemon = new Pokemon("Mew", (float) 2.5,R.drawable.mew,"Water");

        pokemonList.add(pokemon);

        pokemon = new Pokemon("Squirtle", (float) 4.5,R.drawable.squirtle,"Water");

        pokemonList.add(pokemon);

        pokemon = new Pokemon("Pidgey", (float) 3.5,R.drawable.pidgey,"Wind");

        pokemonList.add(pokemon);

        pokemon = new Pokemon("Rattata", (float) 5.5,R.drawable.rattata,"Soil");

        pokemonList.add(pokemon);

        pokemon = new Pokemon("Psyduck", (float) 6.5,R.drawable.psyduck,"Water");

        pokemonList.add(pokemon);

        pokemon = new Pokemon("Snorlax", (float) 7.5,R.drawable.snorlax,"Water");

        pokemonList.add(pokemon);

        pokemon = new Pokemon("Venonat", (float) 4.5,R.drawable.venonat,"Lightning");

        pokemonList.add(pokemon);

        pokemon = new Pokemon("Zubat", (float) 3.5,R.drawable.zubat,"Lightning");

        pokemonList.add(pokemon);

        //Instansiasi Adapter
        PokemonAdapter superHeroAdapter = new PokemonAdapter(pokemonList);
        //set adapter dan layoutmanager
        rvPokemon.setAdapter(superHeroAdapter);
        rvPokemon.setLayoutManager(new GridLayoutManager(this,3));
    }
}
