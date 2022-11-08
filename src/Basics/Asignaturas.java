package Basics;

public class Asignaturas  {

	private int cdn;
	private String nombre;


	public Asignaturas() {
	}

	public Asignaturas(int cdn) {
		this.cdn = cdn;
	}

	public Asignaturas(int cdn, String nombre) {
		this.cdn = cdn;
		this.nombre = nombre;
	
	}

	public int getCdn() {
		return this.cdn;
	}

	public void setCdn(int cdn) {
		this.cdn = cdn;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


}
