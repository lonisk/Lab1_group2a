package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Roll;
import pkgCore.Round;
import pkgCore.eGameResult;

public class RoundTest {

	@Test
	public void TestRound() {

		for (int a = 0; a < 10000; a++) {
			Round X = new Round();

			if (X.RollCount() == 1) {
				if (X.geteGameResult() == eGameResult.NATURAL) {
				} else if (X.geteGameResult() == eGameResult.CRAPS) {
				} else
					fail("I should not get here.");
			} else {
				if (X.getRolls().getFirst().getScore() == X.getRolls().getLast().getScore()) {
					if (X.geteGameResult() != eGameResult.POINT) {
						fail("Should be scored as a point");
					}
				} else if (X.getRolls().getLast().getScore() == 7) {
					if (X.geteGameResult() != eGameResult.SEVEN_OUT) {
						fail("Should have been seven_out");
					}
				}
			}
		}

	}

}
