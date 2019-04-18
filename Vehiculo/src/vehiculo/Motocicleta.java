package vehiculo;

public class Motocicleta extends Vehiculo {
	private Persona acompaņante;
	
	public Motocicleta( Persona chofer, double km, Persona acompaņante) {
		super(chofer, km);
		this.acompaņante = acompaņante;
	}

	public Persona getAcompaņante() {
		return acompaņante;
	}

	public void setAcompaņante(Persona acompaņante) {
		this.acompaņante = acompaņante;
	}
	
	public void asignarChofer(Persona chofer) {
		if (this.acompaņante == null) {
			super.setChofer(chofer);
		}
	}
	
//	public void destruirAcompaņante( Persona acompaņante ) {
//		this.acompaņante = null;
//	}
	
}
