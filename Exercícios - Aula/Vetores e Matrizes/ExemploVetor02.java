package br.com.genration.vetores;

public class ExemploVetor02 {

	public static void main(String[] args) {
		
		double minhaNota = 0.0;
		double[] notas = new double[3]; //[0]....[1]...[2]
		double minhaNota2;
		
		notas[0] = 9.6;
		notas[1] = minhaNota;
		notas[2] = 7.3;
		
		minhaNota2 = notas[2];
		
		minhaNota = 9.8;
		
		System.out.println("O vetor na posi��o [0]: cont�m: " + notas[0]);
		System.out.println("O vetor na posi��o [1]: cont�m: " + notas[1]);
		System.out.println("O vetor na posi��o [2]: cont�m: " + minhaNota2);

	}

}
