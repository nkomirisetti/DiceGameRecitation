package randomDice;

import java.util.Random;
import java.util.Scanner;

public class RandomDice {

	public static void main(String[] args) {
		System.out.println("Please enter how many "
				+ "dice rolls you want ");
		Scanner s = new Scanner(System.in);
		int diceRolls = s.nextInt();
		rollDice(diceRolls);
	}
	
	public static int[] rollDice(int diceRolls) {
		Random r = new Random();
		int[] dice = new int[diceRolls];
		
		for (int i = 0; i < dice.length; i++) {
			// returns a random number greater than or equal
			// to 1, and less than 7
			dice[i] = r.nextInt(6)+1;
			System.out.println(dice[i]);
		}
		return dice;
	}
	public static void getAverage(int[] dice) {
		double average = 0;
		for (int i = 0; i < dice.length; i++) {
			average = average +  dice[i];
		}
		average = average / dice.length;
		
		System.out.println("The average is " + average);
	}
	public static void getMin(int[] dice) {
		int min = dice[0];
		for (int i = 1; i < dice.length; i++) {
			if(dice[i] < min) {
				min = dice[i];
			}
		}
		System.out.println("The minimum is " + min);
	}
	public static void getMax(int[] dice) {
		int max = dice[0];
		for (int i = 1; i < dice.length; i++) {
			if(dice[i] > max) {
				max = dice[i];
			}
		}
		System.out.println("The max is " + max);
	}
}
