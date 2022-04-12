package br.com.generation.encapsulamento;

public class TestaCarro {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		Carro c2 = new Carro();
		
		c2.setModelo("Civic");
		c2.setMarca("Honda");
		c2.setCor("Preto");
		c2.setAno(2021);
		
		c1.setModelo("Fusca");
		c1.setMarca("Volks");
		c1.setCor("Vermelho");
		c1.setAno(025);
		
		System.out.println("Modelo: " + c1.getModelo());
		System.out.println("Marca: " + c1.getMarca());
		System.out.println("Cor: " + c1.getCor());
		System.out.println("Ano: " + c1.getAno());
		c1.acelerar();
		System.out.println();
		System.out.println("Modelo: " + c2.getModelo());
		System.out.println("Marca: " + c2.getMarca());
		System.out.println("Cor: " + c2.getCor());
		System.out.println("Ano: " + c2.getAno());
		c2.acelerar();
	}

}
