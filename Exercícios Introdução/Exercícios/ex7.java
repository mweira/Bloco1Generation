package br.com.generation.aula01;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);	
	
	double a, b, c, d, e, f, X, Y; 
	
	System.out.println("Digite um valor para a");
	a = leia.nextDouble(); 
	
	System.out.println("Digite um valor para b");
	b = leia.nextDouble(); 
	
	System.out.println("Digite um valor para c");
	c = leia.nextDouble(); 
	
	System.out.println("Digite um valor para d");
	d = leia.nextDouble(); 
	
	System.out.println("Digite um valor para e");
	e = leia.nextDouble(); 
	
	System.out.println("Digite um valor para f");
	f = leia.nextDouble(); 
	
	X = (c*e - b*f)/(a*e - b*d); 
	Y = (a*f - c*d)/(a*e - b*d);
	
	System.out.println(X);
	System.out.println(Y);
	}

}
