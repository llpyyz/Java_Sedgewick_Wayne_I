public class LoanPmt{

  public static void main(String[] args){
    int t = Integer.parseInt(args[0]); //t in years
	double P = Double.parseDouble(args[1]); //loan principal
	double r = Double.parseDouble(args[2]); //annual rate, compounded ctsly
	
	double i = Math.exp(r/12.0) - 1.0;
	double pmt = P * (i + i/(Math.pow(1 + i , 12 * t) - 1));
	double bal = P;
	double interestPortion;
	double principalPortion;
	
	System.out.println("For a principal of " + P + ", paid back over " + t + " years, at an annual cts rate of " + r );
	System.out.println("The montly pmt = " + pmt);
	
	System.out.println("Month\tpmt amt \t        interest paid \t        principal paid \t        new balance");
	
	for(int j = 1; j <= 12 * t; j++){
	
	  interestPortion = bal * i;
      principalPortion = pmt - interestPortion;
	  bal -= principalPortion;
	  if(bal <= 0.0001) bal = 0.0;
	  System.out.println(j + "\t" + pmt + "\t" +  interestPortion + "\t" + principalPortion + "\t" + bal);
	}
	
  }
}