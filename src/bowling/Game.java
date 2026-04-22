package bowling;

public class Game {
	
	private int[] partie = new int[21];
	private int indice = 0;
	
	public void lancer(int nbrquilles) {
		partie[indice]=nbrquilles;
		indice++;
	}

	public int score() {
		int total = 0;
		int i = 0;

		for (int frame = 0; frame < 10; frame++) {
			
			// STRIKE
			if (partie[i] == 10) {
				total += 10 + partie[i+1] + partie[i+2];
				i += 1;
			}
			
			// SPARE
			else if (partie[i] + partie[i+1] == 10) {
				total += 10 + partie[i+2];
				i += 2;
			}
			
			// NORMAL
			else {
				total += partie[i] + partie[i+1];
				i += 2;
			}
		}
		return total;
	}
}
