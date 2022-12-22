package dictionaryGame;

import java.util.HashMap;


public class DictionaryGameTest {

	public static void main(String[] args) {
		HashMap<String, String> data = new HashMap<String, String>(); // Se crea un hashmap para darle una BD (data) a nuestro diccionario-juego
		data.put("pollito", "chicken"); // se agregan palabras a la BD(data)
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
		
		DictionaryGame diccionario = new DictionaryGame(data); // creamos nuestro juego de diccionario pasando nuestro mapa como BD.
		diccionario.play(); // le damos jugar

	}
	

}
