package textReverser;


public class TextReverser {
	
	
	public TextReverser() {

	}
	
	
	public void textReverser(String texto) {
		for (int i = texto.length()-1; i >= 0; i-- ) {
			System.out.print(texto.charAt(i));
		}
	}
	
}

