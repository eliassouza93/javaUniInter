package empresa;

public class livro {
	protected String titulo;
	protected autor autor;
	protected String genero;
	protected int ediçao;
	protected String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public autor getAutor() {
		return autor;
	}
	public void setAutor(autor autor) {
		this.autor = autor;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getEdiçao() {
		return ediçao;
	}
	public void setEdiçao(int ediçao) {
		this.ediçao = ediçao;
	}
	
	public livro(String titulo, autor autor, String genero, int ediçao) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.ediçao = ediçao;
	}
	 public livro () {}
	 
	 public void info() {
		 System.out.println("Titulo livro: " + titulo);
		 System.out.println("Genero do Livro: " + genero);
		 System.out.println("Ediçao: " + ediçao);
		 autor.info();
	 }
	
}
