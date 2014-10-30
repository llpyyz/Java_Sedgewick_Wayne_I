public class MyExponentialExperiments{

  public static void main(String[] args){
  
    double x = Double.parseDouble(args[0]);
	long count = 0;
	long start;
	long end;
	long et = 0;
	
	//test nested loops version to compute e^x
	double term = 0.0;
	double sum = 0.0;
	
	while(et <= 10000){
	
	  start = System.currentTimeMillis();
	  
	  term = 1.0;
	  sum = 0.0;
	  for(int n = 1; sum != sum + term; n++){
	
	    sum += term;
	    term = 1.0;
	    for(int i = 1 ; i <= n ; i++) term *= x/i;
	  }//end loop    
	  
	  end  = System.currentTimeMillis();
	  et += end - start;
	  count++;
	}//end while
	
	System.out.println("Using nested for loops, computed e^" + x + " =  " + sum + " a total of " + count + " times in " + et + "ms; an avg of " + (count * 1.0/et) + " time per second\n");
	
	//test using single loop and sum != sum + term condition
	et = 0;
	count = 0;
	while(et <= 10000){
	
	  start = System.currentTimeMillis();
	  
	  term = 1.0;
	  sum = 0.0;
	  for(int i = 1; sum != sum + term; i++){
	
	    sum += term;
	    term *= x/i;
	  }  
	  
	  end = System.currentTimeMillis();
	  et += end - start;
	  count++;
	}//end while
	System.out.println("Using a single for loop, computed e^" + x + " =  " + sum + " a total of " + count + " times in " + et + "ms; an avg of " + (count * 1.0/et) + " time per second\n");
	
	//test using single loop and term > 0 condition
	et = 0;
	count = 0;
	while(et <= 10000){
	
	  start = System.currentTimeMillis();
	  
	  term = 1.0;
	  sum = 0.0;
	  for(int i = 1; term > 0; i++){
	
	    sum += term;
	    term *= x/i;
	  }  
	  
	  end = System.currentTimeMillis();
	  et += end - start;
	  count++;
	}//end while
	System.out.println("Using a single for loop, computed e^" + x + " =  " + sum + " a total of " + count + " times in " + et + "ms; an avg of " + (count * 1.0/et) + " time per second\n");
	
  }
}