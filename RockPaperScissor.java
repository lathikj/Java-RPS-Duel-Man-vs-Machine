package com.java.Rock_paper_Scissor;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
	public static void main(String[] args) {
		String ch = "y";
		while(ch.equals("y")) {
			String[] rps = {"Rock","Paper","Scissor"};
			String computerMove = rps[new Random().nextInt(rps.length)];
			Scanner choice = new Scanner(System.in);
			int playerMovie;
			String playerMove;
			
			while(true) {
				System.out.println("\nPlease enter your move:- \n1.Rock, \n2.Paper, \n3.Scissor\n---------------------------------------");
				playerMovie = choice.nextInt();
				
				
				if(playerMovie==1 || playerMovie==2 || playerMovie==3) {
					break;
				}
				
				System.out.println(playerMovie + " is not a valid move.");
				
				
			}
			
			if(playerMovie == 1) {
				playerMove="Rock";
				
			}
			
			else if(playerMovie == 2) {
				playerMove="Paper";
			}
			
			else {
				playerMove="Scissor";
			}
			
			System.out.println("You have played: "+ playerMove);
			System.out.println("Computer played: "+ computerMove);
			
			if (playerMove.equals(computerMove)) {
				System.out.println("The Game was a tie!");
			}
			
			else if(playerMove.equals("Rock")){
				if(computerMove.equals("Paper")) {
					System.out.println("You lose!");
				}
				
				else if(computerMove.equals("Scissor")){
					System.out.println("You win!");
				}
			}
			
			else if(playerMove.equals("Paper")){
				if(computerMove.equals("Scissor")) {
					System.out.println("You lose!");
				}
				
				else if(computerMove.equals("Rock")){
					System.out.println("You win!");
				}
			}
			
			else if(playerMove.equals("Scissor")){
				if(computerMove.equals("Rock")) {
					System.out.println("You lose!");
				}
				
				else if(computerMove.equals("Paper")){
					System.out.println("You win!");
				}
			}
			
			System.out.println("\nDo you want to play more(y/n): ");
			
			ch = choice.next();
			
			
			if(ch.equals("y") || ch.equals("Y")) {
				System.out.println("------------------x-x------------------\n");
				continue;
			}
			else {
				System.out.println("------------------x-x------------------");
				System.out.print(" 	Thank you for playing!!	  ");
				System.out.println("\n------------------x-x------------------");
				break;
			}
		}
	}

}
