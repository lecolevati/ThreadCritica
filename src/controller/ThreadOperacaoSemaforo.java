package controller;

import java.util.concurrent.Semaphore;

public class ThreadOperacaoSemaforo extends Thread {
	
	private int idThread;
	private static double resultado;
	private Semaphore semaforo;
	
	public ThreadOperacaoSemaforo(int idThread, Semaphore semaforo) {
		this.idThread = idThread;
		this.semaforo = semaforo;
	}

	@Override
	public void run() {
		try {
			semaforo.acquire();
			operacao();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaforo.release();
		}
		
	}

	private void operacao(){
		resultado = 0;
		if (idThread % 2 == 0){
			for (int i = 1 ; i <= 100 ; i++){
				resultado = resultado + (1 /(double) i);
			}
			System.out.println(resultado);
		} else {
			for (int i = 1 ; i <= 100 ; i++){
				resultado = resultado + i;
			}
			System.out.println(resultado);
			
		}
	}
	
}
