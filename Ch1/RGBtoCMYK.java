public class RGBtoCMYK{

  public static void main(String[] args){
  
    int r = Integer.parseInt(args[0]);
	int g = Integer.parseInt(args[1]);
	int b = Integer.parseInt(args[2]);
	double c;
	double m;
	double y;
	double k;
	
	if(r == 0 && g == 0 && b == 0)
	{
	  c = 0.0;
      m = 0.0;
      y = 0.0;
	  k = 1.0;
	}
	else
	{
	  double w = Math.max( (1.0 * r) / 255.0, Math.max((1.0 * g) / 255.0 , (1.0 * b) / 255.0));
	  c = (w - (1.0 * r )/255.0) / w;
	  m = (w - (1.0 * g) /255.0) / w;
	  y = (w - (1.0 * b) /255.0) / w;
	  k = 1.0 - w;
	}
	
	System.out.println("For (r,g,b) = (" + r + ", " + g + ", " + b + "), the CYMK values are:");
	System.out.println("   c = " + c);
	System.out.println("   m = " + m);
	System.out.println("   y = " + y);
	System.out.println("   k = " + k);
  }
}