package br.com.generation.classes01;

public class TestaVeiculo {

	public static void main(String[] args) {
		
		Veiculo carro = new Veiculo();
		Veiculo moto = new Veiculo();
		
		carro.tipo = "hatch";
		carro.modelo = "Fusca";
		carro.marca = "Volkswagen";
		carro.ano = 1985;
		carro.cor = "Azul";
		carro.velocidade = 0;
		
		carro.acelerar(60);
		System.out.println(carro.modelo);
		System.out.println(carro.tipo);
		System.out.println("Velocidade: " + carro.velocidade);
		System.out.println();
		
		carro.freiar(30);
		System.out.println(carro.modelo);
		System.out.println(carro.tipo);
		System.out.println("Velocidade: " + carro.velocidade);
		System.out.println();
		
		moto.modelo = "Fan";
		moto.marca = "Honda";
		moto.velocidade = 0;
		System.out.println(moto.modelo);
		System.out.println(moto.marca);
		System.out.println("Velocidade da Moto: " + moto.velocidade);
		moto.acelerar(50);
		System.out.println("Velocidade da Moto: " + moto.velocidade);
		moto.freiar(15);
		System.out.println("Velocidade da Moto: " + moto.velocidade);
	}

}
