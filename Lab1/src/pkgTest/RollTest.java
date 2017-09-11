package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Die;
import pkgCore.Roll;

public class RollTest {

	@Test
	public void TestRoll() {
		// make sure roll is a value between 2 and 12
		for (int a = 0; a < 10000; a++) {
			Roll r = new Roll();
			assertTrue(2 <= r.getScore() && r.getScore() <= 12);
		}

	}

}
