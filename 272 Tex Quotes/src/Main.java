import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int index = 0;
		
		while(in.hasNext() ){
			String current = in.nextLine();
			String out = "";
			if(current.equals("exit")) break;
			for(int i = 0; i < current.length(); i++){
				if(current.substring(i,i+1).equals("\"") && index % 2 == 0){
					out = out + "``";
					index++;
				} else if (current.substring(i,i+1).equals("\"") && index % 2 == 1){
					out = out + "''";
					index++;
				} else {
					out = out + current.charAt(i);
				}
			}
			System.out.println(out);
		}
		//System.out.println(out);
		in.close();
	}
}
