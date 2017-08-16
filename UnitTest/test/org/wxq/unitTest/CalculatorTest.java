package org.wxq.unitTest;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {

	private static Calculator calculator = new Calculator();
	
	@BeforeClass  // 注意有static修饰
    public static void setUpBeforeClass() throws Exception {  
        System.out.println("this is setUpBeforeClass()...");  
    }    
    @AfterClass  // 注意有static修饰
    public static void tearDownAfterClass() throws Exception {  
        System.out.println("this is tearDownAfterClass()...");  
    }
    
	@Before
	public void setUp() throws Exception {
		calculator.clear();
	}

	
	@Test
	public void testAdd() {
		calculator.add(2);
        calculator.add(3);
        assertEquals(5, calculator.getResult());
	}

	@Test(timeout  =   1000 )
	public void testSubstract() {
		calculator.add(10);
        calculator.substract(2);
        assertEquals(8, calculator.getResult());
	}
	@Ignore("Multiply() Not yet implemented")
	@Test
	public void testMultiply() {
		calculator.add(10);
        calculator.multiply(2);
        assertEquals(20, calculator.getResult());
	}

	@Test(expected  =  ArithmeticException. class )
	public void testDivide() {
		calculator.add(8);
        calculator.divide(2);
        assertEquals(4, calculator.getResult());
	}

	
}
