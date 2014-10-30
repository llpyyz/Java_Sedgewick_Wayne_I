public class SumOfSines{

  public static void main(String[] args){
  
    double t = Double.parseDouble(args[0]);
	System.out.println("sin(2*" + t + ") + sin(3*" + t + ") = " + (Math.sin(2*t) + Math.sin(3*t)));
  }
}