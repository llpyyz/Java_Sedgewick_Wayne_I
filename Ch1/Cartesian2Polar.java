public class Cartesian2Polar{

  public static void main(String[] args){
  
    double x = Double.parseDouble(args[0]);
	double y = Double.parseDouble(args[1]);
	double r = Math.sqrt(x*x + y*y);
	double theta = Math.atan2(y,x);
	System.out.println("The point with Cartesian coords (" + x + ", " + y + ") has polar coords (r,theta): " );
	System.out.println("  r = " + r );
	System.out.println("  theta = " + theta + " [radians]; theta = " + (theta*180.0/Math.PI) + " [degrees]");
  }
}