package unittest.udea.edu.co;

import static org.junit.Assert.*;

import org.junit.Test;

import ps.udea.edu.co.Gamma;



public class GammaTests {
	
	private Gamma gamma;
	
	@Test
	public void functGammaTest1(){
		
		gamma = new	Gamma();
		assertEquals(24, gamma.gammaFuntion(5), 0.001);
	}
	
	@Test
	public void functGammaTest2(){
		
		gamma = new	Gamma();
		assertEquals(120, gamma.gammaFuntion(6), 0.001);
	}
	
	@Test
	public void functGammaTest3(){
		
		gamma = new	Gamma();
		assertEquals(11.63173, gamma.gammaFuntion(4.5), 0.001);
	}
	
	@Test
	public void functGammaTest4(){
		
		gamma = new	Gamma();
		assertEquals(3.3233, gamma.gammaFuntion(3.5), 0.001);
	}
}
