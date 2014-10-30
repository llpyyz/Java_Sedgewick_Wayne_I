public class RandomInt2{

  //Takes two integers a and b and returns a random uniform int between a and b inclusive
  //Assumes a <= b
  public static void main(String[] args){
  
    int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	double r = Math.random(); //uniform double between 0 and 1
	int n = (int) (r * (b - a) + a); //uniform int between a and b inclusive
	System.out.println(n);
  }
}