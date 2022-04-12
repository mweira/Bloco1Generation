package br.com.generation.aula01;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
	int anos, meses, dias, total; 
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Quantos anos você tem ? ");
	anos = leia.nextInt();
	
	System.out.println("Quantos meses ? ");
	meses = leia.nextInt(); 
			
	System.out.println("Quantos dias ? ");
	dias =leia.nextInt();
			
	anos = anos*365;
	meses = meses*30;
	total = anos + meses + dias;
			
	System.out.println("Você possui " + total + " dias de vida");		

	}

}
