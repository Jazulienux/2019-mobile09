package com.example.recyclerviewhorizontal.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recyclerviewhorizontal.R;
import com.example.recyclerviewhorizontal.models.SuperHero;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SuperHeroAdapters extends RecyclerView.Adapter<SuperHeroAdapters.MyViewHolder> {

    List<SuperHero> listSuperHero;

    public SuperHeroAdapters(List<SuperHero> listSuperHero) {
        this.listSuperHero = listSuperHero;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View superView = layoutInflater.inflate(R.layout.item_super_hero_horizontal,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(superView);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        SuperHero hero = listSuperHero.get(position);
        holder.heroName.setText(hero.getHeroName());
        holder.imageHeroName.setImageResource(hero.getImageHeroName());
    }

    @Override
    public int getItemCount() {
        return (listSuperHero != null) ? listSuperHero.size() : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView heroName;
        public ImageView imageHeroName;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            heroName = itemView.findViewById(R.id.heroName);
            imageHeroName = itemView.findViewById(R.id.imageHeroName);
        }
    }
}
