public class Quadratic2{

  public static void main(String[] args){
  
    double a = Double.parseDouble(args[0]);
	double b = Double.parseDouble(args[1]);
	double c = Double.parseDouble(args[2]);
	double disc = b * b - 4 * a * c;
	double r1, r2, re, im;
	if(a == 0.0) System.out.println("Error: a = 0 so this is not a quadratic equation");
	else{
	
	  if(disc > 0.0){
	    r1 = (-b + Math.sqrt(disc))/(2 * a);
		r2 = (-b - Math.sqrt(disc))/(2 * a);
		System.out.println("The discriminant is positive so there are two distinct real roots >>> ");
		System.out.println("   " + r1 + " and " + r2);
	  }
	  else if (disc == 0.0){
	    r1 = -b/(2 * a);
		System.out.println("The discriminant is 0 so there is a double root >>>");
		System.out.println("   " + r1);
	  }
	  else{
	    re = -b/(2 * a);
		im = Math.sqrt(-disc)/(2 * a);
	    System.out.println("The discriminant is negative so there is a pair of complex conjugate roots >>> ");
		System.out.println("   " + re + " + " + im + " * i;   " + re + " - "+ im + " * i");
	  }
	}
  }
}