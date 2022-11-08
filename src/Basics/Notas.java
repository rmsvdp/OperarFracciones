package Basics;

public class Notas  {

	private int id;
	private Alumnos alumnos;
	private Asignaturas asignaturas;
	private Integer nota;

	public Notas() {
	}

	public Notas(int id, Alumnos alumnos, Asignaturas asignaturas) {
		this.id = id;
		this.alumnos = alumnos;
		this.asignaturas = asignaturas;
	}

	public Notas(int id, Alumnos alumnos, Asignaturas asignaturas, Integer nota) {
		this.id = id;
		this.alumnos = alumnos;
		this.asignaturas = asignaturas;
		this.nota = nota;
	}

	public Alumnos getAlumnos() {
		return this.alumnos;
	}

	public void setAlumnos(Alumnos alumnos) {
		this.alumnos = alumnos;
	}

	public Asignaturas getAsignaturas() {
		return this.asignaturas;
	}

	public void setAsignaturas(Asignaturas asignaturas) {
		this.asignaturas = asignaturas;
	}

	public Integer getNota() {
		return this.nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

}
