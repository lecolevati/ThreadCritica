package view;

import java.util.concurrent.Semaphore;

import controller.ThreadOperacaoSemaforo;

public class VisaoOperacaoSemaforo {

	public static void main(String[] args) {
		Semaphore semaphore = new Semaphore(1);
		for (int i = 1 ; i <= 5 ; i++){
			Thread t = new ThreadOperacaoSemaforo(i, semaphore);
			t.start();
		}
		
	}

}
