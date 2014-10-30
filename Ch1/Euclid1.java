public class Euclid1{

  public static void main(String[] args){
  
    long x = Long.parseLong(args[0]);
	long y = Long.parseLong(args[1]);
	long a = x;
	long b = y;
	long temp;
	//make x the larger of the two
	
	while(y != 0){
	  temp = y;
	  y = x % y;
	  x = temp;
	}
	System.out.println("The gcd of " + Math.max(a,b) + " and " + Math.min(a,b) + " is " + x);
  }
}