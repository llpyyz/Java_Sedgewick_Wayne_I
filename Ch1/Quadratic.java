public class Quadratic{

//Returns roots of p(x) = x^2+bx+c given coefficients b and c
//Yields real roots if b^2 - 4c > 0; else yields NaN for complex roots
  public static void main(String[] args){
  
    double b = Double.parseDouble(args[0]);    
	double c = Double.parseDouble(args[1]);
	double d = Math.sqrt(b*b - 4.0*c); //discriminant
	double r1 = (-b+d)/2.0;
	double r2 = (-b-d)/2.0;
	System.out.println("The roots are " + r1 + " and " + r2);
  }
}