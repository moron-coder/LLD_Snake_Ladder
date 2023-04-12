package com.LLD_ONE.demo.Entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Board extends Dice {
    public List<Player> players = new ArrayList<>();
    public int boardSize,winningPlayer, currentPlayerIndex;
    public dices boardDice;

    public static HashMap<Integer, Integer> hasSnakeLadder =new HashMap<>();

    static {
        hasSnakeLadder.put(13,24);
        hasSnakeLadder.put(90,14);
        hasSnakeLadder.put(46,60);
        hasSnakeLadder.put(94,87);
    }

    public Board(int size){
        winningPlayer = -1;
        currentPlayerIndex =0;
        boardSize =size;
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public void setDice(dices dice){
        boardDice = dice;
    }

    public boolean isGameOver(){
        int currentPlayerPosition = players.get(currentPlayerIndex).pos;
        if(currentPlayerPosition>=boardSize){
            winningPlayer = currentPlayerIndex;
        }else{
            currentPlayerIndex =(currentPlayerIndex +1)%players.size();
        }
        return winningPlayer!=-1;
    }
}
