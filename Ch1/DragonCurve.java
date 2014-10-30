public class DragonCurve{

  public static void main(String[] args){
  
    String dc0 = "F";
	
	StringBuilder dc1sb = new StringBuilder(dc0);
	String dc1 = dc1sb.toString() + "L" + dc1sb.reverse().toString().replace('R', 'A').replace('L', 'B').replace('B', 'R').replace('A', 'L');
	
	StringBuilder dc2sb = new StringBuilder(dc1);
	String dc2 = dc2sb.toString() + "L" + dc2sb.reverse().toString().replace('R', 'A').replace('L', 'B').replace('B', 'R').replace('A', 'L');
	
	StringBuilder dc3sb = new StringBuilder(dc2);
	String dc3 = dc3sb.toString() + "L" + dc3sb.reverse().toString().replace('R', 'A').replace('L', 'B').replace('B', 'R').replace('A', 'L');
	
	StringBuilder dc4sb = new StringBuilder(dc3);
	String dc4 = dc4sb.toString() + "L" + dc4sb.reverse().toString().replace('R', 'A').replace('L', 'B').replace('B', 'R').replace('A', 'L');
	
	StringBuilder dc5sb = new StringBuilder(dc4);
	String dc5 = dc5sb.toString() + " L " + dc5sb.reverse().toString().replace('R', 'A').replace('L', 'B').replace('B', 'R').replace('A', 'L');
	
	System.out.println("\n\ndc0 = " + dc0 + "\n\n");
	System.out.println("\n\ndc1 = " + dc1 + "\n\n");
	System.out.println("\n\ndc2 = " + dc2 + "\n\n");
	System.out.println("\n\ndc3 = " + dc3 + "\n\n");
	System.out.println("\n\ndc4 = " + dc4 + "\n\n");
	System.out.println("\n\ndc5 = " + dc5 + "\n\n");
	
	
	
  }
}