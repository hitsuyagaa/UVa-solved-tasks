import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(in.hasNextInt()){
			int n = in.nextInt();
			if(n == 1) System.out.println(n);
			else System.out.println(n + n/2);
		}
		in.close();
	}
}

/*
* 1 --> 1 ( 1 leftover )		
* 2 --> 3 ( 1 borrowed - 1 leftover )
* 3 --> 4 ( 1 leftover )
* 4 --> 6 ( 1 borrowed - 1 leftover )
* 5 --> 7 ( 1 borrowed - 1 leftover )
* 6 --> 9 ( 1 borrowed - 1 leftover )
* 7 --> 10 ( 1 leftover ) 
* 8 --> 12 ( 1 borrowed - 1 leftover )
* 9 --> 13 (
* 
* n % 2 == 0  n + n/2 
* 
*/