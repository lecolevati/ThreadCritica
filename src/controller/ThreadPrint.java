package controller;

public class ThreadPrint extends Thread {

	private int idThread;
	
	public ThreadPrint(int idThread) {
		this.idThread = idThread;
	}

	@Override
	public void run() {
		print();
	}
	
	private void print(){
		System.out.println("A Thread #"+idThread);
		System.out.println("Está mandando");
		System.out.println(idThread+" abraços");
		System.out.println("para todos vocês");
	}
	
}
