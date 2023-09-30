package com.java.Rock_paper_Scissor;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
	public static void main(String[] args) {
		String ch = "y";
		while(ch.equals("y")) {
			String[] rps = {"r","p","s"};
			String computerMove = rps[new Random().nextInt(rps.length)];
			Scanner choice = new Scanner(System.in);
			String playerMove;
			
			while(true) {
				System.out.println("Please enter your move (r, p, or s)");
				playerMove = choice.nextLine();
				if(playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
					break;
				}
				
				System.out.println(playerMove + " is not a valid move.");
				
				
			}
			
			System.out.println("Computer Played: "+ computerMove);
			
			if (playerMove.equals(computerMove)) {
				System.out.println("The Game was a tie!");
			}
			
			else if(playerMove.equals("r")){
				if(computerMove.equals("p")) {
					System.out.println("You lose!");
				}
				
				else if(computerMove.equals("s")){
					System.out.println("You win!");
				}
			}
			
			else if(playerMove.equals("p")){
				if(computerMove.equals("s")) {
					System.out.println("You lose!");
				}
				
				else if(computerMove.equals("r")){
					System.out.println("You win!");
				}
			}
			
			else if(playerMove.equals("s")){
				if(computerMove.equals("r")) {
					System.out.println("You lose!");
				}
				
				else if(computerMove.equals("p")){
					System.out.println("You win!");
				}
			}
			
			System.out.println("\nDo you want to play more(y/n): ");
			
			ch = choice.next();
			
			if(ch.equals("y")) {
				continue;
			}
			else {
				System.out.println("\nThank you for playing!!");
				break;
			}
		}
	}
}
