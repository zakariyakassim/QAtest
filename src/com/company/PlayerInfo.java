package com.company;

public class PlayerInfo extends Player{

    private String name;
    private String age;


    public PlayerInfo(String name, String age){
        this.name = name;
        this.age = age;

    }



    @Override
    public String getName() {

        return name;

    }

    @Override
    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: "+this.name+"  Age: "+this.age;
    }
}
