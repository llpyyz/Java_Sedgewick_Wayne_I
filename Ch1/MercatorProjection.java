public class MercatorProjection{

  public static void main(String[] args){
  
    double lambda0 = Double.parseDouble(args[0]); //all three args read in as degrees => each converted to radians below
	double lat = Double.parseDouble(args[1]);
	double lng = Double.parseDouble(args[2]);
	
	double x = Math.PI/180.0 * (lng - lambda0);
	double y = 0.5 * Math.log( (1.0 + Math.sin(Math.PI/180.0 * lat)) / (1.0 - Math.sin(Math.PI/180.0 * lat)) );
	
	System.out.println("For a point with latitude " + lat + " and longitude " + lng + " and map centered at longitude " + lambda0 + ":");
	System.out.println("  Mercator coords are x = " + x + " y = " + y);
  }
}