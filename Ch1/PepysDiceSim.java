public class PepysDiceSim{

  public static void main(String[] args){
  
    long n = Long.parseLong(args[0]);
	long ones;
	double rnd;
	long onesCount = 0; //count # times >= 1 '1' came up in exp #1 or >= 2  came up in exp #2
	
	//exp #1
	for(int i = 1; i <= n; i++){
	  ones = 0;
	  for(int j = 1; j <= 6; j++){
	    rnd = Math.random();
		if(rnd < 1.0/6.0){
		  ones++;
		}
	  }//end inner for
	  if(ones > 0)
		  onesCount++;
	}//end outer for
	
	double approx = onesCount * 1.0/n;
	System.out.println(onesCount + " out of " + n  + " trials-- " + (approx*100.0) + "%--yielded at least one '1' in six rolls");
	double exact = 1.0 - Math.pow(5.0/6,6);
	System.out.println("The exact probability = " + exact);
	System.out.println("The error is " + (Math.abs((exact - approx)/exact)) + "\n\n");
	
	//exp #2
	onesCount = 0;
	for(int i = 1; i <= n; i++){
	  ones = 0;
	  for(int j = 1; j <= 12; j++){
	    rnd = Math.random();
		if(rnd < 1.0/6.0){
		  ones++;
		}
	  }//end inner for
	  if(ones > 1)
		  onesCount++;
	}//end outer for
	
	approx = onesCount * 1.0/n;
	System.out.println(onesCount + " out of " + n  + " trials-- " + (100.0*approx) + "%--yielded at least two '1s' in twelve rolls");
	exact = 1.0 - Math.pow(5.0/6,12) - 2 * Math.pow(5.0/6,11);
	System.out.println("The exact probability = " + exact);
	System.out.println("The error is " + (Math.abs((exact - approx)/exact)));
	
  }//end main
}