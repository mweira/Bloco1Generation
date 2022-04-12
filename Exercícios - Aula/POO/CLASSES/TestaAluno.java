package br.com.generation.classes;

public class TestaAluno {

	public static void main(String[] args) {
		
		Aluno objetoAluno = new Aluno();
		Aluno objetoAluno2 = new Aluno();
		
		objetoAluno.nome  = "Milene";
		objetoAluno.curso = "BootCamp Java";
		objetoAluno.idade = 22;
		
		objetoAluno2.nome = "Jéssica";
		objetoAluno2.curso = "BootCamp Mobile";
		objetoAluno2.idade = 23;
		
		System.out.println("Nome de Alune: "  + objetoAluno.nome);
		System.out.println("Curso de Alune: " + objetoAluno.curso);
		System.out.println("Idade de Alune: " + objetoAluno.idade);
		objetoAluno.estudar();
		objetoAluno.assistirAula();
		
		System.out.println();
		
		System.out.println("Nome de Alune: "  + objetoAluno2.nome);
		System.out.println("Curso de Alune: " + objetoAluno2.curso);
		System.out.println("Idade de Alune: " + objetoAluno2.idade);
		objetoAluno2.estudar();
		objetoAluno2.assistirAula();
	}

}
