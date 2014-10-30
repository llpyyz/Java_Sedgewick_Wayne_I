public class Dec2Bin{

  public static void main(String[] args){
  
    int N = Integer.parseInt(args[0]);
	int v = 1;
	while(v <= N/2){
	  v *= 2;
	}
	//v is now largest power of 2 not exceeding N
	
	int n = N; 
	System.out.print("The binary representation of " + N + " is >>> ");
	while(v > 0){
	
	  //if current val of n is less than curr power of 2, then need smaller power of two to represent n => print '0' and move on
	  if(n < v){
	    System.out.print(0);
	  }
	  //if currn >= curr pow of 2, then need this power of 2 in binary representation => print '1', move on
	  else{
	    System.out.print(1);
		n -= v; //this reduces n by curr pow of 2 whenever that weight is used
	  }
	  v /= 2; //generate next lowest pow of 2 to test against curr n
	}
	System.out.println();
  }
}