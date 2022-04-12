package br.com.generation.encapsulamento;

public class Carro {
	
	//Atributos --> variaveis
	private String modelo;
	private String marca;
	private String cor;
	private int ano;
	
	//M�todos de acesso.. getters and setters
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	
	public void acelerar() {
		System.out.println("Carro acelerando...!!");
	}

}
