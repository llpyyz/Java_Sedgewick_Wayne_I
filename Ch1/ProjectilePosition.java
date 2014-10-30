public class ProjectilePosition{

  public static void main(String[] args){
 
    double x0 = Double.parseDouble(args[0]); 
	double v0 = Double.parseDouble(args[1]);
	double t = Double.parseDouble(args[2]);
	double g = 9.78033;
	
	System.out.println("After " + t + " seconds, a projectile thrown straight up with initial position " + x0 + " and initial velocity " + v0 + " has total displacement of");
	System.out.println((x0 + v0 * t + 0.5 * g * t * t) + " meters");
	
  }
}