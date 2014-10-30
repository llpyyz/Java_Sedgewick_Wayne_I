public class Checksum{

  public static void main(String[] args){
  
	String isbn = args[0];
	//String isbn = s;
    int d;
	int sum = 0;
    for(int i = 0; i < 9 ; i++){
	  d = Integer.parseInt(isbn.substring(i, i+1));
      sum = (sum + (10 - i) * d ) % 11;
	System.out.println("sum = " + sum + "\n");
    }
	sum = 11 - sum;
	if(sum == 10){
	  isbn = isbn.concat("X");
	}
	else if(sum == 11){
	  isbn = isbn.concat("0"); 
	}
	else{
	  isbn = isbn.concat("" + sum); 
	}
	System.out.println("ISBN: " + isbn + "\n");
  }//end main
  
}//end class Checksum