package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int a, b, c = 0;
		Scanner soma = new Scanner(System.in);
		System.out.println("Introduza dois n�meros:");
		a = soma.nextInt();
		b = soma.nextInt();
		c = a + b;
		System.out.println("A soma do primeiro e segundo n�mero � :" + c);
}
}