package empresa;

public class principal {

	public static void main(String[] args) {
		
		livroDigital ld = new livroDigital("Senhos dos aneis" , 
				new autor ("Tolkien", "Britanico","token@email.com"),
				"Aventura",5,1000,3500);
		ld.info();

	}

}
