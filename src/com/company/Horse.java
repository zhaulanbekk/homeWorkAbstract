package com.company;

public class Horse extends DomesticAnimal{
   private String color;



    public Horse(String nickName, int age, int weight, String gender, String color) {
        super(nickName, age, weight, gender);
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString()+" Horse" +
                "color='" + color + '\'';
    }
}
