public class GaussianRnd{

  public static void main(String[] args){
  
    double u = Math.random();
	double v = Math.random();
	double w = Math.sin(2 * Math.PI * v) * Math.pow( -2 * Math.log(u), 0.5);
	System.out.println("A pseudorandom Gaussian number = " + w);
  }
}