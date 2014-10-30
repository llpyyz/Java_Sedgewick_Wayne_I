public class LoopExamples{

  public static void main(String[] args){
  
    int N = Integer.parseInt(args[0]);
	
	int v = 1;
	while(v <= N/2){
	  v = 2 * v;
	}
	System.out.println("\nlargest power of 2 no more than " + N + " = " + v + "\n");
	
	int sum = 0;
	for(int i = 1; i <= N; ++i){
	  sum += i;
	}
	System.out.println("\nSum from 1 to " + N + " = " + sum + "\n");
	
	int prod = 1;
	for(int i = 1; i <= N; ++i){
	  prod *= i;
	}
	System.out.println("\n" + N + "! = " + prod + "\n");
	
	
	for(int i = 0; i <= N; ++i){
	  System.out.println("\ni = " + i + "; 2*pi*i/N = " + (2.0 * i * Math.PI /(1.0 * N)) + "\n");
	}
	
	String ruler = " ";
	// a val such as N = 100 produces an OutOfMemory error
	for(int i = 1; i <= N; ++i){
	
	  ruler = ruler + i + ruler;
	}
	System.out.println("\n" + ruler + "\n");
	
	int n = 123456789;
	int m = 0;
	while(n != 0){
	  m = 10 * m + n % 10; //peel off rightmost digit of n, add to 10 * m
	  n /= 10; //reduce n by one digit
	}
	//m should be reversal of n
	System.out.println("m = " + m);
	
	m = 0;
	n = 123456789;
	while(n != 0){
	  m += n % 10; //peel off rightmost digit of n, add to 10 * m
	  n /= 10; //reduce n by one digit
	}
	//m = sum of digits of n
	System.out.println("m = " + m);
	
	//this loop prints out th first 16 Fibonacci numbers with f_0 = 0; f_1 = 1; f_n = f_n-1 + f_n-2 for n >= 2
	long f = 0, g = 1;
	int M = Integer.parseInt(args[1]);
	double ratio;
	double gr = (1.0 + Math.sqrt(5.0))/2.0;
	for(int i = 0; i <= M; ++i){
	
	  System.out.print(f);  
	  f = f + g;
	  g = f - g;
	  if(i > 0){
	    ratio = (1.0 * f ) / (1.0 * g);
	    System.out.print( " ratio = " + ratio + " rel error = " + 100.0 *Math.abs(ratio - gr)/gr + "%");
	  } 
	  System.out.println();
	}//end for loop
	
	//estimate sum of reciprocal of squares of pos ints converges to pi^2/6
	double sum2 = 0.0;
	long maxTerms = 5000000;
	for(long i = 1 ; i <= maxTerms; ++i){
	  sum2 += 1.0/(i * i);
	}
	System.out.println("\n\nThe sum of the first " + maxTerms + " of the sum of reciprocal squares = " + sum2);
	System.out.println("Rel error = " + Math.abs(Math.pow(Math.PI, 2.0)/6.0 - sum2) * 6.0 / Math.pow(Math.PI, 2.0) );
  }
}