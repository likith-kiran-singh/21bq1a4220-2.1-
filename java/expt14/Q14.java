class Q14{
	int n;
	boolean val=false;
	synchronized int get() {
		while(!val)
			try {
			    Thread.sleep(1000);
				wait();
			}
			catch(InterruptedException e) {
				System.out.println("Interrupted"+e);
			}
			System.out.println("got:"+n);
			val=false;
			notify();
			return n;
	}
	synchronized void put(int n) {
		while(val)
			try {
			    Thread.sleep(1000);
				wait();
			}
		catch(InterruptedException e) {
			System.out.println("Interrupted"+e);
		}
		this.n=n;
		val=true;
		System.out.println("put:"+n);
		notify();
	}
}
