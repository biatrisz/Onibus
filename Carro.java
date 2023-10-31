package Veículos;

public class Carro extends veiculos {

	public Carro(String placa, String modelo, String cor, int ano) {
		super(placa, modelo, cor, ano);

	}
	public void acelerar() {
		System.out.println("o carro esta acelerando");
	}
	public void frear () {
		System.out.println("O carro esta freiando");
	}

	public void virar() {
		System.out.println("O carro esta virando");
	}
	public void ligar() {
		System.out.println("O carro esta ligando");
	}
	}

	