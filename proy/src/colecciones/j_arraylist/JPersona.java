package j_arraylist;


public class JPersona {
	
	public static final int MAYORIA_EDAD = 18;
	private long DNI;
	private String nombre;
	private int edad;
	
	public JPersona(long DNI, String nombre, int edad) {
		this.setDNI(DNI);
		this.setNombre(nombre);
		this.setEdad(edad);
	}

	public long getDNI() {
		return this.DNI;
	}

	public void setDNI(long dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public boolean esMayorEdad() {
		return this.getEdad() >= JPersona.MAYORIA_EDAD;
	}

	public String toString() {
		return DNI + " => " + nombre + " => " + edad;
	}	
		
}