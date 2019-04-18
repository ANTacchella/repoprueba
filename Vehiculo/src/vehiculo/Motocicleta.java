package vehiculo;

public class Motocicleta extends Vehiculo {
	private Persona acompa�ante;
	
	public Motocicleta( Persona chofer, double km, Persona acompa�ante) {
		super(chofer, km);
		this.acompa�ante = acompa�ante;
	}

	public Persona getAcompa�ante() {
		return acompa�ante;
	}

	public void setAcompa�ante(Persona acompa�ante) {
		this.acompa�ante = acompa�ante;
	}
	
	public void asignarChofer(Persona chofer) {
		if (this.acompa�ante == null) {
			super.setChofer(chofer);
		}
	}
	
//	public void destruirAcompa�ante( Persona acompa�ante ) {
//		this.acompa�ante = null;
//	}
	
}
