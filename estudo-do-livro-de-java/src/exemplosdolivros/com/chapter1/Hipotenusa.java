package exemplosdolivros.com.chapter1;

public class Hipotenusa {

	public static void main(String[] args) {
		double a = 3; // primeiro lado do tri�ngulo
		double b = 4; // segundo lado do tri�ngulo
		double h = 0; // lado da hipotenusa com inicio 0
		
		// Equa��o para resolver a hipotenusa
		
		h = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
		System.out.println(h);  // mostra o resultado na tela.

	}

}
