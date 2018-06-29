package com.company;

import java.util.Random;

public class Alligator {

    private int total = 0;
    private int played = 0;

    public void addTotal(int total){
        this.total = this.total+total;
    }

    public void roll(int count){
        System.out.println("Alligator roll: ");
        for (int x = 0; x < count; x++){
            int random = (new Random().nextInt(6)) + 1;
            System.out.print(random+" ");

            total = total +random;
        }
        played++;
      //  System.out.println("count :" +count);
    }

    public int getPlayed() {
        return played;
    }

    public int getTotal(){
        return this.total;
    }

    @Override
    public String toString() {
        return "Alligator total: "+total + " Played ("+played+")";
    }
}
