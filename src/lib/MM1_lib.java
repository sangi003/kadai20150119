package lib;

public class MM1_lib {
	
	private double lambda, mu, rho;

	public MM1_lib(double lambda, double mu) {
		this.lambda = lambda;
		this.mu = mu;
		rho = lambda/mu;
	}
	
	public double getRho(){
		return rho;
	}
	
	public double getLength(){
		return (rho/(1-rho));
	}
	
	public double getQueue(){
		return (Math.pow(rho,2)/(1-rho));
	}

}
