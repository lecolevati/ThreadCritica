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
		System.out.println("Est� mandando");
		System.out.println(idThread+" abra�os");
		System.out.println("para todos voc�s");
	}
	
}
