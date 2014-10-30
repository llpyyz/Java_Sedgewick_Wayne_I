public class Sqrt{

  public static void main(String[] args){
    
	//find root of p(x) = x^2 - a using Newton's method
	double a = Double.parseDouble(args[0]);
	double eps = 1e-10;
	double xn = a;
	int maxIter = 100;
	int iter = 1;
	
	//iterate as long as sqrt(a)/curr est > eps
	while(Math.abs(xn - a/xn) > eps * xn && iter <= maxIter){
	
	  xn = 0.5*(xn + a/xn);
	  ++iter;
	}
	
	System.out.println("The square root of " + a + " is about " + xn);
	System.out.println("With eps = " + eps + ", a total of " + iter + " iteration were used");
  }
}