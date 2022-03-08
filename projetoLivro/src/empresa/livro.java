package empresa;

public class livro {
	protected String titulo;
	protected autor autor;
	protected String genero;
	protected int edi�ao;
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
	public int getEdi�ao() {
		return edi�ao;
	}
	public void setEdi�ao(int edi�ao) {
		this.edi�ao = edi�ao;
	}
	
	public livro(String titulo, autor autor, String genero, int edi�ao) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.edi�ao = edi�ao;
	}
	 public livro () {}
	 
	 public void info() {
		 System.out.println("Titulo livro: " + titulo);
		 System.out.println("Genero do Livro: " + genero);
		 System.out.println("Edi�ao: " + edi�ao);
		 autor.info();
	 }
	
}
