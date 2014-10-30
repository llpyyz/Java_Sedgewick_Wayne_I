public class MonteHall{

  public static void main(String[] args){
  
    long n = Long.parseLong(args[0]);
	double rnd;
	int guess;
	int door;
	long wins = 0;
	long losses = 0;
	//first strategy: switch
	for(int i = 1; i <= n; i++){
	
	  //gen winning door
	  rnd = Math.random();
	  if(rnd < 1.0/3){
	    door = 1;
	  }
	  else if(rnd < 2.0/3){
	    door = 2;
	  }
	  else{
	    door = 3;
	  }
	  
	  //contestant 1st guess
	  rnd = Math.random();
	  if(rnd < 1.0/3){
	    guess = 1;
	  }
	  else if(rnd < 2.0/3){
	    guess = 2;
	  }
	  else{
	    guess = 3;
	  }
	  
	  if(door == guess){ //first guess correct => switch is a guaranteed loss
	    losses++;
	  }
	  else{ //first guess incorrect => switch is a guaranteed win
	    wins++;
	  }
	  
	  
	}//end for
	double wp1 = wins*100.0/n;
	System.out.println("You had " + wins + " wins in " + n + " trials, a winning percentage of " + wp1);
	
	//second strategy do not switch
	wins = 0;
	losses = 0;
	for(int i = 1; i <= n; i++){
	
	  //gen winning door
	  rnd = Math.random();
	  if(rnd < 1.0/3){
	    door = 1;
	  }
	  else if(rnd < 2.0/3){
	    door = 2;
	  }
	  else{
	    door = 3;
	  }
	  
	  //contestant 1st guess
	  rnd = Math.random();
	  if(rnd < 1.0/3){
	    guess = 1;
	  }
	  else if(rnd < 2.0/3){
	    guess = 2;
	  }
	  else{
	    guess = 3;
	  }
	  
	  if(door == guess){ //first guess correct => no switch is a guaranteed wins
	    wins++;
	  }
	  else{ //first guess incorrect => no switch is a guaranteed loss
	    losses++;
	  }
	}//end for
	
	double wp2 = wins*100.0/n;
	System.out.println("You had " + wins + " wins in " + n + " trials, a winning percentage of " + wp2);
	
	if(wp1 > wp2){
	  System.out.println("The best strategy is to switch; you are about " + (wp1/wp2) + " times more likely to win this way");
	}
	else{
	  System.out.println("The best strategy is to switch; you are about " + (wp2/wp1) + " times more likely to win this way");
	}
	
  }//end main
  
}//end class MonteHall