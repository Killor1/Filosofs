
public class Cobert {
	
	private boolean agafat;
	
	public Cobert() {
		this.agafat = false;
	}
	
	public synchronized void agafar() {
		try {
			while (agafat) wait();
			this.agafat = true;
			notifyAll();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}
	
	public synchronized void deixar(){
		this.agafat = false;
		notifyAll();
	}	
}
