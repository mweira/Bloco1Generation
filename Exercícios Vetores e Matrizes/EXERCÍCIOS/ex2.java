package br.com.generation.aula04;

import java.util.Scanner;

public class ex2 {
	
	public static void main(String[] args) {
	
	int x = 0, y = 0, maior = 0;
		
	Scanner leia = new Scanner(System.in);
	
	int[] vetor = new int[10]; 
	
	for(int i = 0; i < 10; i++) { 
		
		System.out.println("Digite um valor : ");
		vetor[i] = leia.nextInt();
		y = vetor[i];
		x = x + y;
		
		}
			System.out.println("A média aritmética dos valores equivale a " + (x/10));
	}
} 

