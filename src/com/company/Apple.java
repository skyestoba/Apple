package com.company;

public class Apple {
    String breed;
    String color;
    int crunchyness;

    public Apple(String breed, String color, int crunchyness) {
        this.breed = breed;
        this.color = color;
        this.crunchyness = crunchyness;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCrunchyness() {
        return crunchyness;
    }

    public void setCrunchyness(int crunchyness) {
        this.crunchyness = crunchyness;
    }

    public boolean isEdible(){
        if(crunchyness<=3){
            return true;
        }
        return false;
    }

    public boolean isRock(){
        if(crunchyness>=5){
            return true;
        }
        return false;
    }

    public boolean hasWorm(){
        if(color.equals("red")&&crunchyness<=2){
            return true;
        }
        return false;
    }
}
