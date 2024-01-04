package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instancias 
		Persona[] lasPersonas=new Persona[2];
		lasPersonas[0]=new Empleados2("Luis Conde", 50000,2009,02,25); //del constructor empleados2
		lasPersonas[1]=new Alumno("Maria ala", "Ingenieria"); //del constructor alumno
		
		//imprimir 
		for(Persona p: lasPersonas) {
			System.out.println(p.dameNombre()+ ", " + p.dameDescripcion());
			
		}
		

	}

}
//clase abstract PERSONA que heredaran la clase empleado y alumno  ##############################################################################################
abstract class Persona{
	
	//constructor
	public Persona(String nom) {
		nombre=nom;
	}
	//getter
	public String dameNombre() {
		return "Nombre: " + nombre;
	}
	
//metodo abstracto ################# tambien esta obligado añadir abstract en la clase.
	public abstract String dameDescripcion();
	
	//inicializa variable encapsula
	private String nombre;
}


//##########################################  CLASE EMPLEADO   ##################################################################
//1º CREAMOS LA CLASE empleado que sea capaz de construir instancias u objetos a la que tenga un nombre empleado y una seccion de cada trabajador.

class Empleados2 extends Persona{
	
	//1º encapsulacion
	//private final String nombre;  //CONSTANTE, PRUEBA CON LA PALABRA RESERVADA FINAL
	
	private String seccion;
	private int Id;
	private static int IdSiguiente=1;
	private double sueldo;
	private Date altaContrato;
	
//2º EL CONSTRUCTOR, inicializa las variables(instancias del objeto)
	//hereda de la clase persona que es abstracta y su metodo. , se añade el super()
	public Empleados2(String nom, double suel, int anio, int mes, int dia) {
		super(nom);
		sueldo=suel;
		seccion="Administración";
		GregorianCalendar calendario = new GregorianCalendar(anio,  mes-1, dia);
		//añadimos a calendario la funcion getTime() para obtener la fecha
		altaContrato=calendario.getTime();
		Id=IdSiguiente;
		IdSiguiente++;

	}
	//getter
	public String dameDescripcion() {
		return "Empleado_id: " + Id + " con sueldo: "+ sueldo;
	}
	//METODO GETTER
	
	
	public double dameSueldo() { //getter
		return sueldo;
	}
	public String devuelveDatos() {
		return   "sueldo: " + sueldo +", y la secciones es: "+ seccion + ", con id:" + Id;
	}
	
	public Date dameFechaAlta() { //getter de anio, mes, dia
		return altaContrato;
	}
	
	//establecer variable de subir sueldo
	public void subeSueldo(double porcentaje) {  //setter no tienen return
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}
		
	//METODO SETTER(modifica la seccion y no tienen return)
	public void cambiaSeccion(String seccion) {
		this.seccion=seccion;
	}

}

//##########################################  CLASE ALUMNO  ##################################################################
class Alumno extends Persona{

	public Alumno(String nom, String car) {
		super(nom); 
		carrera=car;
		// TODO Auto-generated constructor stub
		
	}
	public String dameDescripcion() {
		return "Este alumno estudia la carrera: " + carrera;
	}
	private String carrera;
	
}


