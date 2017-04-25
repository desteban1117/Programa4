package ps.udea.edu.co;

public class Tdistribution {
	
	double pi;
	Gamma gamma;
	
	public Tdistribution(){
		pi = Math.PI;
		gamma = new	Gamma();
	}
	
	public double TFunction(double x, double dof){
		
		double numerador = gamma.gammaFuntion((dof + 1)/2);
		double denominador = (Math.sqrt((dof*pi)))*gamma.gammaFuntion(dof/2);
		double multiplo = Math.pow((1 + (x*x)/dof), -(dof + 1)/2);
		
		return (numerador/denominador)*multiplo;
	}
}
