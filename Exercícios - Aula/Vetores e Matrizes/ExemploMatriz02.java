package br.com.genration.matrizes;

import java.util.Scanner;

public class ExemploMatriz02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a quantidade de Linhas da Matriz: ");
		int linhas = entrada.nextInt();
		System.out.println("Digite a quantidade de Colunas da Matriz: ");
		int colunas = entrada.nextInt();		
		
		double[][] notasAlunos = new double[linhas][colunas];
		
		System.out.println("****Notas dos Alunos****");
		for(int l = 0; l < notasAlunos.length; l++) {
			for(int c = 0; c < notasAlunos[l].length; c++) {
				System.out.printf("Digite às notas %d %d: " , l,c);
				notasAlunos[l][c] = entrada.nextDouble();				
			}
			System.out.println();
		}
		//Impressão da Matriz...
		for(int l = 0; l < notasAlunos.length; l++) {
			  //parado na linha [1]
			for(int c = 0; c < notasAlunos[l].length; c++) {
				System.out.print(notasAlunos[l][c] + " | ");
			}
			System.out.println();
		}
	}
}
