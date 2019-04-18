package pa.dibujo;

public class Circulo extends Figura{
	public static final double MiPI=3.14;
	private static int contador=0;
	private double radio; 
	
	public Circulo() {
		//super();
		this.radio = 0;
		Circulo.contador++;//Para conocer el numero de circulos
	}
	
	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}
	
	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(radio, 2);
	}
	
	@Override
	public String toString() {
		return "Circulo: radio= " + radio + super.toString();
	}
	
	public static double calcularArea(Circulo c) {
		return Math.PI * Math.pow(c.radio, 2);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(radio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))//si el equals del padre con object da diferente
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circulo other = (Circulo) obj;
		if (Double.doubleToLongBits(radio) != Double.doubleToLongBits(other.radio))//asegurar el nivel de precision de los numeros
			return false;
		return true;
	}
	
}
