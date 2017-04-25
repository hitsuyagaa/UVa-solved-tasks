import java.util.Scanner;

public class Main {
	//Doesn't work for Words with several Whitespaces 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Scanner test;
		while(in.hasNextLine()){
			String currentLine = in.nextLine();
			test = new Scanner(currentLine);
			String out = "";
			while(test.hasNext()){
				String currentWord = test.next();
				if(currentWord.equals("exit")) break;
				
				for(int i = currentWord.length() - 1; i >= 0; i--){
					out = out + currentWord.charAt(i);
				}
				out = out + " ";				
			}
			
			if(out.length() >= 1)
				System.out.println(out.substring(0, out.length()-1));
			else
				System.out.println("");
		}
		in.close();
	}

}
