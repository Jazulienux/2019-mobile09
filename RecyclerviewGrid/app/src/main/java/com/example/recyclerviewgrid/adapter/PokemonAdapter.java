package com.example.recyclerviewgrid.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recyclerviewgrid.R;
import com.example.recyclerviewgrid.models.Pokemon;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.MyViewHero> {
    List<Pokemon> pokemonList;

    public PokemonAdapter(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }

    @NonNull
    @Override
    public PokemonAdapter.MyViewHero onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View pokemonView = layoutInflater.inflate(R.layout.grid_layout,parent,false);
        MyViewHero myViewHero = new MyViewHero(pokemonView);
        return myViewHero;
    }

    @Override
    public void onBindViewHolder(@NonNull PokemonAdapter.MyViewHero holder, int position) {
        Pokemon hero = pokemonList.get(position);

        holder.imagePokemon.setImageResource(hero.getGambar());
        holder.name.setText(hero.getName());
        holder.rating.setText(String.valueOf(hero.getRating()));
        holder.strength.setText(hero.getStrength());
    }

    @Override
    public int getItemCount() {
        return (pokemonList != null) ? pokemonList.size() : 0;
    }

    public class MyViewHero extends RecyclerView.ViewHolder {
        TextView name;
        TextView rating;
        TextView strength;
        ImageView imagePokemon;

        public MyViewHero(@NonNull View itemView) {
            super(itemView);
            imagePokemon = itemView.findViewById(R.id.hero_image);
            strength = itemView.findViewById(R.id.hero_strength);
            name = itemView.findViewById(R.id.hero_nama);
            rating = itemView.findViewById(R.id.hero_rating);
        }
    }
}
