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
	void testiter1() {
		assertEquals("Hello, Bob",w.welcome("bob") );;
	}
	
	@Test
	void testiter2() {
		assertEquals("Hello, JERRY !",w.welcome("JERRY") );;
	}
	

}
