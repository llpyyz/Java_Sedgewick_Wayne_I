//Sedgewick & Wayne, p. 83 Exercise 1.3.32
//Implemented by David Schonberger 3/4/14

public class SumOfCubesTwoWays{

  public static void main(String[] args){
  
    long N = Long.parseLong(args[0]);
	long first = 0, second = 0;
	boolean innerLoopBreak = false;
	boolean outerLoopBreak = false;
	   for(long i = 1; i <= N; i++){
	   
	     for(long a = 1; a * a * a <= N -1; a++){
		  for(long b = a; b <= N - a * a * a; b++){
		    if(a * a * a + b * b * b == i){
			  innerLoopBreak = true;
			  first = a;
			  second = b;
			  break;
			} 
		  }//for
		  
		  if(innerLoopBreak){ break;} //exit outer loop
		  
		}//for
		
		if(innerLoopBreak){innerLoopBreak = false; /*System.out.println("\n***Just broke out of first double for loop: i = " + i + "; " + first + ", " + second + " ***\n");*/}
		
		//look for second distinct pair whose cubes sum to i
		for(long c = 1; c * c * c <= N - 1; c++){
		  for(long d = 1; d * d * d <= N - c * c * c; d++){
		    if(c * c * c + d * d * d == i && Math.min(first,second) != Math.min(c,d) && Math.max(first,second) != Math.max(c,d)){
			  System.out.println(i + " = " + first + "^3 + " + second + "^3 = " + (first * first * first) + " + " + (second * second * second) + " and ...");
			  System.out.println(i + " = " + c + "^3 + " + d + "^3 = " + (c * c * c) + " + " + (d * d * d) + "\n\n");
			  innerLoopBreak = true;
			  break;
			}//if
		  }//for
		  
		  if(innerLoopBreak){innerLoopBreak = false; /*outerLoopBreak = true;*/ break;} //exit outer loop
		  
		}//for
		if(outerLoopBreak){break;}
		
	   }//outer most for	
		
  }//main
}