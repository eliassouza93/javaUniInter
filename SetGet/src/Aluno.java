
public class Aluno {
	private String nome;
	private int idade;
	
	public void setNome(String nome) {
		if(nome == "elias") {
			this.nome=nome;
			System.out.println(nome + " Sobre nome Souza");
		}
		else {
			System.out.println(nome + " Sobre nome qualquer...");
		}
	}
	public String getNome() {
		return nome;
	}
	
	
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if(idade>0 && idade <100) {
			this.idade = idade;
			System.out.println("Idade cadastrada com sucesso");
			
		}
		else {
			System.out.println("Erro no sistema....");
			
		}
	}

}
