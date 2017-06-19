public class Main {

	public static void main(String[] args) {
		
		Cobert c1 = new Cobert();
		Cobert c2 = new Cobert();
		Cobert c3 = new Cobert();
		Cobert c4 = new Cobert();
		//para que funcione, han de tener un cubierto en comun entre ellos
		Filosof f1 = new Filosof("Plató", c1, c2);
		Filosof f2 = new Filosof("Descartes", c2, c3);
		Filosof f3 = new Filosof("Nietzsche", c3, c4);
		Filosof f4 = new Filosof("Locke", c4, c1);
		
		f1.start();
		f2.start();
		f3.start();
		f4.start();		
	}
}
