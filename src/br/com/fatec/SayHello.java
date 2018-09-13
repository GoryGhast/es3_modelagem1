package br.com.fatec;

import java.security.Timestamp;

public class SayHello implements Runnable {

	//static pra sempre i++ toda iteração, contar nº de vezes que
	//passou por esse metodo
	private static int i = 1;
	
	private Evento ev;
	
	public SayHello(Evento ev) {
		this.ev = ev;
	}
	
	public SayHello() {
	}

	public void run(Timestamp timestamp) {
		
//		System.out.println("\nHello world " + ev.getNumeroEvento() + " " + timestamp +"\n");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	public static void imprimirEventos() {
		
		//reimprime a lista todas as vezes
		/*
		for (Evento temp : Evento.historicoEventos) {
			System.out.println(temp);
		}
		*/
		
		//imprime somente o último elemento
		Evento ultimoElemento = Evento.historicoEventos.get(Evento.historicoEventos.size() - 1);
		System.out.println(ultimoElemento);
	}
	
}