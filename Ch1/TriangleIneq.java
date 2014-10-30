public class TriangleIneq{

  public static void main(String[] args){
    int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	int c = Integer.parseInt(args[2]);
	
	boolean res = (a >= b + c) || (b >= a + c) || (c >= a + b);
	System.out.println("Impossible for numbers " + a + ", " + b + " and " + c  + " to be the sides of a triangle? >>> " + res);
  }
}