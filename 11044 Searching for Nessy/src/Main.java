import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		while(testCases-- > 0){
			int var1 = in.nextInt()/3;
			int var2 = in.nextInt()/3;
			System.out.println(var1*var2);
		}
		in.close();
	}
}
