package Veículos;

public class Principal {
	public static void main(String[] args) {
		
		Carro corvette = new Carro ("32", "F1", "preto", 2023);
		corvette.ligar();
		corvette.acelerar();
		corvette.frear();
		corvette.virar();
		
		System.out.println("-------------------");
		
		Onibus marcopolo = new Onibus ("efe", "111", "branco", 2000);
		marcopolo.ligar();
		marcopolo.acelerar();
		marcopolo.frear();
		marcopolo.virar();
	}

}
