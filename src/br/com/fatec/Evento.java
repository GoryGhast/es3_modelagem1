package br.com.fatec;

import java.sql.Timestamp;
import java.util.ArrayList;

public class Evento extends Thread {
	
	public static ArrayList<Evento> historicoEventos = new ArrayList<Evento>();
	int waitTime;
	private int numeroEvento = 1;
	static boolean random = false;
	Timestamp tempoCriacao = new Timestamp(System.currentTimeMillis());
	
	public Evento(int waitTime, int numeroEvento) {
		this.waitTime = waitTime;
		this.numeroEvento=numeroEvento;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(waitTime*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		Evento evento;
		if (random == true) {
			int randomNextWaitTime = TestRandom.getRandomNumberInRange(1, 5);
			evento = new Evento(randomNextWaitTime, getNumeroEvento()+1);
		}else {
			evento = new Evento(5, getNumeroEvento()+1);			
		}
		historicoEventos.add(evento);
		SayHello.imprimirEventos();
		evento.start();
	}
	
	@Override
	public String toString() {
		return "{ Evento " + getNumeroEvento() + " \nTempo Criação: " 
				+ tempoCriacao + "\nTempo Espera:" + waitTime + "}";
	}

	public int getNumeroEvento() {
		return numeroEvento;
	}
}