package teste;

public class CarroTestar {
	//atributos
	String nome;
	String marca;
	int ano;
	int vel;
	String dono;
	
	//metodos a baixo
	void acelerar (int aceleraçao) {
		vel +=aceleraçao;
		
	}
	void freiar(int reduzir) {
		vel -=reduzir;
	}
	void buzinar() {
		System.out.println("bibibi");
	}
	void dono() {
		System.out.println("Elias de Souza");
	}
}

