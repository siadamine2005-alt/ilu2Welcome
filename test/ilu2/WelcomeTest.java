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
		assertEquals("HELLO, JERRY !",w.welcome("JERRY") );
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
		assertEquals("Hello, Amy and Bob",w.welcome("amy,bob") );
	}
	
	@Test
	void testIter6() {
		assertEquals("Hello, Amy, Bob and Jerry",w.welcome("amy,bob,jerry") );
	}
	
	@Test
	void testIter7() {
		assertEquals("Hello, Amy and Jerry. AND HELLO, BOB !",w.welcome("amy,BOB,jerry") );
	}
	
	@Test
	void testIter8() {
		assertEquals("Hello, Amy, Bob and Jerry",w.welcome("amy,bob,jerry") );
		assertEquals("Hello, Bob and Jerry. AND HELLO, AMY AND JACK !",w.welcome("bob,AMY,jerry,JACK") );
	}
}
