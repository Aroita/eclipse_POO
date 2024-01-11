package company_aerea;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aeronave a1= new Aeronave(1,45, "Maxima", 4, "avion de turbina" );
		Aeropuerto b2= new Aeropuerto(2, "Maria ", "Madrid" );
		Vuelos c3= new Vuelos("Prat", "avion de Turbina");
		Localizaciones d4= new Localizaciones("Alemania", "calle Belin", 40.4171111-3.7031133);
		
		//consulta o imprimir 
		System.out.println(a1.id()+" , " + a1.numPasajeros()+" , " +a1.autonomiaMax()+" , " +a1.numTurbinas()+" , " +a1.distinguirModelo());
		System.out.println(b2.id()+",  " +b2.getNombre()+",  " +b2.getLocalizacion());
		System.out.println("nombre aeropuerto:"+" "+c3.getNombreAeropuertos()+", distinguir modelo: "+a1.distinguirModelo() );
		System.out.println("Ciudad: " + d4.ciudad()+ ", "+d4.direccion()+", Coordenadas: "+d4.coordenadas());
		System.out.println("El aeropuerto: " + c3.getNombreAeropuertos()+ 
				", tiene un vuelo a: "+d4.ciudad()+
				", con: "+a1.numPasajeros()+ " pasajeros.");
	}
}
