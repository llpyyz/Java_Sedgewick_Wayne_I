public class ThreeSort{

  public static void main(String[] args){
  
    int x = Integer.parseInt(args[0]);
	int y = Integer.parseInt(args[1]);
	int z = Integer.parseInt(args[2]);
	
	System.out.println(x + " " + y + " " + z + " sorted in ascending order >>>");
	int low = Math.min(x, Math.min(y,z));
	int high = Math.max(x, Math.max(y,z));
	int middle = Math.min(Math.max(x,y), Math.min(Math.max(x,z), Math.max(y,z)) );
	System.out.println("   " + low + " " + middle + " " + high);
	
  }
}