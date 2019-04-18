package pa.dibujo;

public class Principal {

	public static void main(String[] args) {
		Circulo c1 = new Circulo("blanco", 4);
		Circulo c2 = new Circulo();
		
		System.out.println("c1 "+ c1);
		System.out.println(Circulo.MiPI);
		System.out.println(c1.calcularArea());
		System.out.println(Circulo.calcularArea(c1));
		System.out.println(c2);
		
		Circulo c3 = new Circulo("blanco", 1);
		Circulo c4 = new Circulo("blanco", 1);
		Circulo c6 = c4;
		Circulo c5 = new Circulo("verde", 1);
		
	}

}
