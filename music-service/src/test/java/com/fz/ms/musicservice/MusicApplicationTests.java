package com.fz.ms.musicservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MusicApplicationTests {

	@Test
	void contextLoads() {
		int x = 2;
		Assertions.assertTrue(2 == x);
	}

}
