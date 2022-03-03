package empresa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class principal {

	public static void main(String[] args) {
		LinkedList<String> pessoas = new LinkedList();
		
		pessoas.add("Mario");
		pessoas.add("Luigi");
		pessoas.add("Peach");
		pessoas.add("Yoshi");
		System.out.println(pessoas.get(0));
		pessoas.remove(1);
		System.out.println(pessoas);
		
		HashMap<String, String> capitais = new HashMap();
		capitais.put("Brasil", "Brasilia");
		capitais.put("Argentina", "Buenos-Aires");
		capitais.put("Uruguai", "Montevidéu");
		
		System.out.println(capitais);
		
	}

}
