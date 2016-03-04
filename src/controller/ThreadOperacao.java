package controller;

public class ThreadOperacao extends Thread {
	
	private int idThread;
	private static double resultado;
	
	public ThreadOperacao(int idThread) {
		this.idThread = idThread;
	}

	@Override
	public void run() {
		operacao();
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
