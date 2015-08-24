package ve.com.pt.katas;

import static org.junit.Assert.*;

import org.junit.Test;

public class BowlingGameTest {
	Game game = new Game();

	private void rollASpare() {
		game.roll(5);
		game.roll(5);
	}
	
	private void rollMany(int n, int pins) {
		for (int i = 0; i < n; i++)
			game.roll(pins);
	}
	
	@Test
	public void rollOneScoresOne() throws Exception {
		game.roll(1);
		assertEquals(1, game.score());
	}
	
	@Test
	public void rollTwoScoresTwo() throws Exception {
		game.roll(2);
		assertEquals(2, game.score());
	}
	
	@Test
	public void rollingOneThenOneScoresTwo() throws Exception {
		rollMany(2, 1);
		assertEquals(2, game.score());
	}
	
	@Test
	public void rollingASpareThenOneScoresTwelve() throws Exception {
		rollASpare();
		game.roll(1);
		assertEquals(12, game.score());
	}
	
	@Test
	public void rollingOneThenOneThenASpareThenOneScoresFounteen() throws Exception {
		rollMany(2, 1);
		rollASpare();
		game.roll(1);
		assertEquals(14, game.score());
	}

	@Test
	public void rollingStrikeThenOneThenOneScoresFourteen() throws Exception {
		game.roll(10);
		rollMany(2, 1);
		assertEquals(14, game.score());
	}
	
	@Test
	public void rollingOneThenOneThenStrikeThenOneThenOneScoresSixteen() throws Exception {
		rollMany(2, 1);
		game.roll(10);
		rollMany(2, 1);
		assertEquals(16, game.score());
	}
	
	@Test
	public void rollingTwelveStrikesScoresThreeHundred() throws Exception {
		rollMany(12, 10);
		assertEquals(300, game.score());
	}
	
	@Test
	public void rollingTenSparesThenFiveScoresOneFifty() throws Exception {
		rollMany(21, 5);
		assertEquals(150, game.score());
	}
}
