import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int testCases = in.nextInt();
			if(testCases == 0) break;
			int divisionPointX = in.nextInt();
			int divisionPointY = in.nextInt();
			while(testCases-- > 0){
				int currentX = in.nextInt();
				int currentY = in.nextInt();
				if(currentX > divisionPointX && currentY > divisionPointY) System.out.println("NE");
				else if(currentX > divisionPointX && currentY < divisionPointY) System.out.println("SE");
				else if(currentX < divisionPointX && currentY > divisionPointY) System.out.println("NO");
				else if(currentX < divisionPointX && currentY < divisionPointY) System.out.println("SO");
				else if(currentX == divisionPointX || currentY == divisionPointY) System.out.println("divisa");
			}
		}
		in.close();
	}

}
