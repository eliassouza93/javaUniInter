package leonidas;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite seu palpite: ");
		
		int palpite = teclado.nextInt();
	
		
		while(palpite!=1000) {
			if(palpite < 1000) {
				System.out.println("Um pouco mais...");
			}
			else {
				System.out.println("Um pouco menos...");
			}
			System.out.println("Digite seu pr�ximo palpite: ");
			palpite = teclado.nextInt();
		}
		System.out.println("Est� correto!");

	}

}
