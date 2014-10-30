public class ISBNCheckSum{

  public static void main(String[] args){
  
    String s = args[0];
	System.out.println("s.length = " + s.length());
	String lastChar;
	int cs = 0;
	int weight = 10;
	for(int i = 0; s.length() > 0; i++){
	
	  lastChar = s.substring(s.length() - 1, s.length());
	  s = s.substring(0, s.length() - 1);
	  cs += Integer.parseInt(lastChar) * weight--;
	}//for
	
	int csMod11  = (cs % 11);
	if(csMod11 == 0){
	  System.out.println("cd = " + 0);
	}
	else if(csMod11 < 10){
	  System.out.println("cd = " + (11 - csMod11));
	}
	else{
	  System.out.println("cd = " + "X");
	}
	
	
  }//main
}