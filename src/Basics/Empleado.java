package Basics;

public class Empleado {
	   private int id;
	   private String nombre; 
	   private String apellidos;   
	   private int salario;  

	   public Empleado() {}
	   
	   public Empleado(String _nombre, String _apellidos, int salario) {
	      this.nombre = _nombre;
	      this.apellidos = _apellidos;
	      this.salario = salario;
	   }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	   
	  
	}
