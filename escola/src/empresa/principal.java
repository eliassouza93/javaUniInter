package empresa;

import java.util.ArrayList;

public class principal {

	public static void main(String[] args) {
		aluno a = new aluno();
		a.cpf="233.323.543-2";
		a.nome="Super mario";
		a.matricula=1001;
		
		aluno b = new aluno(1002,"Super mario","555.555.555-8");
		b.info();

	}

}