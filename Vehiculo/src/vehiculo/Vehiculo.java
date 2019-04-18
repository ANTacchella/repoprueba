package vehiculo;

public abstract class Vehiculo {
	private Persona chofer;
	private double kilometraje;
	
	public Vehiculo() {
		this.chofer = null;
		this.kilometraje = 0.0;
	}
	
	public Vehiculo(Persona chofer, double kilometraje) {
		this.chofer = chofer;
		this.kilometraje = kilometraje;
	}

	public Persona getChofer() {
		return chofer;
	}

	public void setChofer(Persona chofer) {
		this.chofer = chofer;
	}

	public double getKilometraje() {
		return kilometraje;
	}

}
