package pkgCore;

public class Die {

	private int DieValue;

	public Die() {
		// create a die value between 1 and 6
		this.DieValue = (int) (Math.random() * 6 + 1);
	}
	// allow access for DieValue outside of Die.java class
	public int getDieValue() {
		return this.DieValue;
	}
}
