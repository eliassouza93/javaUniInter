package Carro;

public class Carro {
	String nome;
	String marca;
	String cor;
	float vel;

	
	void nome(String Ka) {
		System.out.println("Ford ka");
	}
	void marca(String Ford) {
		System.out.println("Ford");
		
	}
	void acelerar(int acelera�ao) {
		vel += acelera�ao;
		
	}
	void freiar(int acelera�ao) {
		vel -= acelera�ao;
	}
}
