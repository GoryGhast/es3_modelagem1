package br.com.fatec;

public class TestRandom {

	public static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}
		
		int numero = (int)(Math.random() * ((max  - min) + 1)) + min; 
		
		//System.out.println(numero);
		
		return numero;
		
	}

}