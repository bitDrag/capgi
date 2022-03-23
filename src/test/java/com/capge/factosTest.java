package com.capge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class factosTest {
	factos fact;
	@BeforeEach
	void setUp() throws Exception {
		fact=new factos();
	}

	@Test
	void testgetFactos() {
		assertEquals(24,fact.getFact(4));
		assertEquals(120,fact.getFact(5));
		assertEquals(6,fact.getFact(3));
	}

}
