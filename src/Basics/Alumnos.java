package Basics;


public class Alumnos {

	private String idn;
	private String apenom;
	private String direcc;
	private String prov;
	private String email;
	

	public Alumnos() {
	}

	public Alumnos(String idn) {
		this.idn = idn;
	}

	public Alumnos(String idn, String apenom, String direcc, String prov, String email) {
		this.idn = idn;
		this.apenom = apenom;
		this.direcc = direcc;
		this.prov = prov;
		this.email = email;

	}

	public String getIdn() {
		return this.idn;
	}

	public void setIdn(String idn) {
		this.idn = idn;
	}

	public String getApenom() {
		return this.apenom;
	}

	public void setApenom(String apenom) {
		this.apenom = apenom;
	}

	public String getDirecc() {
		return this.direcc;
	}

	public void setDirecc(String direcc) {
		this.direcc = direcc;
	}

	public String getProv() {
		return this.prov;
	}

	public void setProv(String prov) {
		this.prov = prov;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



}
