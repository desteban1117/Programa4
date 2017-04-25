package unittest.udea.edu.co;

import static org.junit.Assert.*;

import org.junit.Test;

import ps.udea.edu.co.Tdistribution;

public class TdistributioinTests {
	
	private Tdistribution tdist;
	
	@Test
	public void functionTTest1(){
		
		tdist = new Tdistribution();
		
		assertEquals(0.38544, tdist.TFunction(0.11, 9),0.001);
	}
	
	@Test
	public void functionTTest2(){
		
		tdist = new Tdistribution();
		
		assertEquals(0.37777, tdist.TFunction(0.22, 9),0.001);
	}
	
	@Test
	public void functionTTest3(){
		
		tdist = new Tdistribution();
		
		assertEquals(0.20652, tdist.TFunction(1.1, 9),0.001);
		
	}
	
	@Test
	public void functionTTest4(){
		
		tdist = new Tdistribution();
		
		assertEquals(0.38803, tdist.TFunction(0, 9),0.001);
		
	}
}
