package br.com.dio;

import br.com.dio.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato("Azul", 3, "Persa");
		System.out.println(gato);
		gato.setCor("Roxo");
		System.out.println(gato);
	}
}
