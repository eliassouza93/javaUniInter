package empresa;

public class livro {
	public String autor;
	public float custoProdu�ao;
	public float pre�oVenda;
	public String titulo;
	public int paginas;
	
	public livro() {
		
	}
	
	public livro(String titulo, String autor ) {
		this.titulo = titulo;
		this.autor = autor;
		
		
	}
	
	public float lucro() {
		return pre�oVenda - custoProdu�ao;
	}
	
	public void imprimirTitulo() {
		System.out.println("O titulo: " + titulo);
	}
	public float imposto() {
		return 0.2f * lucro();
	}
}
