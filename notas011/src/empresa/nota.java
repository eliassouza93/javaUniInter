package empresa;

public class nota {
	private double nota1;
	private double nota2;
	
	public void setNota1(double nota) {
		if(nota<0 || nota>10) {
			System.out.println("Nota Invalida");
			return;
		}
		nota1 = nota;
	}
	public void setNota2(double nota) {
		if(nota<0 || nota>10) {
			System.out.println("Nota Invalida");
			return;
		}
		nota2 = nota;
		
	}
	public double getNota1() {
		return nota1;
	}
	public double getNota2() {
		return nota2;
	}
	
	
	void resultado() {
		double media = (nota1 + nota2)/2;
		
		if(media <4) {
			System.out.println("Reprovado");
		}
		else if (media <7) {
			System.out.println("Exane Final");
		}
		else {
			System.out.println("Aprovado");
		}
		
	}
}

