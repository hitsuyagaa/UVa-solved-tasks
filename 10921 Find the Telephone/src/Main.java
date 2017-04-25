import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<String , Integer> map = new HashMap<String, Integer> ();
		
		map.put("ABC", 2);
		map.put("DEF", 3);
		map.put("GHI", 4);
		map.put("JKL", 5);
		map.put("MNO", 6);
		map.put("PQRS", 7);
		map.put("TUV", 8);
		map.put("WXYZ", 9);
		
		while(in.hasNextLine()){
			String currentLine = in.nextLine();
			String out = "";
			for(int i = 0; i < currentLine.length(); i++){
				int number = giveNumber(map, currentLine.charAt(i));
				if(number >= 2 && number <= 9){
					out = out + number;
				} else {
					out = out + currentLine.charAt(i);
				}
			}
			System.out.println(out);
		}
		in.close();
	}
	
	public static int giveNumber(HashMap<String, Integer> map, char c){
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
		    if(entry.getKey().contains(""+c)) return entry.getValue();
		}
		
		return 0;
	}
}
