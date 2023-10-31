package Veículos;

public class Onibus extends veiculos {

	public Onibus(String placa, String modelo, String cor, int ano) {
		super(placa, modelo, cor, ano);	
	}
	public void acelerar() {
		System.out.println("o onibus esta acelerando");
	}
	public void frear () {
		System.out.println("O onibus esta freiando");
	}

	public void virar() {
		System.out.println("O onibus esta virando");
	}
	public void ligar() {
		System.out.println("O onibus esta ligando");
	}
}
