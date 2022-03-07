package empresa;

public class livroDigital extends livro {
	public String linkDownload;
	public int tamanhoMB;
	
	public livroDigital(String titulo, String autor, String linkDownload) {
		super(titulo, autor);
		this.linkDownload = linkDownload;
	}

	public float imposto() {
		return 0.f* lucro() + 2;
	}
	public float tamanhoPorPagina() {
		return tamanhoMB/(float)paginas;
	}
	public void imprimirImposto() {
		System.out.println("Imposto livro Fisico" + super.imposto());
		System.out.println("Imposto livro Fisico" + imposto());
	

		
		
	}
	
}
