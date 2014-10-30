public class MyExponential{

  public static void main(String[] args){
  
    double x = Double.parseDouble(args[0]);
	double term = 1.0;
	double sum = 0.0;
	for(int i = 1; sum != sum + term; i++){
	
	  sum += term;
	  term *= x/i;
	}
	System.out.println("e^" + x + " is approx " + sum);
	System.out.println("Approx rel error, compared to built in Java exp function is " + (Math.abs(Math.exp(x) - sum)/Math.exp(x)));
  }//end main
}//end class MyExponential