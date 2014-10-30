public class RandomWalker{

  public static void main(String[] args){
  
    int N = Integer.parseInt(args[0]);
	int numTrials = Integer.parseInt(args[1]);
	int x;
	int y;
	double rnd;
	
	int count;
	int maxMoves = 0;
	int minMoves = 0;
	
	int cumulativeCount = 0;
	int xPosCount = 0;
	int xNegCount = 0;
	int yPosCount = 0;
	int yNegCount = 0;
	
	int max = 10000;
	for(int k = 1; k <= numTrials; k++){
	  x = 0;
	  y = 0;
	  count = 0;
	  while(Math.abs(x) < N && Math.abs(y) < N && count <= max	){
	
	    //choose direction for next move
	    rnd = Math.random();
	    if(rnd < 0.25){//north
		  y++;
		  yPosCount++;
		}
	    else if(rnd < 0.5){ //east
		  x++;
		  xPosCount++;
		}
	    else if (rnd < 0.75){ //south
		  y--;
		  yNegCount++;
		}
	    else{ //west
 		  x--;
		  xNegCount++;
	    }
		
	    count++;
	  }//end while
	  
	  if(k == 1){
		  maxMoves = count;
		  minMoves = count;
	  }
	  else{
		
		if(count > maxMoves)
		  maxMoves = count;
			
		if(count < minMoves)
		  minMoves = count;
	  }
	  cumulativeCount += count;
	  
	}//end for
	System.out.println("Stats:\n");
	System.out.println("Number of trials: " + numTrials);
	System.out.println("Avg total moves per trial: " + (cumulativeCount*1.0/numTrials));
	System.out.println("Avg total moves in pos x direction per trial: " + (xPosCount*1.0/numTrials));
	System.out.println("Avg total moves in pos y direction per trial: " + (yPosCount*1.0/numTrials));
	System.out.println("Avg total moves in neg x direction per trial: " + (xNegCount*1.0/numTrials));
	System.out.println("Avg total moves in neg y direction per trial: " + (yNegCount*1.0/numTrials));
	System.out.println("Max moves in a trial: " + maxMoves + "; min moves in a trial: " + minMoves);
	
  }//end main
  
}//end class RandomWalker