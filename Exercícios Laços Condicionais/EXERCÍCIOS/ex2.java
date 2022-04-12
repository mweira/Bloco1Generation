package br.com.generation.aula02;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner (System.in);	
	
	int a, b, c; 
	
	System.out.println("Digite um valor para A : ");
	a = leia.nextInt();
	
	System.out.println("Digite um valor para B : ");
	b = leia.nextInt();
	
	System.out.println("Digite um valor para C : ");
	c = leia.nextInt();
			
	if(a<b && b<c) { 
		
		System.out.println("A ordem crescente : \n" + a + "\n" + b + "\n" + c);
	} 
	
	else if(b<a && a<c){ 
		
		System.out.println("A ordem crescente : \n" + b + "\n" + a + "\n" + c);
		
	}
	
	else if(c<b && b<a){ 
		
		System.out.println("A ordem crescente : \n" + c + "\n" + b + "\n" + a);
		
	}
	
	else if(b<c && c<a){ 
		
		System.out.println("A ordem crescente : \n" + b + "\n" + c + "\n" + a);
		
	}
	
	else if(c<a && a<b){ 
		
		System.out.println("A ordem crescente : \n" + c + "\n" + a + "\n" + b);
		
	}
	
	else if(a<c && c<b){ 
		
		System.out.println("A ordem crescente : \n" + a + "\n" + c + "\n" + b);
		
		}
	
	}

}
