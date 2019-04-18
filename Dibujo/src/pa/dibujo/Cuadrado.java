package pa.dibujo;

public class Cuadrado extends Figura{
	private double valor;
	
	public Cuadrado(String color, double valor) {
		super(color);
		this.valor = valor;
	}
	
	@Override
	public double calcularArea() {
		double area = valor * valor;
		
		return area;
	}
}
