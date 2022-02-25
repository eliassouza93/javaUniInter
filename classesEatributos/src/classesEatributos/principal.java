package classesEatributos;

import java.util.ArrayList;

public class principal {

	public static void main(String[] args) {
		turma nova = new turma();
		
		nova.prof = new professor();
		nova.prof.nome="Leonardo";
		nova.alunos= new ArrayList<aluno>();
		nova.alunos.add(new aluno());
		nova.alunos.get(0).nome="superAluno";
			
		

	}

}
