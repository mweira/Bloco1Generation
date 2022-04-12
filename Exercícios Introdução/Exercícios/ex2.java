package br.com.generation.aula01;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {

	int dias, meses, anos;
	
	Scanner leia = new Scanner(System.in);
		
	System.out.println("Quantos dias de vida você tem ? ");
	dias = leia.nextInt(); 
	
	anos = dias / 365; 
	dias = dias%365;
	meses = dias/30;
	dias = dias%30;
	
	System.out.println(anos);
	System.out.println(meses);
	System.out.println(dias);
	
	
	}

}
