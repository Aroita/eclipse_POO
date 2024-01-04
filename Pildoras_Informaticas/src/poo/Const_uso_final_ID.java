package poo;

//LA CONTANTE SE ASEGURA QUE LA PALABRA RESERVADA: FINAL, NO CAMBIE EL VALOR
// private static int IdSiguiente=1, aplica un id que no se puede modificar es generado auto

//EL METODO STATIC: no actua sobre objetos, solo acceden a campos static y para llamarlo se usa nombreClase.nombreMetodo --> Empleados.dameIdSiguiente()

public class Const_uso_final_ID extends Empleados {

	public Const_uso_final_ID(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleados trabajador1=new Empleados("Paco"); //2 objetos trabajador1y2 con estado inicial de empleado sera el string que le pasamos y la seccion la completa en el constructor
		Empleados trabajador2=new Empleados("Ana");
		Empleados trabajador3=new Empleados("Abel");
		
		trabajador1.cambiaSeccion("RRHH");
		//trabajador1.cambiaNombre("maria"); //PRUEBA CON LA PALABRA RESERVADA FINAL
		
		//System.out.println(trabajador1.devuelveDatos()); //el metodo getter retornara los datos de los objetos(trabajador1,2,3)
		System.out.println(trabajador1.devuelveDatos() + 
				"\n" + trabajador2.devuelveDatos() + 
				"\n" + trabajador3.devuelveDatos());
		
		System.out.println(Empleados.dameIdSiguiente()); //forma de llamar un metodo static(ya que static no llama al objteto

	}

}

// 1º CREAMOS LA CLASE empleado que sea capaz de construir instancias u objetos a la que tenga un nombre empleado y una seccion de cada trabajador.
class Empleados{
	
	//1º encapsulacion
	//private final String nombre;  //CONSTANTE, PRUEBA CON LA PALABRA RESERVADA FINAL
	private  String nombre;
	private String seccion;
	private int Id;
	private static int IdSiguiente=1;
	
//2º EL CONSTRUCTOR, inicializa las variables(instancias del objeto)
	public Empleados(String nom) {
		nombre=nom;
		seccion="Administración";
		Id=IdSiguiente;
		IdSiguiente++;

	}
	
	//METODO GETTER
	public String devuelveDatos() {
		return "Empleado: " + nombre + ", y la secciones es: "+ seccion + ", con id:" + Id;
	}
	
	public static String dameIdSiguiente() {
		return "el id siguiente es: " + IdSiguiente;
	}
	
	            //CONSTANTE, PRUEBA CON LA PALABRA RESERVADA FINAL
	public void cambiaNombre(String nombre) {
		this.nombre=nombre;
	}
	
	
	
	//METODO SETTER(modifica la seccion y no tienen return)
	public void cambiaSeccion(String seccion) {
		this.seccion=seccion;
	}

}