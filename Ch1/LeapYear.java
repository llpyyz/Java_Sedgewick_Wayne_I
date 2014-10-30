public class LeapYear{

  public static void main(String[] args){
  
    int year = Integer.parseInt(args[0]);
	boolean isLeapYear;
	isLeapYear = (year % 4 == 0); //year div by 4?
	isLeapYear = isLeapYear && (year % 100 != 0); //year not divisible by 100
    isLeapYear = isLeapYear || (year % 400 == 0); //but make exception if year div by 400
    System.out.println("Is " + year + " a leap year? >>> " + isLeapYear);	
  }
}