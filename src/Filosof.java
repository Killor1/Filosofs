public class Filosof extends Thread {
	
	Cobert cobert1;
	Cobert cobert2;
	
	public Filosof(String name, Cobert cobert1, Cobert cobert2) {
		super(name);
		this.cobert1 = cobert1;
		this.cobert2 = cobert2;
	}

	@Override
	public void run() {
		for(;;) {
			cobert1.agafar();
			cobert2.agafar();
			menjar();
			cobert1.deixar();
			cobert2.deixar();
			pensar();
		}		
	}

	private void pensar() {
		try {
			System.out.println(getName() + " ja he menjat i començaré a pensar");
			Thread.sleep((long) Math.random()*8000+2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void menjar() {
		System.out.println(getName() + " estic menjant");
		try {
			Thread.sleep((long) Math.random()*2000+1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}
}