package time;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void testGetTotalSecondsGood() {

		int seconds = Time.getTotalSeconds("05:05:05");
		assertTrue("The seconds were not calculated properly", seconds==18305);

	}




	
	@Test
	void testGetSeconds() {
		fail("Not yet implemented");
	}

	@Test
	void testGetTotalMinutes() {
		fail("Not yet implemented");
	}

	@Test
	void testGetTotalHours() {
		fail("Not yet implemented");
	}

}
