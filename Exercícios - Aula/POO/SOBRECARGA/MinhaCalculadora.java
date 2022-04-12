package br.com.generation.sobrecarga;

public class MinhaCalculadora {
	
	public int soma(int numero1, int numero2) {
		System.out.println("Soma de Inteiros:");
		return numero1 + numero2;
	}
	
	public double soma(double numero1, double numero2) {
	  System.out.println("Soma de Fracionários:");
		return numero1 + numero2;
	}

}
