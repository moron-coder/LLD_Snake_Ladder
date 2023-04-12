package com.LLD_ONE.demo.Entities;

import org.springframework.beans.factory.annotation.Autowired;

public class Player extends Dice {
    public int pos;
    public String playerName;

    public void move(int steps){
        if(steps<=0 || steps>Dice.selectedDice.val){
            System.out.println("Invalid steps selected");
        }

        pos=pos+steps;

        //  If we land on a snake/ladder, modify pos
        if(Board.hasSnakeLadder.containsKey(pos)){
            pos = Board.hasSnakeLadder.get(pos);
        }
    }

    public Player(String name){
        playerName=name;
        pos=1;
    }
}
