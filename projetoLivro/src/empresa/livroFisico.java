package empresa;

public class livroFisico extends livro {
	private int tiragem;
	private int peso;
	public int getTiragem() {
		return tiragem;
	}
	public void setTiragem(int tiragem) {
		this.tiragem = tiragem;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public livroFisico(String titulo, empresa.autor autor, String genero, int edi�ao, int tiragem, int peso) {
		super(titulo, autor, genero, edi�ao);
		this.tiragem = tiragem;
		this.peso = peso;
	}
	public livroFisico() {}
	
	@Override
	public void info() {
		super.info();
		System.out.println("Tiragem: " + tiragem);
		System.out.println("Peso: " + peso);
		
	}
	
	
}
