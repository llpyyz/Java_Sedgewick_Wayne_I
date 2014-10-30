public class NRandomVals{

  public static void main(String[] args){
    
	int N = Integer.parseInt(args[0]);
	double avg, num, numsq;
	double total = 0.0;
	double totalsq = 0.0;
	double stddev;
	
	for(int i = 1; i <= N; ++i){
	  num = Math.random();
	  numsq = num * num;
	  System.out.println(num);
	  total += num;
	  totalsq += numsq;
	}
	avg = total / (1.0 * N);
	stddev = Math.sqrt((totalsq - N * avg * avg)/(1.0 * N - 1.0));
	System.out.println("Avg of " + N + " uniform random vals = " + avg);
	System.out.println("Std dev = " + stddev);
	System.out.println("Rel err of sample mean = " + 100.0 * Math.abs(0.5 - avg)/0.5 + "%");
	System.out.println("Rel err of sample std dev = " + 100.0 * Math.abs(stddev - Math.sqrt(1.0/12.0)) / Math.sqrt(1.0/12.0) + "%");
  }
}