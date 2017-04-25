import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int lines = in.nextInt();
		int i = 0;
		
		while(i < lines){
			long sum = in.nextInt();
			long dif = in.nextInt();
			long number1 = (sum + dif)/2;
			
			if(dif == 0 && sum % 2 == 0){
				System.out.println("" + sum/2 + " " + sum/2); 
				i++;
				continue;
			}
			if( (sum + dif) % 2 == 0 ){
				if( (number1 - dif) + number1 == sum && (number1-dif) >= 0) {
					System.out.println("" + number1 + " " + (number1-dif));
					i++;
					continue;
				}
			}
			i++;
			System.out.println("impossible");
		}
		in.close();
	}

}
