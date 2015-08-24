package ve.com.pt.katas;

public class Game {

	private int score = 0;
	private int[] rolls = new int[21];
	private int currentRolls = 0;

	public void roll(int pins) {
		this.rolls[currentRolls++] = pins;
	}
	
	public int score() {
		int rollIndex = 0;
		for (int frame = 0; frame < 10; frame++, rollIndex+=2) {
			if (rolls[rollIndex] == 10) {
				score += 10 + rolls[rollIndex + 1] + rolls[rollIndex + 2];
				rollIndex--;
			}
			else if (isSpare(rollIndex))
				score += 10 + spareBonus(rollIndex); 
			else
				score += sumOfRollsInFrame(rollIndex);
		}
		return score;
	}

	private int sumOfRollsInFrame(int rollIndex) {
		return rolls[rollIndex] + rolls[rollIndex+1];
	}

	private int spareBonus(int rollIndex) {
		return rolls[rollIndex+2];
	}

	private boolean isSpare(int rollIndex) {
		return sumOfRollsInFrame(rollIndex) == 10;
	}

}
