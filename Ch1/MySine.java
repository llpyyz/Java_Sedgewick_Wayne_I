public class MySine{

  public static void main(String[] args){
  
    double x = Double.parseDouble(args[0]);
	double term = x;
	double sum = 0.0;
	for(int i = 1; sum != sum + term; i+= 2){
	
	  sum += term;
	  term *= Math.pow(-1, 1 + (i - 1) % 4) * x * x/((i + 2) * (i + 1));  
	}
	
	System.out.println("sin(" + x + ") is approx " + sum);
	System.out.println("Approx rel error, compared to built in Java sine function is " + (Math.abs(Math.sin(x) - sum)/Math.sin(x)));
  }

}