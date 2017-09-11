package pkgCore;

public class Roll {

	private Die d1;
	private Die d2;
	private int Score;

	public Roll() {
		// instances of two die
		Die d1 = new Die();
		Die d2 = new Die();
		// get a score for the two die
		Score = d1.getDieValue() + d2.getDieValue();
	}

	// allow for Score to be accessed outside of Roll.java class
	public int getScore() {
		return Score;
	}

}
