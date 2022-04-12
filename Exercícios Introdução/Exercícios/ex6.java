package br.com.generation.aula01;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		
		int x1, y1, x2, y2; 
		double D;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um valor para x1 : ");
		x1 = leia.nextInt();
		
		System.out.println("Digite um valor para y1 : ");
		y1 = leia.nextInt();
		
		System.out.println("Digite um valor para x2 : ");
		x2 = leia.nextInt();
		
		System.out.println("Digite um valor para y2 : ");
		y2 = leia.nextInt();
		
		D = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		
		System.out.println("O valor de D será : " + D);
		
		
	}
}
