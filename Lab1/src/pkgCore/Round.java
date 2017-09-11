package pkgCore;

import java.util.LinkedList;

public class Round {

	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();

	public Round() {
		// come out roll
		Roll r1 = new Roll();
		rolls.add(r1);
		ComeOutScore = r1.getScore();

		if (ComeOutScore == 2 || ComeOutScore == 3 || ComeOutScore == 12) {
			eGameResult = eGameResult.CRAPS;
		} else if (ComeOutScore == 7 || ComeOutScore == 11) {
			eGameResult = eGameResult.NATURAL;

			// loop until point made or seven-out
		} else {
			while (true) {
				Roll r2 = new Roll();
				int roll2Score = r2.getScore();
				rolls.add(r2);
				if (roll2Score == ComeOutScore) {
					eGameResult = eGameResult.POINT;
					break;
				} else if (roll2Score == 7) {
					eGameResult = eGameResult.SEVEN_OUT;
					break;
				}
			}
		}
		return;
	}

	public int RollCount() {
		// Return the roll count
		return rolls.size();
	}

	// make result accessible to RoundTest.java class
	public eGameResult geteGameResult() {
		return eGameResult;
	}

	public LinkedList<Roll> getRolls() {
		return rolls;
	}

}
