package poo;

public class Uso_Coche {

	public static void main(String[] args) {
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
	        
	        

	    }
	    
	}
