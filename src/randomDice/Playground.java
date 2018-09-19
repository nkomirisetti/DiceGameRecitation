package randomDice;

public class Playground {

	public static void main(String[] args) {
		WeightedDice wd = new WeightedDice(6,5);
		for (int i = 0; i < 100; i++) {
			System.out.println(wd.rollDie());
		}
	}

}
