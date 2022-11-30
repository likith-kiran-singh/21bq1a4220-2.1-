
class Consumer14 implements Runnable{
	Q14 q;
	Consumer14(Q14 q){
		this.q=q;
		new Thread(this,"Consumer").start();
	}
	public void run() {
		while(true) {
			q.get();
		}
	}
}
