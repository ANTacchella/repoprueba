package pa.dibujo;

public abstract class Figura {
	
	private String color;
	
	public Figura() {
		this.color = "";
	}
	
	public Figura(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract double calcularArea();

	@Override
	public String toString() {
		return "Color: " + color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {//Parametro siempre object
		if (this == obj)//Si hablamos del mismo objeto 
			return true;
		if (obj == null)//Si la referencia del parametro es nula, nunca se inicializo
			return false;
		if (getClass() != obj.getClass())//averiguo si las clases a las que pertenecen son las mismas
			return false;
		Figura other = (Figura) obj;//hay que castearlo object para poder usar las variables de figura
									//genero una referencia a figura
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))//llama a equals de string
			return false;
		return true;
	}
		
}
