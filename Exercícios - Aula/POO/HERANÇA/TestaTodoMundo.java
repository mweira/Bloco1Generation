package br.com.generation.heranca;

public class TestaTodoMundo {

	public static void main(String[] args) {
		
		Professor pf1 = new Professor();
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome("Igor Mineiro");
		aluno1.setEndereco("Rua: Dos Mineiros, 560");
		aluno1.setIdade(22);
		aluno1.setCurso("Java");
		aluno1.setSemestre("1º semestre - 2022");
		
		pf1.setNome("Vagner");
		pf1.setEndereco("Rua: Oscar Freire, 250");
		pf1.setIdade(25);
		pf1.setSalario(10000.00);
		pf1.setDisciplina("Lógica de Programação");
		
		System.out.println("Nome: " 		+ pf1.getNome());
		System.out.println("Endereço: " 	+ pf1.getEndereco());
		System.out.println("Idade: " 		+ pf1.getIdade());
		System.out.println("Salário: " 		+ pf1.getSalario());
		System.out.println("Disciplina: " 	+ pf1.getDisciplina());
		
		System.out.println();

		System.out.println("Nome: " 		+ aluno1.getNome());
		System.out.println("Endereço: " 	+ aluno1.getEndereco());
		System.out.println("Idade: " 		+ aluno1.getIdade());
		System.out.println("Curso: " 		+ aluno1.getCurso());
		System.out.println("Semestre: " 	+ aluno1.getSemestre());
	}

}
