public class MonthAndDayCheck1{

  public static void main(String[] args){
  
    int m = Integer.parseInt(args[0]);
	int d = Integer.parseInt(args[1]);
	
	boolean res = (m >= 3) && (m <= 6);
	boolean march = m == 3;
	boolean april = m == 4;
	boolean may = m == 5;
	boolean june = m == 6;
	res = res && ( ( march && d >= 20 && d <= 31) || (april && d >= 1 && d <= 30 ) || (may && d >= 1 && d <= 31 )  || (june && d >= 1 && d <= 20 ) );
	System.out.println("For month = " + m + " and day = " + d + ", is the date between 3/20 and 6/20 inclusive?:" );
	System.out.println("   " + res);
  }
}