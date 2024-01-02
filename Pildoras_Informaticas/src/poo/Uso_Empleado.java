package poo;

import java.util.*;

public class Uso_Empleado{
//clase publica principal 
	public static void main(String[] args) {
	// TODO Auto-generated method stub

	}

}

//clase del objeto empleado
class Empleado{
	
	public Empleado(String nom, double suel, int anio, int mes, int dia) {
		//establecemos variables en el metodo contructor
		nombre=nom;
		sueldo=suel;

		//api: GregorianCalendar(int year, int month, int dayOfMonth) de java que construye una fecha(dia,mes,año)tipos int
		//con new llamamos a la api de gregoria
		GregorianCalendar calendario = new GregorianCalendar(anio,  mes-1, dia);
		//añadimos a calendario la funcion getTime() para obtener la fecha
		altaContrato=calendario.getTime();
		
			
	}
	
	public String dameNombre() { //getter
		return nombre;
		
	}
	
	public double dameSueldo() { //getter
		return sueldo;
	}
	
	public Date dameFechaAlta() { //getter de anio, mes, dia
		return altaContrato;
	}
	
	//establecer variable de subir sueldo
	public void subeSueldo(double porcentaje) {  //setter
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	
	//encapsular private que no sea visible ni pueda modificarse
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
}

