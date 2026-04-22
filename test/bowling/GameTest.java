package bowling;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class GameTest {
	Game game;
	
	public void plusieurscoups(int nbrlancer, int nbrquilles) {
		for (int i = 0; i< nbrlancer; i++) {
			game.lancer(nbrquilles);
		}
	}
	
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
		game.lancer(5);
		assertEquals(5,game.score());
	}
	
	@Test
	public void test3() {
		plusieurscoups(4,3);
		assertEquals(12,game.score());
	}
	
	@Test
	public void strike() {
		game.lancer(10);
		game.lancer(5);
		game.lancer(3);
		assertEquals(26,game.score());
	}
	
	@Test
	public void spare() {
		game.lancer(4);
		game.lancer(6);
		game.lancer(3);
		assertEquals(16,game.score());
	}
	
	@Test
	public void partie() {
		game.lancer(4);
		game.lancer(6);
		game.lancer(3);
		game.lancer(3);
		game.lancer(10);
		plusieurscoups(15,4);
		assertEquals(93, game.score());
	}
}
