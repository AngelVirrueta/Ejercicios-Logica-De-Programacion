package dictionaryGame;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class DictionaryGame {
	
	
	static HashMap <String, String> data = new HashMap <String, String>(); // un hashmap estático para usar en nuestros métodos.
	
	
	public DictionaryGame (HashMap<String, String> data) { // el constructor usara la data recibida al momento de instanciar el objeto como base de datos para que el juego funcione
		DictionaryGame.data = data;
	}
	

	
	public String[] fiveRandomWords() {	// método para crear un arreglo de 5 palabras random de la data recibida al momento de crear nuestro objeto.
	Random random = new Random(); // instanciamos un objeto random
	String[] keys = DictionaryGame.data.keySet().toArray(new String[0]); // creamos un arreglo usando todas las keys de nuestro HM recibido al momento de instaciar nuestro juego.
	String[] palabrasAUsar = {keys[random.nextInt(keys.length)], keys[random.nextInt(keys.length)], keys[random.nextInt(keys.length)], keys[random.nextInt(keys.length)], keys[random.nextInt(keys.length)] }; // creamos un segundo arreglo de solo 5 elementos escogidos al azar del arreglo anterior.
		return palabrasAUsar;
	}


	
	public void play () { // Método para ejecutar el juego
		String[] palabrasAUsar = fiveRandomWords(); // Guardamos en una variable el array random generado al invocar el metodo anterior.
		Scanner sc = new Scanner(System.in);
		String word; // variable para almacenar la palabra en ingles que ingrese el usuario
		int correctas = 0; // variable para almacenar respuestas correctas
		int incorrectas = 0; // variable para almacenar respuestas incorrectas
		System.out.println("Bienvenido al juego del Diccionario Español-Inglés\nIngresarás la traducción al inglés de las siguientes 5 palabras...");
		for (String palabra : palabrasAUsar) { // ciclo para iterar sobre nuestro array de 5 palabras random.
			System.out.println(palabra + ": "); // imprimimos en pantalla la palabra random del arreglo
			word = sc.nextLine(); // guardamos temporalmente la palabra al ingles ingresada por el usuario
			if (word.toLowerCase().equals(DictionaryGame.data.get(palabra))) { // convertimos esa palabra en ingles ingresada por el usuario a minusculas, y comparamos con el value (palabra en ingles en HM) que le corresponde a ese key en el HM.
				correctas++; // si coinciden, es punto correcto
			}else {
				incorrectas++; // si no coinciden, es punto incorrecto
			}
		}
		sc.close();
		System.out.println("Has terminado.\nTuviste...\nRespuestas correctas: " + correctas + "\nRespuestas incorrectas: " + incorrectas); // imprimimos resultados
		
	}
	

}
