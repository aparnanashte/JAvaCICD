package cicd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MyJavaCICDTest {

	@Test
	void test() {
		MyJavaCICD a = new MyJavaCICD();
		assertEquals(10, a.add(5, 5));
	}

	@Test
	void testFailure() {
		MyJavaCICD a = new MyJavaCICD();
		assertEquals(10, a.add(3, 5));
	}

}
