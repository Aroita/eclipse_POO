package company_aerea;

public class Aeronave{
	
	public int id;
	public int numPasajeros;
	public String autonomiaMax;
	public int numTurbinas;
	public String distinguirModelo;
	
	public Aeronave(int id, int numPasajeros, String autonomiaMax, int numTurbinas, String distinguirModelo ) {
		this.id=id;
		this.numPasajeros= numPasajeros;
		this.autonomiaMax=autonomiaMax;
		this.numTurbinas=numTurbinas;
		this.distinguirModelo= distinguirModelo;
	}
	
	//getter
	public int id(){
		return id;
	}
	public int numPasajeros() {
		return numPasajeros;
	}
	public String autonomiaMax() {
		return "autonomia max: " + autonomiaMax;
	}
	public String distinguirModelo() {
		if(distinguirModelo != " avion de Turbina") {
			return "es avion de turbina"; 
		}else {
			return " es avion de helices";	
		}
	}
	public int numTurbinas() {
		return numTurbinas;
	}
	
	//setter
	public void id(int id) {
		this.id=id; 
	}
	public void numPasajeros(int numPasajeros) {
		this.numPasajeros= numPasajeros;	
	}
	public void autonomiaMax(String autonomiaMax) {
		this.autonomiaMax=autonomiaMax;
	}
	
	public void numTurbinas(int numTurbinas) {
		this.numTurbinas=numTurbinas;
	}
	public void distinguirModelo(String distinguirModelo) {
		this.distinguirModelo=distinguirModelo;
	}
	
	

}
