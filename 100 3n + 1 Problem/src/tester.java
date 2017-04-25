import java.util.Scanner;

public class tester {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){	
			int i = in.nextInt();
			int j = in.nextInt();
			int from = Math.min(i, j);
			int to = Math.max(i, j);
			int count = 1;
			String out = "" + i + " " + j + " ";
			int max = 0;
			while(from <= to){
				count = 1;
				long temp = from;
				while (temp != 1) {
					if (temp % 2 != 0) {
						temp = temp * 3 + 1;
					} else {
						temp = temp / 2;
					}
					count++;
				}
				if(count > max) max = count;
				from++;
			}
			System.out.println(out + max);
		}
		in.close();
	}
}
