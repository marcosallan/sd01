package n1sd;

public class ThreadRunnable implements Runnable {
	
	public String name;
	public long time;
	
	public ThreadRunnable(String name, long time) {
		this.name = name;
		this.time = time;
		new Thread(this).start();
		try {
			Thread.sleep(time);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		System.out.println(name + " - " + time + "[ms] para pr�xima execu��o");
		System.out.println("Fim da execu��o para " + Thread.currentThread().getName());
	}
}
