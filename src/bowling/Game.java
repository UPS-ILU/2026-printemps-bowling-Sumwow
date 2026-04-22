package bowling;

public class Game {
	
	int totalquilles = 0;
	public void lancer(int nbrquilles) {
		totalquilles+=nbrquilles;
	}
	
	public int score() {
		return totalquilles;
	}
}
