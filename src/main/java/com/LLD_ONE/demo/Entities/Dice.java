package com.LLD_ONE.demo.Entities;

public class Dice {
    public static enum dices{
        SIX(6),EIGHT(8);

        int val;

        dices(int x){
            this.val=x;
        }
    };

    public final static dices selectedDice=dices.SIX;

    public int roll(dices size){
        return (int) Math.floor(Math.random()*(size.val))+1;
    }
}
