public class IntExperiments{

  public static void main(String[] args){
    int a = Integer.MAX_VALUE;
	
	System.out.println(a); //prints 2147483647 (2^31 - 1)
	System.out.println(a + 1); //prints -2147483647 => overflow, wraps around to smallest negative int
	System.out.println(2 - a); //prints -2147483645 => no overflow here since -a is in range and so is 2 + (-a) = 2 - a
	System.out.println(-2 - a);  //prints 2147483647 => -a = -2147483647 so -a - 1 = -2147483648 and -a - 2 wraps around to largest pos int
	System.out.println(2 * a); //2*a = a + a = (a + 1) + (a - 1) = (-a - 1) + (a - 1) = -2
	System.out.println(4 * a); // 4 * a = 2a + 2a = -2 + -2 = -4
	System.out.println(8 * a + 3); // 4 * a  + 4 * a + 3 = -4 + (-4) + 3 = -5
  }
}