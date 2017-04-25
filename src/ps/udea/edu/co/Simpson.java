package ps.udea.edu.co;

public class Simpson {
	
	Tdistribution tdis;
	public Simpson(){
		tdis = new Tdistribution();
	}
	
	public double simpsonFunction(double numSeg, double dof, double x){
		
		double w = x/numSeg;
		double p = (w/3)*(tdis.TFunction(0, dof) + sum1(w, numSeg, dof) + sum2(w, numSeg, dof) + tdis.TFunction(x, dof));
		
		return p;
	}
	
	public double sum1(double w, double numSeg, double dof){
		double sum = 0;
		for(int i = 1; i <= (numSeg - 1); i = i+2){
			sum = sum + 4*tdis.TFunction(i*w, dof);
		}
		
		return sum;
	}
	
	public double sum2(double w, double numSeg, double dof){
		double sum = 0;
		for(int i = 2; i <= (numSeg - 2); i = i+2){
			sum = sum + 2*tdis.TFunction(i*w, dof);
		}
		
		return sum;
	}
}
