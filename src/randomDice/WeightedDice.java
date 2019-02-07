package randomDice;

import java.util.Random;

public class WeightedDice extends FairDice{

	private int preferredNumber;
	public WeightedDice(int sides, int preferredNumber) {
		super(sides);
		this.preferredNumber = preferredNumber;
	}

	@Override
	public int rollDie() {
		Random r = new Random();
		if (r.nextInt(9)+1 <= 7) {
			rollHistory.add(preferredNumber);
		} else {
			return super.rollDie();
		}
		return 0;
	}
}
