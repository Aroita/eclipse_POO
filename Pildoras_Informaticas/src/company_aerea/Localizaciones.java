package company_aerea;

public class Localizaciones {
	public String ciudad;
	public String direccion;
	public double coordenadas;
	
	
	public Localizaciones(String ciudad, String direccion,double coordenadas) {
		this.ciudad=ciudad;
		this.direccion=direccion;
		this.coordenadas=coordenadas;	
	}
	
	//get
	public String ciudad() {
		return ciudad;
	}
	public String direccion() {
		return "direccion: " + direccion;
	}
	public  double coordenadas() {
		return coordenadas;
	}
	
	
	//set
	public void ciudad(String ciudad) {
		this.ciudad=ciudad;
	}
	public void direccion(String direccion) {
		this.direccion=direccion;
	}
	public void coordenadas(double coordenadas) {
		this.coordenadas=coordenadas;
	}

}
