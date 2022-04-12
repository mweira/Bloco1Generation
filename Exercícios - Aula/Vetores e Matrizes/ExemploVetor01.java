package br.com.genration.aula04;

public class ExemploVetor01 {

	public static void main(String[] args) {
		//Vetor --> cole��o de dados...

		int[] arrayVetor = new int[5];//[0]...[4]
		
		//Vetor --> � um array de uma �nica dimens�o.
		arrayVetor[0] = 5;
		arrayVetor[3] = 250;
		
		for(int i = 0; i <= 4; i++) {
			System.out.println("Posi��o: " + i + " | " + arrayVetor[i]);
		}		
	}
}
