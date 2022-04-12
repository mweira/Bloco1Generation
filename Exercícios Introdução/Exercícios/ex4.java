package br.com.generation.aula01;

import java.util.Scanner;

public class ex4 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int A, B, C, D, R, S; 
		
		System.out.println("Digite um valor para A : ");
		A = leia.nextInt();
		
		System.out.println("Digite um valor para B : ");
		B = leia.nextInt(); 
		
		System.out.println("Digite um valor para C : ");
		C = leia.nextInt();
		
		R = (A+B)*(A+B); 
		
		S = (B+C)*(B+C); 
		
		D = (R+S)/2; 
		
		System.out.println("O valor de R é : " + R);
		System.out.println("O valor de S é : " + S);
		System.out.println("O valor de D é : " + D);
			
	}

}
