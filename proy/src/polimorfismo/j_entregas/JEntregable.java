package j_entregas;

public interface JEntregable {
	
	void entregar();
	void devolver();
	boolean isEntregado();
	int compareTo(Object objeto);

}