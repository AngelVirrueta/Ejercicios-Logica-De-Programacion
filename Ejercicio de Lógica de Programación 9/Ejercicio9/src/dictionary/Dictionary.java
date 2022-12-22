package dictionary;

import java.util.HashMap;

public class Dictionary {
	
	
	HashMap <String, String> data = new HashMap <String, String>();
	
	
	public Dictionary (HashMap<String, String> data) {
		this.data = data;
	}
	
	public void findWord (String word) {
		if (data.get(word.toLowerCase()) == null) {
			System.out.println("La palabra no fue encontrada en la data del diccionario.");
		}else {
			System.out.println("La traducción al inglés es: " + data.get(word.toLowerCase()) + ".");
		}
	}
	
	

}
