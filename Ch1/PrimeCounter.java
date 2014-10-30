public class PrimeCounter{

  public static void main(String[] args){
  
    long n = Long.parseLong(args[0]);
	long sqrtN;
	long primeCount = 0;
	for(long i = 2; i <= n; i++){
	  if(i == 2){
	    System.out.println(i + " is prime");
		primeCount++;
	  }
	  else{
	    //test if i is prime
		//System.out.println("testing " + i + " for primality: ");
		long j = 2;
		while(j <= i/j && i % j != 0){
		  j++;
		}
		if(j * j > i){
		  System.out.println(i + " is prime");  
		  primeCount++;
		}	
	  }//end else
	  
	}//out loop
	System.out.println("\nThere are " + primeCount + " primes less than or equal to " + n);
	System.out.println("Hence the probability a randomly chosen number in this range is prime is " + (primeCount*1.0/n));
  }//end main
}//end class PrimeCounter