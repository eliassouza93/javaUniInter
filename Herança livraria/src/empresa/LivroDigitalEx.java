package empresa;

public class LivroDigitalEx {
	public String autor;
	public float custoProdu�ao;
	public float pre�oVenda;
	public String titulo;
	public int paginas;
	public String linkDownload;
	public int tamanhoMB;
	
	public float lucro() {
		return pre�oVenda - custoProdu�ao;
	}
	public void imprimirTitulo() {
		System.out.println("O titulo: " + titulo);
	}
	public float imposto() {
		return 0.2f * lucro() +2;
	}
	public float tamanhoPorPagina() {
		return tamanhoMB/(float)paginas;
	}
}



