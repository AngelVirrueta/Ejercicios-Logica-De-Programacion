package textReverser;

import java.util.Scanner;

public class TextReverserTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String texto;
		
		System.out.println("Ingresa una palabra o frase:");
		texto = sc.nextLine();
		sc.close();
		
		TextReverser tr = new TextReverser();
		System.out.println("Tu palabra o frase invertido: ");
		tr.textReverser(texto);
	}

}
