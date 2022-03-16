package Carro;

public class Principal {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.vel = 60;
		c1.nome = "Ford ka";
		
		c1.acelerar(20);
		
		
		System.out.println(c1.vel);
		
		c1.freiar(25);
		System.out.println(c1.vel);


	}
}
