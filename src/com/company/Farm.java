package com.company;

import java.util.Arrays;

public class Farm {
   private String ownerName;
   private String address;
   private Cow[] cows;
   private Sheeps[] sheeps;
   private  Horse[]horses;

    public Farm() {
    }

    public Farm(String ownerName, String address, Cow[] cows, Sheeps[] sheeps, Horse[] horses) {

        this.ownerName = ownerName;
        this.address = address;
        this.cows = cows;
        this.sheeps = sheeps;
        this.horses = horses;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Sheeps[] getSheeps() {
        return sheeps;
    }

    public void setSheeps(Sheeps[] sheeps) {
        this.sheeps = sheeps;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    @Override
    public String toString() {
        return "\t\t\t\t\t~Farm~\n" +
                " OwnerName='" + ownerName + '\'' +
                ", Address='" + address + '\'' +
                "\n =cows=" + Arrays.toString(cows) +
                "\n =sheeps=" + Arrays.toString(sheeps) +
                "\n =horses=" + Arrays.toString(horses);
    }
}
