package br.com.generation.aula01;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	
	double nota1, nota2, nota3, total;
	
	System.out.println("Digite a primeira nota : ");
	nota1 = leia.nextDouble(); 
	
	System.out.println("Digite a segunda nota : ");
	nota2 = leia.nextDouble(); 
	
	System.out.println("Digite a terceira nota : ");
	nota3 = leia.nextDouble(); 
	
	total = (nota1*2.3 + nota2*5.0 + nota3*2.7)/10; 
	
	System.out.println(total);
			
	}

}
