import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] salarys = new int[3];
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		int i = 1;
		while(testCases-- > 0){
			salarys[0] = in.nextInt();
			salarys[1] = in.nextInt();
			salarys[2] = in.nextInt();
			Arrays.sort(salarys);
			System.out.println("Case " + (i++) + ": " + salarys[1]);
		}
		in.close();
	}

}
