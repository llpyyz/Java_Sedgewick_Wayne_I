public class WindChill{

  public static void main(String[] args){
  
    double t = Double.parseDouble(args[0]);
	double v = Double.parseDouble(args[1]);
	if(Math.abs(t) > 50.0 || v < 3.0 || v > 120.0){
	  System.out.println("Error: t must be between -50 and 50 and v must be between 3 and 120");
	}
	else{
	  double wc = 35.74 + 0.6215 * t + (0.4275 * t - 35.75)* Math.pow(v, 0.16);
	  System.out.println("For a thermometer reading of " + t + " and a wind speed of " + v + "mph, the wind chill is");
	  System.out.println("   " + wc);
	}
	
  }
}