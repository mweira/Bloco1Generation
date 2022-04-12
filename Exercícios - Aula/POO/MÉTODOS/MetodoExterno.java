package br.com.generation.metodos;

public class MetodoExterno {
	
	public static String metodo08(int i, int f) {
		
		String numeroTexto = "";
		
		for(int c = i; c <= f; c++) {
			numeroTexto += c + " ";
		}
		
		return numeroTexto;
		
	}

}
