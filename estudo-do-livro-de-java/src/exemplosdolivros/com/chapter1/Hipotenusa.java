package exemplosdolivros.com.chapter1;

public class Hipotenusa {

	public static void main(String[] args) {
		double a = 3; // PRIMEIRO LADO DO TRI�NGULO
		double b = 5; // SEGUNDO LADO DO TRI�NGULO
		double h = 0; // LADO DA HIPOTENUSA COM INICIO 0
		
		// EQUA��O PARA RESOLVER A HIPOTENUSA
		
		h = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
		System.out.println(h);  // MOSTRA O RESULTADO NA TELA

	}

}
