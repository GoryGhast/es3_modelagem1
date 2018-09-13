package br.com.fatec;

import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Execucao {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Selecione a periodicidade da geração "
				+ "de eventos\n1 - A cada 5s\n2 - Entre 1~10s");

		int escolha = leitor.nextInt();
		leitor.close();

		if (escolha == 1) {
			Evento primeiroEvento = new Evento(5, 1);
			Evento.historicoEventos.add(primeiroEvento);
			SayHello.imprimirEventos();
			primeiroEvento.start();

		} else if (escolha == 2) {
			int randomFirstWaitTime = TestRandom.getRandomNumberInRange(1, 5);
			
//			cria primeiro evento enviando primeiro tempo de espera
//			e número '1', identificando-o como primeiro evento
			Evento primeiroEvento = new Evento(randomFirstWaitTime, 1);
			Evento.historicoEventos.add(primeiroEvento);
			SayHello.imprimirEventos();
			Evento.random = true;
			primeiroEvento.start();
			
		}

	}

}