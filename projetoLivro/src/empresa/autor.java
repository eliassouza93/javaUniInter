package empresa;

public class autor {
	
	private String nome;
	private String nacionalidade;
	private String email;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public autor(String nome, String nacionalidade, String email) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.email = email;
	}
	void info() {
		System.out.println("nome Autor:" + nome);
		System.out.println("Nacionalidade: " + nacionalidade);
		System.out.println("Email: " + email);
	}
	
}
