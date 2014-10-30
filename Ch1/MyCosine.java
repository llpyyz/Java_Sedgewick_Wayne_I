public class MyCosine{

  public static void main(String[] args){
  
    double x = Double.parseDouble(args[0]);
	double term = 1.0;
	double sum = 0.0;
	for(int i = 0; sum != sum + term; i+= 2){
	
	  sum += term;
	  term *= Math.pow(-1, 1 + (i % 4)) * x * x/((i + 2) * (i + 1));  
	}
	
	System.out.println("cos(" + x + ") is approx " + sum);
	System.out.println("Approx rel error, compared to built in Java cosine function is " + (Math.abs(Math.cos(x) - sum)/Math.cos(x)));
  }

}