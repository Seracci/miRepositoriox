package prueba;

public class Prueba {
	private String nombre;
	
	public Prueba() {
		this.nombre = "Prueba";
	}

	public String getNombre() {
		return "otro cambio";
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Prueba [nombre=" + nombre + "]";
	}
}
