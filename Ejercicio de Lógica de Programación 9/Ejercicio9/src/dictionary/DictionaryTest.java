package dictionary;

import java.util.HashMap;
import java.util.Scanner;

public class DictionaryTest {

	public static void main(String[] args) {

		HashMap<String, String> data = new HashMap<String, String>();
		data.put("pollito", "chicken");
		data.put("gallina", "hen");
		data.put("lapiz", "pencil");
		data.put("pluma", "pen");
		data.put("ventana", "window");
		data.put("puerta", "door");
		data.put("techo", "ceiling");
		data.put("piso", "floor");
		data.put("almohada", "pillow");
		data.put("cama", "bed");
		data.put("mesa", "table");
		data.put("silla", "chair");
		data.put("dedos", "fingers");
		data.put("cabeza", "head");
		data.put("brazos", "arms");
		data.put("piernas", "legs");
		data.put("naranja", "orange");
		data.put("manzana", "apple");
		data.put("uva", "grape");
		data.put("fresa", "strawberry");
		
		Dictionary diccionario = new Dictionary(data);
		
		Scanner sc = new Scanner (System.in);
		String palabra;

		
		System.out.println("Bienvenido al Diccionario Español-Inglés\nIngresa una palabra en español:");
		palabra = sc.next();
		sc.close();
		
		diccionario.findWord(palabra);
	}

}
