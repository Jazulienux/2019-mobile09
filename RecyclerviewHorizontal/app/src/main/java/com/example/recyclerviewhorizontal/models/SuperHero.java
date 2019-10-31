package com.example.recyclerviewhorizontal.models;

public class SuperHero {
    public String heroName;
    public int imageHeroName;

    public SuperHero(String heroName, int imageHeroName) {
        this.heroName = heroName;
        this.imageHeroName = imageHeroName;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public int getImageHeroName() {
        return imageHeroName;
    }

    public void setImageHeroName(int imageHeroName) {
        this.imageHeroName = imageHeroName;
    }
}
