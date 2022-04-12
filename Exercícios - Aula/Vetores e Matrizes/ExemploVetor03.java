package br.com.genration.vetores;

import java.util.Scanner;

public class ExemploVetor03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);//ctrl + shift + o
		double[] notas = new double[4];//[0]..[1]..[2]...[3] --> 4
		double soma = 0.0, media = 0.0;
		
		System.out.println("Digite as 4 notas do Aluno: ");
		for(int i = 0; i <= 3; i++) {
			System.out.print((i+1) + "º Nota: ");
			notas[i] = entrada.nextDouble();
			soma = soma + notas[i];
			media = soma / (i+1);
		}
		System.out.println("A soma das notas é: " + soma);
		System.out.println("A média é: " + media);		
	}
}
