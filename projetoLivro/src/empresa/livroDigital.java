package empresa;

public class livroDigital extends livro{
	private int download;
	private double tamanho;
	public int getDownload() {
		return download;
	}
	public void setDownload(int download) {
		this.download = download;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public livroDigital(String titulo, empresa.autor autor, String genero, int ediçao, int download, double tamanho) {
		super(titulo, autor, genero, ediçao);
		this.download = download;
		this.tamanho = tamanho;
	}
	
	
	public livroDigital() {}
	

@Override
public void info() {
	super.info();
	System.out.println("Download: " + download);
	System.out.println("Tamanho: " + tamanho);
	
	
}
}

