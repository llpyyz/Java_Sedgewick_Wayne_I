public class PowersOfK2{

  public static void main(String[] args){
  
    long k = Long.parseLong(args[0]);
	long pow = 1;
	
	System.out.println("\nAll powers of " + k + " not exceeding " + Long.MAX_VALUE + ":\n");
	System.out.println(pow);
	
	while(pow <= Long.MAX_VALUE/k){
	  pow *= k;
	  System.out.println(pow);
	  
	}  
  }
}