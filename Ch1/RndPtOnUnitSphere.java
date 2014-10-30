public class RndPtOnUnitSphere{

  public static void main(String[] args){
  
    //gen rnd point in unit disk
	double a,b,x,y,z;
	do{
	  a = 1.0 - 2.0 * Math.random();
	  b = 1.0 - 2.0 * Math.random();
	}while(Math.sqrt(a * a + b * b) > 1.0); //while outside disk, continue generating pairs
	
	x = 2 * a * Math.sqrt(1 - a * a - b * b);
	y = 2 * b * Math.sqrt(1 - a * a - b * b);
	z = 1 - 2 * (a * a + b * b);
	System.out.println("A random point (x,y,z) on the unit sphere is " + x + " " + y + " " + z);
	System.out.println("Note that x^2 + y^2 + z^2 = " + (x*x + y*y + z*z) + " which verifies that the point is on the unit sphere, within a small tolerance");
  }
}