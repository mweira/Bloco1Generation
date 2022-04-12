package br.com.genration.vetores;

import java.util.Scanner;

public class ExxemploVetor04 {

	public static void main(String[] args) {

		Scanner entradaVetor = new Scanner(System.in);
		
		System.out.println("Entre com o tamanho do vetor: ");
		int tamanhoVetor = entradaVetor.nextInt();
		
		int[] vetor = new int[tamanhoVetor];
		
		for(int i = 0; i < tamanhoVetor; i++) {
			System.out.println("Digite os valores dentro do Vetor: ");
			vetor[i] = entradaVetor.nextInt();
		}
		for(int i = 0; i < tamanhoVetor; i++) {
			System.out.println("Posição : " + (i+1) + "º " + vetor[i]);
		}
		
		entradaVetor.close();
	}

}
