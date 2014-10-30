public class RelativelyPrime{

  public static void main(String[] args){
  
    long x = Long.parseLong(args[0]);
	long a;
	long b;
	long temp;
	//make x the larger of the two
	
	for(int i = 1; i <= x; i++){
	  
	  for(int j = 1; j <= x; j++){
        a = i;	  
	    b = j;
	  
	    while(b != 0){
	      temp = b;
	      b = a % b;
	      a = temp;
	    }//while  
	    if(a == 1){
		  System.out.print(" r ");
		}
		else{
		  System.out.print(" n ");
		}
	  }//for
	  System.out.println();
	}//for
  }
}