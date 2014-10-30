public class SumDice{

  //sums to random ints between 1 and 6 to simulate rolling two dice
  public static void main(String[] args){
  
	double r = Math.random(); //uniform double between 0 and 1
	int d1 = (int) (5 * r  + 1); //uniform int between 1 and 6 inclusive
	r = Math.random(); //uniform double between 0 and 1
	int d2 = (int) (5 * r  + 1); //uniform int between 1 and 6 inclusive
	
	System.out.println(d1 + " + " + d2 + " = " + (d1+d2));
  }
}