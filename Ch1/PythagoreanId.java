public class PythagoreanId{

  public static void main(String[] args){
  
    double theta = Double.parseDouble(args[0]);
	System.out.println("sin(" + theta + ")^2 + cos(" + theta +")^2 = " + (Math.sin(theta) * Math.sin(theta) + Math.cos(theta) * Math.cos(theta)));
  }
}