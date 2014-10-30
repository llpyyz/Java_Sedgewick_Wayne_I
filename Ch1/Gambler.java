public class Gambler{

  //stake = initial amount in hand
  //goal = amt at which gambler walks away
  //T = number of trials
  //bets = number of bets placed before either goal reached or ruin
  //wins = number of bets won
  //cash = curr cash on hand
  public static void main(String[] args){
  
    int stake = Integer.parseInt(args[0]);
	int goal = Integer.parseInt(args[1]);
	int T = Integer.parseInt(args[2]);
	int bets = 0;
	int wins = 0;
	int cash;
	int betsWonPerTrial;
	int betsLostPerTrial;
	int totalBetsWonPerWinningTrial = 0;
	int totalBetsWonPerLosingTrial = 0;
	int totalBetsInAllWinningTrials = 0;
	int totalBetsInAllLosingTrials = 0;
	
	for(int t = 0; t < T; ++t){
	  
	  //run one trial
	  cash = stake;
	  betsWonPerTrial = 0;
	  betsLostPerTrial = 0;
	  //totalBetsPerTrial = 0;
	  
	  //while not broke and not at goal
	  while(cash > 0 && cash < goal){
	    //simulate a bet
		bets++;
		if(Math.random() < 0.5){
		  ++cash;
		  ++betsWonPerTrial;
		}
		else{
		  --cash;
		  ++betsLostPerTrial;
		}
	  }//end while loop
	  
	  if(cash == goal){
	    ++wins;
		totalBetsInAllWinningTrials += betsWonPerTrial + betsLostPerTrial;
		totalBetsWonPerWinningTrial += betsWonPerTrial;
	  }
	  else{
	    totalBetsInAllLosingTrials += betsWonPerTrial + betsLostPerTrial;
		totalBetsWonPerLosingTrial += betsWonPerTrial;
	  }
	  
	}//end for loop
	
	
	System.out.println((100.0*wins)/T + "% wins in " + T + " trials");
	System.out.println("Avg number of bets per trial = " + (bets*1.0/T) );
	System.out.println("In the " + wins + " winning trials an avg of " + (100.0 * totalBetsWonPerWinningTrial / totalBetsInAllWinningTrials) + "% of the bets were won");
	System.out.println("In the " + (T - wins) + " wlosing trials an avg of " + (100.0 * totalBetsWonPerLosingTrial / totalBetsInAllLosingTrials) + "% of the bets were won");
	
  }
}