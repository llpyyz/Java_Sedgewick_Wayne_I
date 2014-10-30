public class PowersOfK{

  public static void main(String[] args){
  
    int n = Integer.parseInt(args[0]); //number of powers to print
	int k = Integer.parseInt(args[1]);
	int v = 1;
	int i = 0;
	while(i <= n){
	  System.out.println(k + "^" + i + " = " + v);
	  v *= k;
	  i++;
	}
  }
}