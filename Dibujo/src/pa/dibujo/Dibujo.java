package pa.dibujo;

import java.util.ArrayList;

public class Dibujo {
	private static final double CM2_POR_POMO = 25;
	private ArrayList<Figura> listaDeFiguras;
	
	public Dibujo() {
		listaDeFiguras = new ArrayList<Figura>();
	}
	
	public void agregarFigura(Figura fig) {
		listaDeFiguras.add(fig);
	}
	
	public double calcularTemperas() {
		double areaTotal = 0;
		for(Figura fig: listaDeFiguras) {
			if(fig.getColor() != null | fig.getColor() != "")
				areaTotal += fig.calcularArea();
			else
				areaTotal -= fig.calcularArea();
		}
		return Math.ceil(areaTotal/CM2_POR_POMO);
	}
}
