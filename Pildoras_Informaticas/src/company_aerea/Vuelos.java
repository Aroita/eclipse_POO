package company_aerea;

public class Vuelos {
	
	private String nombreAeropuertos;
	private String aeronaveRealiza;
	
	public Vuelos(String nombreAeropuertos,String aeronaveRealiza ) {
		this.setNombreAeropuertos(nombreAeropuertos);
		this.setAeronaveRealiza(aeronaveRealiza);
		
	}
	
	
	


	public String getNombreAeropuertos() {
		return nombreAeropuertos;
	}

	public void setNombreAeropuertos(String nombreAeropuertos) {
		this.nombreAeropuertos = nombreAeropuertos;
	}





	public String getAeronaveRealiza() {
		return aeronaveRealiza;
	}

	public void setAeronaveRealiza(String aeronaveRealiza) {
		this.aeronaveRealiza = aeronaveRealiza;
	}

}
