public class Factors{

  public static void main(String[] args){
  
    long N = Long.parseLong(args[0]);
	long n = N;
	boolean isAPrimeFactor;
	System.out.print("Prime factors of " + N + " are: ");
	for(int i = 2; i <= n; i++){ //i <= n/i
	  isAPrimeFactor = false;
	  while(n % i == 0){
	    n /= i;
		//System.out.print(i + " "); <<< this version prints out each occurence of the prime factor
		isAPrimeFactor = true;
	  }//all factors of curr i have been extracted => any remaining factors of n are greater than curr i
	  
	  //comment this out if full display of all prime factors desired
	  if(isAPrimeFactor){
	    System.out.print(i + " "); //<< this version only prints out each prime factor once
	  }
	}//end for
	
	if(n > 1){
	  System.out.print(n); //final residual piece of n is prime
	}
	System.out.println();
	
	//example of continue statement: prints out only odds between 1 and 10
	//for(int i = 1; i <= 10; ++i){
	  //if(i % 2 == 0) continue;
	  //else System.out.println(i);
	//}
	
	
	//example of do-while loop, which always executes at least once
	//generate random points on unit circle
	/*double x;
	double y;
	int count = 0;
	int maxIters = Integer.parseInt(args[1]);
	for(int i = 1; i <= maxIters; ++i){
	  do{
	
	    x = 1.0 - 2.0 * Math.random(); //points in (-1,1]
	    y = 1.0 - 2.0 * Math.random();
	    ++count;
	  }while(Math.sqrt(x*x + y*y) > 1.0); //keep generating points until one inside unit circle generated
	  
	}//end for loop
	double avgIters = count * 1.0/maxIters;
	System.out.println(avgIters + " avg number of iters to gen pt in unit disk over " + maxIters + " trials.");
	System.out.println("Relative err between actual and expected number of iters per trial >>> " );
	System.out.println((100.0* Math.abs(avgIters - 4.0 / Math.PI) /(4.0 / Math.PI) ) + "%");
	*/
	
  }
}