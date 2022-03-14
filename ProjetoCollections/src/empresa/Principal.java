package empresa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Principal {

	public static void main(String[] args) {
		HashMap <String,String> cidades = new HashMap();
		
		cidades.put("Brasil", "Brasilia");
		cidades.put("Uruguai", "Montevideu");
		cidades.put("Argentina", "Buenos Aires");
		System.out.println(cidades);
		System.out.println(cidades.get("Uruguai"));
		
	}

}
