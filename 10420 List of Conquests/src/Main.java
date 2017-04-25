import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		TreeMap<String, Integer> countrys = new TreeMap<String, Integer>();
		
		int lines = in.nextInt();
		int i = 0;
		
		
		
		while(i < lines){
			String currentCountry = in.next();
			in.nextLine();
			if(countrys.containsKey(currentCountry)){
				countrys.put(currentCountry,countrys.get(currentCountry)+1);
			} else {
				countrys.put(currentCountry, 1);
			}
			i++;
		}
		
		for (String country : countrys.keySet()){
            String key = country;
            int value = countrys.get(country);  
            System.out.println(key + " " + value);  
		} 
		in.close();
	}
}
