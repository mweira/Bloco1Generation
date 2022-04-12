package br.com.generation.aula01;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in); 
	
	int totalSegundos, segundos, minutos, horas; 
	
	System.out.println("Digite o tempo em segundos : ");
	totalSegundos = leia.nextInt();
	
	horas = totalSegundos/3600; 
	minutos = (totalSegundos%3600)/60;
	segundos = (totalSegundos%3600)%60;

	System.out.println(horas);
	System.out.println(minutos);
	System.out.println(segundos);

	}

}
