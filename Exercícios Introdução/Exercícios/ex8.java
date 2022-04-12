package br.com.generation.aula01;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
	
	
	double custo, porcentagem, imposto, total; 
	
	Scanner leia = new Scanner(System.in);
	
	
	System.out.println("Qual o custo de fábrica do carro ? ");
	custo = leia.nextDouble();
	
	porcentagem = (0.28)*custo;
	
	imposto = (0.45)*custo;
	
	total = custo + porcentagem + imposto;
	
	System.out.println("O valor total será de : " + total);

	}

}
