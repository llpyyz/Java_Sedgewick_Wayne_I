public class PrintPractice{

  public static void main(String[] args){
  
    for(int i = 1000; i <= 2000; i++){
	
	  if(i > 1000 && i % 5 == 0) System.out.print("\n" + i + " ");
	  else System.out.print(i + " ");
	}
  }
}