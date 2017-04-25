import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
		TreeMap<Character, Character> map = new TreeMap<Character, Character>();
		String b = "QWERTYUIOP[]ASDFGHJKLM;ZXCVBNM,.`1234567890-";
		String a = "WERTYUIOP[]\\SDFGHJKL;,'XCVBNM,./1234567890-=";
		for(int i = 0; i < a.length(); i++){
			map.put(a.charAt(i), b.charAt(i));
		}
				
		
		Scanner in = new Scanner(System.in);
		
		while(in.hasNextLine()){
			String currentLine = in.nextLine();
			String out = "";
			for(int i = 0; i < currentLine.length(); i++){
				if(map.containsKey(currentLine.charAt(i))){
					out = out + map.get(currentLine.charAt(i));
				} else {
					out = out + currentLine.charAt(i);
				}
			}
			System.out.println(out);
		}
		in.close();
	}

}
