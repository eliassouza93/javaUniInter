package segundoProjetoIMC;

import java.util.Scanner;

public class imcPrincipal {

	public static void main(String[] args) {
		System.out.println("Por favor digite seu peso (Kg)");
		Scanner teclado = new Scanner(System.in);
		
		float peso = teclado.nextFloat();
		
		System.out.println("Digite sua altura (m)");
		
		float altura = teclado.nextFloat();
		
		float imc = peso / (altura*altura);
		
		System.out.printf("Seu IMC ?:" + imc);
		
		
		
	}

}
