import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		while(testCases-- > 0){
			int n = in.nextInt();
			System.out.println( Math.abs((((((((n*567)/9)+7492)*235)/47)-498)/10)%10)  );
		}
		in.close();
	}
}
