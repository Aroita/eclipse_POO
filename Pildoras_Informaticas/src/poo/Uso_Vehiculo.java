package poo;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		

		/* uso solo con coche:
	       Coche Renault=new Coche();  //instanciar la clase Coche, del archivo Coche.java
	       Renault.establece_color("amarillo");
	       System.out.println(Renault.dime_datos_generales());
	       
	        //propiedades que se recogen de Coche()
	        System.out.println(Renault.dime_color());
	        
	        Renault.configura_asientos("Si");
	        System.out.println(Renault.dime_asientos());

	        //metodos getter(capta el valor de esa propiedad) o setter(define el valor de una propiedad) para anidas las clases
	        //la funcion devuelve el valor de las propiedades de los objetos
	        // sintaxis: public dato_a_devolver nombre_metodo(){ codigo + return}
	        
	        Renault.configura_climatizador("si");
	        System.out.println(Renault.dime_climatizador());
	        System.out.println("el precio final es: " + Renault.precio_coche());
	        
	        */
		
//video 41 herencias furgoneta y coche
		Coche miCoche1=new Coche();
		
		//setter para modificar color de la clase coche
		miCoche1.establece_color("Rojo");
		
		Furgoneta mifurgoneta1=new Furgoneta(7, 580); //damos estado inicial d elos parametros furgoneta (int plazas_extra, int capacidad_carga)
		mifurgoneta1.establece_color("Negro");
		mifurgoneta1.configura_climatizador("si");
		mifurgoneta1.configura_asientos("si");
		
		
		System.out.println(miCoche1.dime_datos_generales() +" " +miCoche1.dime_color());
		//concatenamos funciones generales de coche + los propios de furgoneta.
		System.out.println(mifurgoneta1.dime_datos_generales()+" " +mifurgoneta1.dime_color() +" \n" +mifurgoneta1.dimeDatosFurgoneta());
	        
	        

	    }
	    
	}
