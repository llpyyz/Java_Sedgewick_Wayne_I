public class FunctionGrowth{


  public static void main(String[] args){
  
    int lower = 16;
	int upper = 2048;
	System.out.println("Log(N) \t                N \tN*Log N \t        N^2 \t\tN^3 \t        2^N");
	for(int i = lower; i <= upper; i *= 2){
	
	  System.out.println(Math.log(i) + "\t" + i + "\t" + i * Math.log(i) + "\t" + Math.pow(i * 1.0, 2.0) + "\t\t" + Math.pow(i * 1.0, 3.0) + "\t\t" + Math.pow(2.0 , i * 1.0));
	  
	}
  }
}