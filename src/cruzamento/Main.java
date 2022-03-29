package cruzamento;

import java.util.concurrent.Semaphore;

import controller.Cruzamento;

public class Main {

	public static void main(String[] args) {
		int permissoes = 1;
		Semaphore semaforo = new Semaphore(permissoes);
		for (int i = 0; i < 4; i++) {
			Cruzamento t = new Cruzamento(i, semaforo);
			t.start();
		}

	}

}