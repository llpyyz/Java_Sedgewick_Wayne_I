public class Checkerboard{

  public static void main(String[] args){
  
    int N = Integer.parseInt(args[0]);
	for(int i = 1; i <= N ; i++){
	  for(int j = 1; j <= N; j++){
	    if((i + j) % 2 == 0)
		  System.out.print(" w ");
		else
		  System.out.print(" b ");
	  }
	  System.out.println();
	}
  }
}