package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Cow cow = new Cow("Molly", 2, 120, "Male");
        Cow cow2 = new Cow("Jerry", 7, 170, "female");
        Cow cow3 = new Cow("Funny", 5, 200, "Male");
        Cow cow4 = new Cow("Konur", 4, 120, "female");
        Cow cow5 = new Cow("Norman", 3, 300, "Male");
        Cow cow6 = new Cow("Molly", 8, 165, "Female");

        Cow[] farmCows = new Cow[]{cow, cow2, cow3, cow4, cow5};
        Cow[] farm2Cows = new Cow[]{cow6};

        Sheeps sheeps = new Sheeps("A", 2, 45, "Female");
        Sheeps sheeps2 = new Sheeps("B", 3, 60, "Male");
        Sheeps sheeps3 = new Sheeps("C", 1, 45, "Female");
        Sheeps sheeps4 = new Sheeps("D", 5, 112, "Male");

        Sheeps[] farmSheeps = new Sheeps[]{sheeps, sheeps2, sheeps3};
        Sheeps[] farm2Sheeps = new Sheeps[]{sheeps4};

        Horse horse = new Horse("AB", 4, 300, "Male", "Black");
        Horse horse2 = new Horse("AC", 5, 345, "Female", "Grey");
        Horse horse3 = new Horse("AD", 6, 654, "Male", "Black-Red");

        Horse[] farmHorse = new Horse[]{horse, horse2};
        Horse[] farm2Horse = new Horse[]{horse3};

        Farm farm=new Farm("Zhaulanbek","Kadamzhai",farmCows,farmSheeps,farmHorse);
        System.out.println(farm);
        System.out.println("_______________________________________________________________________________________________________________");
        Farm farm2=new Farm("Jaulanbek","Batken",farm2Cows,farm2Sheeps,farm2Horse);
        System.out.println(farm2);
    }
}
