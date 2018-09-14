package br.com.fatec;

public class SayHello implements Runnable {
	
	public SayHello() {
	}

	@Override
	public void run() {	
	}
	
	public static void imprimirEventos() {
	/*
	  	for (Evento temp : Evento.historicoEventos) { //reimprime a lista todas as vezes
			System.out.println(temp);
		}
	*/
		Evento ultimoElemento = Evento.historicoEventos.get(Evento.historicoEventos.size() - 1);
		System.out.println(ultimoElemento);
	}
}