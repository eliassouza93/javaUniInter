package teste;

public class Carro {

	public static void main(String[] args) {
		CarroTestar c1 = new CarroTestar();
		//atributos definidos
		c1.nome ="Uno";
		c1.marca="Fiat";
		c1.ano=2015;
		c1.vel=60;
		c1.dono = "Elias de Souza";
		
		c1.acelerar(10);
		System.out.println("A velocidade do veículo é: " + c1.vel + "Km/h");
		c1.freiar(25);
		System.out.println("A velocidade do veículo é: " + c1.vel + "Km/h") ;
		c1.buzinar();
		c1.dono();
		

	}

}
