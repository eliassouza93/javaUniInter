package empresa;

public class principal {

	public static void main(String[] args) {
		
		
		avaliaçao mario = new avaliaçao(7,4,10);
		
		mario.n1=8;
		mario.n2=3;
		mario.n3=4;
		
		System.out.println("Media aritimetica do Mario:" + mario.mediaAritmetica());
		System.out.println("Media ponderada do Mario:" + mario.mediaPonderada());
		


	}

}
