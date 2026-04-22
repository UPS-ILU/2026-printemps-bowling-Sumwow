package bowling;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class GameTest {
	Game game;
	
	@BeforeEach
	public void setup() {
		game = new Game();
	}
	
	@Test
	public void test1() {
		game.lancer(1);
		assertEquals(1,game.score());
	}
	
	@Test
	public void test2() {
		game.lancer(10);
		assertEquals(10,game.score());
	}
	
}
