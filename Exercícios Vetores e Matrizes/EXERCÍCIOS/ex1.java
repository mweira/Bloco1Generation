package br.com.generation.aula04;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
	//Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
	
		int maior = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		int[] vetor = new int[5];	
	
	   for(int i = 0; i <= 4; i++) {
	        System.out.println("Digite um número: ");
	            vetor [i] = leitor.nextInt();

	            if( i == 0) {
	                 maior = vetor[0];
	            }
	            else if(vetor[i] > maior) {
	                maior = vetor[i];
	            }
	        }
	        System.out.println("\nO maior número é o " + maior);
	    }

	}