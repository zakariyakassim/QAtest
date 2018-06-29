package com.company;

import java.util.Random;

    public class Dice {

        Die die = new Die();
        int roll = 0;


        public void init() {
            die.setValue(0);

        }




        public void Roll() {
            roll = (new Random().nextInt(6)) + 1;
            die.setValue(roll);
        }



        public int getValue() {
            return die.getValue();
        }

        public String getGraphicalValue(){
            return  die.getGraphicalValue();
        }

        @Override
        public String toString() {
            return "Dice: "+getValue();
        }
    }
