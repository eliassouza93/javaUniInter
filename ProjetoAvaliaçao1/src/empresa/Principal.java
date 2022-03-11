package empresa;

public class Principal {

	public static void main(String[] args) {
		
		Avaliaçao mario = new Avaliaçao ();
		mario.n1 = 8;
		mario.n2 = 5;
		mario.n3 = 6;
		
		Avaliaçao ana = new Avaliaçao ();
		ana.n1 = 6;
		ana.n2 = 9;
		ana.n3 = 5;
		
		System.out.println("Media aritimetica do Mario:" + mario.mediaPonderada());
		System.out.println("MEdia aritimetica da Ana é : " + ana.mediaAritimetica() + "E a ponderada é " + ana.mediaPonderada());
		
	}
 
}
