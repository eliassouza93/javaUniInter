package reversoTerceiro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class reversoPrincipal {

	public static void main(String[] args) {
		
		ArrayList<String> nomes = new ArrayList();
		
		Scanner teclado = new Scanner(System.in);
		String msg;
		System.out.println("Digite quantos nomes ira einserir: ");
		int total = teclado.nextInt();
		System.out.println("Digite os nomes: ");
		for(int i=0; i<total; i++) {
			msg = teclado.next();
			nomes.add(msg);
		}
		System.out.println("Ordem normal");
		for(String nome : nomes) {
			System.out.println(nome);
		}
		System.out.println("Ordem reversa");
		Collections.reverse(nomes);
		System.out.println(nomes);
		
		
		

	}

}
