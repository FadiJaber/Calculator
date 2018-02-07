package Fadi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ModelTest {

	Model model;
	@BeforeEach
	void setUp() throws Exception {
		model = new Model();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void addTest() {
		assertEquals(model.add(12.4, 21.5),33.9);
	}
	
	@Test
	void subtractTest()
	{
		assertEquals(model.subtract(11, 4.5),6.5);
	}
	
	@Test
	void multiplyTest()
	{
		assertEquals(model.multiply(5.5, 2),11);
	}
	
	@Test
	void divideTest()
	{
		model.divide(2, 0);
		assertEquals(model.divide(20, 2.5),8);
	}
	
	@Test
	void modTest()
	{
		model.mod(4, 0);
		assertEquals(model.mod(4, 3), 1);
	}
	
	@Test
	void squareRootTest()
	{
		model.squareRoot(-2);
		assertEquals(model.squareRoot(4),2);
	}
}
