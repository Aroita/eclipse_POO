package poo;

//video 40, 41 herencias
//clase furgonta hereda con: extends y nombre de la calse que va a heredar(Coche) q es la superclase y furgoneta subclase. JAVA NO ADMITE HERENCIA MULTIPLE.solo añadir 1 extends

public class Furgoneta extends Coche {
	
	//encapsulacion, declara variable/instancias
	private int capacidad_carga;
	private int plazas_extra;
	
	//metodo constructor, da estado inicial a furgoneta
	public Furgoneta(int plazas_extra, int capacidad_carga) {
		super();  // super() llama dentro del constructor de la clase padre: public Coche() {...) del archivo Coche.java
		
		this.capacidad_carga=capacidad_carga; //recoge el parametro  de Furgoneta(int plazas_extra, int capacidad_carga)
		this.plazas_extra=plazas_extra;

	}
	//getter metordo
	public String dimeDatosFurgoneta() {
		return "La capacidad de carga: " + capacidad_carga + ", las plazas extras: " + plazas_extra;
		
	}
	
			//setter
	

}
