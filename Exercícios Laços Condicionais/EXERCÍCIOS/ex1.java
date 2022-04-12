package br.com.generation.aula02;

import java.util.Scanner;

public class ex1 {
	
		public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);	
		
		int a, b, c; 
		
		System.out.println("Digite um valor para A : ");
		a = leia.nextInt();
		
		System.out.println("Digite um valor para B : ");
		b = leia.nextInt();
		
		System.out.println("Digite um valor para C : ");
		c = leia.nextInt();
				
		if(a<c && b<c) { 
			
			System.out.println("C é o maior");
			
		}
		
		else if(c<a && b<a){ 
			
			System.out.println("A é o maior");
			
		}
		
		else if(a<b && c<b){ 
			
			System.out.println("B é o maior");
			
		}
		
	}

}
