package ps.udea.edu.co;

public class Gamma {
	private double pi;
	
	public Gamma(){
		pi = Math.PI;
	}
	
	public double gammaFuntion(double x){
		if (x == 1){
			return 1;
		}else if(x == 0.5){
			return Math.sqrt(pi);
		}else{
			
			return ((x - 1)*gammaFuntion(x - 1));
		}
			
	}
}
