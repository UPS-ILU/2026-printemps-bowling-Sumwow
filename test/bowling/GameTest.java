package bowling;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class GameTest {
	Game game;
	
	@Test
	public void Test1() {
		game = new Game();
		assertEquals(1,game.score());
	}
	
}
