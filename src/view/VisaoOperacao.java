package view;

import controller.ThreadOperacao;

public class VisaoOperacao {

	public static void main(String[] args) {
		
		for (int i = 1 ; i <= 5 ; i++){
			Thread t = new ThreadOperacao(i);
			t.start();
		}
		
	}

}
