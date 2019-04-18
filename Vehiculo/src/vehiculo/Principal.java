package vehiculo;

public class Principal {

	public static void main(String[] args) {
		
		Persona chofer = new Persona( "eduardo", "perez");
		Persona pasajero1 = new Persona( "fitito", "fofo");
		Persona pasajero2 = new Persona( "carlitos", "jaja");
		
		Motocicleta moto = new Motocicleta( chofer, 12, null);
		Autobus bondi = new Autobus( chofer, 34, null);
		
		//System.out.println( moto );

		bondi.addPasajeros(pasajero1);
		bondi.addPasajeros(pasajero2);
		moto.setAcompañante(pasajero1);
		
		
		
	}

}
