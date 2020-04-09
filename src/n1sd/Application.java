package n1sd;

import java.util.Random;

public class Application {

	public static void main(String[] args) {
		Random rand = new Random();
		ThreadRunnable tr1 = new ThreadRunnable("Mensagem 0", (long) rand.nextInt(1501) + 500);
		ThreadRunnable tr2 = new ThreadRunnable("Mensagem 1", (long) rand.nextInt(1501) + 500);
		ThreadRunnable tr3 = new ThreadRunnable("Mensagem 2", (long) rand.nextInt(1501) + 500);
	}
	
}
