public class NthRoot{

  public static void main(String[] args){
    
	//find root of p(x) = x^N - a using Newton's method
	double a = Double.parseDouble(args[0]);
	int N = Integer.parseInt(args[1]);
	double eps = 1e-10;
	double xn = a;
	int maxIter = 10000;
	int iter = 1;
	
	//iterate as long as sqrt(a)/curr est > eps
	while(Math.abs(xn - a / Math.pow(xn, N-1)) > eps && iter <= maxIter){
	
	  xn = 1.0 / N * ((1.0 * N - 1.0) * xn + a / Math.pow(xn, N-1));
	  ++iter;
	}
	
	System.out.println(a + "^(1/" + N + ") is about " + xn);
	System.out.println("With eps = " + eps + ", a total of " + iter + " iteration were used");
  }
}