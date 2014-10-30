public class DoubleExperiments{

  public static void main(String[] args){
    double a = 3.14159;
	System.out.println(a); //prints a
	System.out.println(a+1); //prints 4.14159
	System.out.println(8/(int) a); //prints 2 => a cast to int 3 then 8/3 == 2
	System.out.println(8/a); //prints 8/3.14159 => implicit cast of 8 to 8.0 for float div => approx 2.54648...
	System.out.println((int) (8/a)); //prints 2 => explicitly casts result of floating point div to int
	System.out.println("Math.sqrt(2) * Math.sqrt(2) == 2 ? >>> " + (Math.sqrt(2) * Math.sqrt(2) == 2));
  }
}