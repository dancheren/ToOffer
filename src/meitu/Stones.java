package meitu;
import java.util.Scanner;

/*
 * √¿Õº±  ‘
 */
public class Stones {

	public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      while(scan.hasNext()){
    	  int n = scan.nextInt();
    	  System.out.println(canWinNim(n));
      }
	}

	public static boolean canWinNim(int n) {  
        if(n%4 == 0) return false;  
        else return true;  
    }  

}
