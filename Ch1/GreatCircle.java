public class GreatCircle{

  public static void main(String[] args){
  
    double x1 = Double.parseDouble(args[0]);
	double y1 = Double.parseDouble(args[1]);
	double x2 = Double.parseDouble(args[2]);
	double y2 = Double.parseDouble(args[3]);
	
	double x1r = Math.toRadians(x1);
	double x2r = Math.toRadians(x2);
	double y1r = Math.toRadians(y1);
	double y2r = Math.toRadians(y2);
	
	double d = 60 * Math.toDegrees(Math.acos(Math.sin(x1r) * Math.sin(x2r) + Math.cos(x1r) * Math.cos(x2r) * Math.cos(y1r - y2r)));
	
	System.out.println("The great circle distance between x1 = " + x1 + " deg N; y1 = " + y1 + " deg W and x2 = " + x2 + " deg N; y2 = " + y2 + " deg W is >>>");
	System.out.println("   " + d + " nautical miles");
  }
}