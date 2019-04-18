package vehiculo;
import java.util.ArrayList; 

public class Autobus extends Vehiculo{
	private ArrayList<Persona> pasajeros;
	
	public Autobus(Persona chofer, double kilometraje) {
		super(chofer, kilometraje);
		this.pasajeros = new ArrayList<Persona>();
	}

	public ArrayList<Persona> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(ArrayList<Persona> pasajeros) {
		this.pasajeros = pasajeros;
	}
	
	public void asignarChofer(Persona chofer) {
		if (this.pasajeros.isEmpty()) {
			super.setChofer(chofer);
		}
	}
	
	public void addPasajeros(Persona pasajero) {
		this.pasajeros.add(pasajero);
	}
	
}
