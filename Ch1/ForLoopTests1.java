public class ForLoopTests1{

  public static void main(String[] args){
    
	int i,j;
	for(i = 0, j = 0; i < 10; ++i) j += i; //final value of j = 45
	System.out.println("Final val of j = " + j + "\n\n");
	for(i = 0, j = 1; i < 10; ++i) j +=j; //final value of j = 2^9 = 1024
	System.out.println("Final val of j = " + j + "\n\n");
	
	for(j = 0; j < 10; ++j) j += j; // final value of j = 
	System.out.println("Final val of j = " + j + "\n\n");
	
	for(i = 0, j = 5; i < 10; ++i){
	  System.out.println("\n***In 4th loop, i = " + i + "; before statement j = " + j + "***\n");
	  j += j++;
	  System.out.println("\nIn 4th loop, i = " + i + "; after statement j = " + j + "***\n");
	} 
	System.out.println("Final val of j = " + j + "\n\n");
  }
}