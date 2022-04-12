package br.com.generation.aula02;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);	
	
	double i;
	
	System.out.println("Digite um número");
	i = leia.nextInt();
	
	if(i%2 == 0) { 
		
		System.out.println("É um número par");
		i = Math.sqrt(i);
		System.out.println(i);
	}
	
	else { 
		
		System.out.println("É um número ímpar");
		i = i*i; 
		System.out.println(i);
	}
	
	
	}

}
