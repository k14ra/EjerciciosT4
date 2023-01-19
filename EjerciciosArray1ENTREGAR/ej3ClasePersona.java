package EjerciciosArray1ENTREGAR;

public class ej3ClasePersona {

	/*
	 * Crea una agenda para almacenar nombres y direcciones de N personas. Después
	 * haz un programa que permita ir consultando el nombre y la dirección de las
	 * personas almacenadas.*/
	
	private String nombre;
	private String direccion;
	
	public ej3ClasePersona(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "ej3ClasePersona [nombre=" + nombre + ", direccion=" + direccion + "]";
	}
	
}
