package model;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
	Scanner scan = new Scanner(System.in);
	
	public Main() {
		
		int input;
		Entity player;
		Entity enemy;
		
		do {
			System.out.println("  Dark Knight");
			System.out.println("  1. Play");
			System.out.println("  2. Exit");
			System.out.print("  >> ");
			input = scan.nextInt();
			scan.nextLine();
			
			if (input == 1) {
				
				String name = null;
				String enemyName = null;
				
				do {
					System.out.print("Input name [>=5}: ");
					name = scan.nextLine();
				} while (name.length() < 5);
				
				System.out.println("Welcome to Dark Knight, " + name);
				System.out.println("Press Enter to continue...");
				scan.nextLine();
				
				player = new Player(100, 20);
				
				while (player.getHP() > 0) {
					player.setHP(100); // reset player's HP
					
					Random rand = new Random();
					int randVal = rand.nextInt()%2;
					
					if (randVal == 0) {
						enemy = new Goblin(80, 20);
						enemyName = "Goblin";
					}else {
						enemy = new Thief(80, 15);
						enemyName = "Thief";
					}
					
					while (enemy.getHP() > 0 && player.getHP() > 0) {
						System.out.println("Your HP: " + player.getHP());
						System.out.println("Your Damage: " + player.getBaseDamage());
						System.out.println("---------");
						System.out.println("Enemy is: " + enemyName);
						System.out.println("Enemy HP: " + enemy.getHP());
						
						// randomize player's attack
						
						
						// randomize enemy's attack
					}
				}
				
			}
			
		} while (input < 1 || input > 2);
		
	}

	public static void main(String[] args) {
		new Main();

	}
}
