package empresa;

public class Principal {

	public static void main(String[] args) {
		
		Avalia�ao mario = new Avalia�ao ();
		mario.n1 = 8;
		mario.n2 = 5;
		mario.n3 = 6;
		
		Avalia�ao ana = new Avalia�ao ();
		ana.n1 = 6;
		ana.n2 = 9;
		ana.n3 = 5;
		
		System.out.println("Media aritimetica do Mario:" + mario.mediaPonderada());
		System.out.println("MEdia aritimetica da Ana � : " + ana.mediaAritimetica() + "E a ponderada � " + ana.mediaPonderada());
		
	}
 
}
