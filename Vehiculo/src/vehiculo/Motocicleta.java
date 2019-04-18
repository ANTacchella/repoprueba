package vehiculo;

public class Motocicleta extends Vehiculo {
	private Persona acompañante;
	
	public Motocicleta( Persona chofer, double km, Persona acompañante) {
		super(chofer, km);
		this.acompañante = acompañante;
	}

	public Persona getAcompañante() {
		return acompañante;
	}

	public void setAcompañante(Persona acompañante) {
		this.acompañante = acompañante;
	}
	
	public void asignarChofer(Persona chofer) {
		if (this.acompañante == null) {
			super.setChofer(chofer);
		}
	}
	
//	public void destruirAcompañante( Persona acompañante ) {
//		this.acompañante = null;
//	}
	
}
