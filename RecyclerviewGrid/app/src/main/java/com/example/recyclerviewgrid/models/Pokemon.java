package com.example.recyclerviewgrid.models;

public class Pokemon {
    public String name;
    public float rating;
    public int gambar;
    public String strength;

    public Pokemon(String name, float rating, int gambar, String strength) {
        this.name = name;
        this.rating = rating;
        this.gambar = gambar;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }
}
