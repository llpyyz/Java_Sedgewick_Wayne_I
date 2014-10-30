public class Kary{

  public static void main(String[] args){
  
    //convert int i to base k
	//assuming k is between 2 and 16l using hex digits A-F to represent digits from 10-15
    int i = Integer.parseInt(args[0]);
	int k = Integer.parseInt(args[1]);
	
	int v = 1;
	while(v <= i/k){
	  v *= k;
	}
	//v is now largest power of k not exceeding i
	
	System.out.println("v = " + v);
	
	int n = i; 
	int w = 0; //store weight of curr digit
	String s = "";
	System.out.print("The base " + k + " representation of " + i + " is >>> ");
	while(v > 0){
	
	  //if current val of n is less than curr power of k, then need smaller power to represent n => print '0' and move on
	  if(n < v){
	    System.out.print(0);
		S += "0";
	  }
	  //if curr n >= curr pow of k, then need this power in k-ary representation => print '1', move on
	  else{
	    switch(n / v){
		
		  case 1: System.out.print(1);
		          w = 1;
				  s += "1";
		          break;
		  case 2: System.out.print(2);
		          w = 2;
		          s += "2";
				  break;
		  case 3: System.out.print(3);
		          w = 3;
				  s += "3";
				  break;
		  case 4: System.out.print(4);
		          w = 4;
				  s += "4";
				  break;
		  case 5: System.out.print(5);
		          w = 5;
				  s += "5";
				  break;
		  case 6: System.out.print(6);
		          w = 6;
				  s += "6";
				  break;
		  case 7: System.out.print(7);
		          w = 7;
				  s += "7";
				  break;
		  case 8: System.out.print(8);
		          w = 8;
				  s += "8";
				  break;
		  case 9: System.out.print(9);
		          w = 9;
				  s += "9";
				  break;
		  case 10: System.out.print("A");
		           w = 10;
				   s += "A";
				   break;
	      case 11: System.out.print("B");
		           w = 11;
				   s += "B";
				   break;
		  case 12: System.out.print("C");
		           w = 12;
				   s += "C";
				   break;
		  case 13: System.out.print("D");
		           w = 13;
				   s += "D";
				   break;
		  case 14: System.out.print("E");
		           w = 14;
				   s += "E";
				   break;
		  case 15: System.out.print("F");
		           w = 15;
				   s += "F";
				   break;
		}
	    
		n -= w * v; //this reduces n by curr pow of k whenever that weight is used
	  }
	  v /= k; //generate next lowest pow of k to test against curr n
	}
	System.out.println();
  }
}