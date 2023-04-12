package com.LLD_ONE.demo;

import com.LLD_ONE.demo.Entities.Board;
import com.LLD_ONE.demo.Entities.Dice;
import com.LLD_ONE.demo.Entities.Player;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Board gameBoard = new Board(100);

		gameBoard.setDice(Dice.dices.SIX);

		Player p1 = new Player("Utkarsh");
		Player p2 = new Player("Anurag");
		gameBoard.addPlayer(p1);
		gameBoard.addPlayer(p2);

		while (!gameBoard.isGameOver()){
			Player currentPlayer = gameBoard.players.get(gameBoard.currentPlayerIndex);
			int stepsToMove = currentPlayer.roll(gameBoard.boardDice);
			currentPlayer.move(stepsToMove);
			System.out.println(currentPlayer.playerName+" moves to "+currentPlayer.pos);
		}

		System.out.println(gameBoard.players.get(gameBoard.currentPlayerIndex).playerName+" wins!!");
	}

}
