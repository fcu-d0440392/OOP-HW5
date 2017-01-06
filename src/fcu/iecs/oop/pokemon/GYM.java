package fcu.iecs.oop.pokemon;

import java.util.Random;

public class GYM {

	public static void fight(Pokemon p1, Pokemon p2) {

		Random Ran = new Random();

		if (Ran.nextInt(5) + 1 == 2) {
			System.out.println("Winner is [" + p1.getName() + "].");
			p1.SetCp(p1.getCp() + 500);
		} else {
			System.out.println("Winner is [" + p2.getName() + "].");
			p2.SetCp(p2.getCp() + 500);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}