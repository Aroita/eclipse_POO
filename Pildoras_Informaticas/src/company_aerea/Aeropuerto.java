package company_aerea;

public class Aeropuerto {
	private int id;
	private String nombre;
	private String localizacion;
	
	public Aeropuerto(int id, String nombre,String localizacion) {
		this.id=id;
		this.setNombre(nombre);
		this.setLocalizacion(localizacion);
	}
	
	
	//getter
	public int id() {
		return id;
	}
	public String nombre() {
		return " ";
	}
	public String localizacion() {
		return " ";
	}
	
	//setter
	public void id(int id) {
		this.id=id;
	}
	public void nombre(String nombre) {
		this.setNombre(nombre);
	}
	public void localizacion(String localizacion) {
		this.setLocalizacion(localizacion);
		
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getLocalizacion() {
		return localizacion;
	}


	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

}
