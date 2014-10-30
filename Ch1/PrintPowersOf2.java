public class PrintPowersOf2{

  public static void main(String[] args){
  
    int N = Integer.parseInt(args[0]);
	int powOf2  = 1;
	if(N > 0){
	  
	  while(powOf2 <= N){
	    System.out.println(powOf2);
		powOf2 *= 2;
	  }
	}//end while
  }
}