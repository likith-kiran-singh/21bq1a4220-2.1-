class Producer14 implements Runnable{
	Q14 q;
	Producer14(Q14 q){
		this.q=q;
		new Thread(this,"Producer").start();
	}
	public void run() {
		int i=0;
		while(true) {
			q.put(i++);
		}
	}
}
