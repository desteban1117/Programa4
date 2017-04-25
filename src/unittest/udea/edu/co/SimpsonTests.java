package unittest.udea.edu.co;

import static org.junit.Assert.*;

import org.junit.Test;

import ps.udea.edu.co.Simpson;

public class SimpsonTests {
	
	Simpson simpson = new Simpson();
	
	@Test
	public void sum1Test1(){
		assertEquals(3.00332, simpson.sum1(0.11, 4, 9), 0.01);
	}
	
	@Test
	public void sum1Test2(){
		assertEquals(6.37288 , simpson.sum1(0.11, 10, 9), 0.01);
	}
	
	@Test
	public void sum2Test1(){
		assertEquals(2.57962 , simpson.sum2(0.11, 10, 9), 0.01);
	}
	
	@Test
	public void simpsonFunctionTest1(){
		assertEquals(0.3500589, simpson.simpsonFunction(10, 9, 1.1), 0.1);
	}
	
	@Test
	public void simpsonFunctionTest2(){
		assertEquals(0.35005864, simpson.simpsonFunction(20, 9, 1.1), 0.1);
	}
}
