public class TestThreeForEquality{

  public static void main(String[] args){
  
    int x = Integer.parseInt(args[0]);
	int y = Integer.parseInt(args[1]);
	int z = Integer.parseInt(args[2]);
	
	if(x == y && y == z) System.out.println("All three of " + x + " " + y + " " +  z + " are equal");
	else System.out.println("Not all three of " + x + " " + y + " " +  z  + " are equal");
  }
}