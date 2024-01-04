package tallas;

import java.util.*;

//tipos enumerados --> objeto enum. video 48

public class Uso_tallas {
	//CREAMOS la instancia perteneciente a la clase enum que denomina la talla
	
	//enum Talla{MINI, MEDIANO,GRANDE, MUY_GRANDE};
	
	enum Talla{
		
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
		
		//CONSTRUCTOR, establecer abreviatura
		private Talla(String abreviatura){
		this.abreviatura=abreviatura;
	}
		//getter
		public String dameAbreviatura() {
			return abreviatura;
		}
		
		private String abreviatura;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner t= new Scanner(System.in);
		System.out.println("Escribe una talla: MINI, MEDIANO,GRANDE, MUY_GRANDE");
		
		
		//touppercase que convierta el texto en mayuscula
		String entrada_datos=t.next().toUpperCase();
		
		//el metodo valuof almacena la talla que ha escrito el usuario por consola.
		Talla la_talla=Enum.valueOf(Talla.class, entrada_datos);
		
		//getter
		System.out.println("Talla: "+ la_talla);
		System.out.println("Abreviatura de la talla: "+ la_talla.dameAbreviatura());
		
		

	}

}
