package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WelcomeTest {

	private Welcome w;
	
	@BeforeEach
	void setUp() throws Exception {
		w = new Welcome();
	}

	@Test
	void testIter1() {
		assertEquals("Hello, Bob",w.welcome("bob") );
	}
	
	@Test
	void testIter2() {
		assertEquals("Hello, JERRY !",w.welcome("JERRY") );
	}
	
	@Test
	void testIter3() {
		assertEquals("Hello, my friend",w.welcome("") );
		assertEquals("Hello, my friend",w.welcome("      ") );
		assertEquals("Hello, my friend",w.welcome(null));
	}

	@Test
	void testIter4() {
		assertEquals("Hello, Bob",w.welcome("bob     ") );
	}
	
	@Test
	void testIter5() {
		assertEquals("Hello, Amy, Bob",w.welcome("amy,bob") );
	}
	
	@Test
	void testIter6() {
		assertEquals("Hello, Amy, Bob, Jerry",w.welcome("amy,bob,jerry") );
	}
}
