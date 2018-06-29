package com.company;

public abstract class Player {

    private int total = 0;
    private boolean playerTurn = false;
    private int played = 0;

    public abstract String getName();
    public abstract String getAge();


    public int getPlayed() {
        return played;
    }


    public void setTotal(int value){
        played++;
        total = total+value;
    }


    public int getTotal() {
        return total;
    }

    public void setPlayerTurn(boolean playerTurn){
        this.playerTurn = playerTurn;
    }

    public boolean getPlayerTurn(){

        return this.playerTurn;
    }


}
