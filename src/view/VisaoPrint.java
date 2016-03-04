package view;

import controller.ThreadPrint;

public class VisaoPrint {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			Thread t = new ThreadPrint(i);
			t.start();
		}
	}
}
