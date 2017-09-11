package pkgTest;

import static org.junit.Assert.*; 

import org.junit.Test;

import pkgCore.Die;

public class DieTest {

	@Test
	public void TestDie() {
		// test for die value between 1 and 6
		for (int a = 0; a < 10000; a++) {
			Die d = new Die();
			assertTrue(1<=d.getDieValue() && d.getDieValue()<=6);
		}

	}

}
