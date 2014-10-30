public class PrintChars{

  public static void main(String[] args){
    System.out.println('b');
	System.out.println('b' + 'c'); //adds unicode decimals 98+99 to yield 197
	System.out.println((char) ('a' + 4)); //adds unicode decimals 97 + 4 to give 101 then decodes as 'e'
  }
}