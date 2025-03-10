package poo;

import java.util.*;

public class Uso_Empleado{
//clase publica principal 
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
/*  // ####################   instancias de la clase empleado FORMA LARGA ###########################
		Empleado empleado1= new Empleado("Paco Gomez", 38000, 2020, 11, 14);
		Empleado empleado2= new Empleado("Pepe Gyuo", 32000, 2012, 19, 04);
		Empleado empleado3= new Empleado("Maria garci", 41000, 2025, 15, 05);
		
		empleado1.subeSueldo(5);  //numero de porcentaje 5
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		System.out.println("Nombre: "+ empleado1.dameNombre()+", Sueldo: " + empleado1.dameSueldo()+ ", Fecha alta: "+ empleado1.dameFechaAlta());
		System.out.println("Nombre: "+ empleado2.dameNombre()+", Sueldo: " + empleado2.dameSueldo()+ ", Fecha alta: "+ empleado2.dameFechaAlta());
		System.out.println("Nombre: "+ empleado3.dameNombre()+", Sueldo: " + empleado3.dameSueldo()+ ", Fecha alta: "+ empleado3.dameFechaAlta());
		*/

// #####################   instancias de la clase empleado FORMA CORTA CON ARRAYS ############################################################################
		Jefatura jefe_RRHH= new Jefatura("Aro", 55000, 2006, 9, 25);//polimorfismo
		jefe_RRHH.estableceIncentivo(2570);// polimorfismo
		
		Empleado[] misEmpleados = new Empleado[6];  // es lo mismo que: String[] miArray=new String[3];
		misEmpleados[0]=new Empleado("Paco Gomez", 38000, 2020, 11, 14);  //alternativa de meter diferentes tipos de datos: string y int...
		misEmpleados[1]=new Empleado("Pepe Gyuo", 32000, 2012, 19, 04);
		misEmpleados[2]=new Empleado("Maria garci", 41000, 2025, 15, 05);
		misEmpleados[3]=new Empleado("Nuria pala");  //este reconocera al 2º metodo empleado
		
		misEmpleados[4]=jefe_RRHH; //este es polimorfismo(sustitucion)
		misEmpleados[5]=new Jefatura("Ana", 78000, 1999, 5, 26);//este es polimorfismo del nuevo objeto Jefatura
// refundicion de objetos de un tipo en otro tipo de dato diferente(casting) video 44. 
		// metemos entre parentesis el tipo al que quiero covertirlo.
		Jefatura jefa_Finanzas=(Jefatura) misEmpleados[5];
		jefa_Finanzas.estableceIncentivo(5000);
		
		//imprimir interfaz video 50
		System.out.println(jefa_Finanzas.tomar_decisiones("dar mas dias de vacaciones"));
		
/*//video 50 interfaces y clases internas ##############################################################
		Empleado director_comercial= new Jefatura("Patricia Gut", 32000, 2012, 19, 04);
		Comparable ejemplo=new Empleado("Pipo puo", 32000, 2012, 19, 04);
		
		//instancia pertenece o no a esa instancia
		if(director_comercial instanceof Empleado) {
			System.out.println("es de tipo jefatura que hereda de empleado");
		}
		if(ejemplo instanceof Comparable) {
			System.out.println("implementa la interfaz comparable");
		}
		*/
	
//bucle for forma 1 ###########################################################################
		/*for(int i=0; i<3; i++) {
			misEmpleados[i].subeSueldo(5); // a la funcion subeSueldo le añadimos el nº que sera el pocentaje de la subida de salario
		}
		*/
		
		//########## bucle for mejorado forma 2 SIMPLIFICA #################.
		for(Empleado e: misEmpleados) { //Empleados es el tipo almacenado en el array.  
			e.subeSueldo(5);
		}
		
		
		
//imprimir en pantalla la informacion
		/*for(int i=0; i<3; i++) {
			System.out.println("Nombe: "+ misEmpleados[i].dameNombre()+   //concatenamos los 3 tipos de datos para imprimir por pantalla
								"Sueldo: "+ misEmpleados[i].dameSueldo()+
								"Fecha de alta: "+ misEmpleados[i].dameFechaAlta());
		}
		*/
		
		//metodo sort ordena de menos a mayor el sueldo
		Arrays.sort(misEmpleados);//el arrays es misEmpleados
		//########## bucle for mejorado forma 2 SIMPLIFICA #################.
		for(Empleado e: misEmpleados) {
			System.out.println("Nombe: "+ e.dameNombre()+   
					", Sueldo: "+ e.dameSueldo()+
					", Fecha de alta: "+ e.dameFechaAlta());		
		}	
	}
}

//clase  y metodo del objeto empleado
class Empleado implements Comparable {
	
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
	
//#########################  sobrecarga de constructores dentro de una misma clase - video 39  #############################################
	public Empleado(String nom) {
		this(nom, 30000, 2020,01,01);  //busca al otro constructor empleado que pasa los parametros de this
		
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
	public void subeSueldo(double porcentaje) {  //setter no tienen return
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	//la flecha d ela izq nos dice que estamos sobreescribiendo el metodo compareTo
	public int compareTo(Object miObjeto) {
		Empleado otroEmpleado=(Empleado)miObjeto;
		
		if(this.sueldo<otroEmpleado.sueldo) {
			return -1;
		}
		if(this.sueldo>otroEmpleado.sueldo) {
			return 1;
		}
		return 0;
	}
		
	
	//encapsular private que no sea visible ni pueda modificarse
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
	
	
}

//video 42 y 43. herencias.  //implementar la interfaz Jefes video 50 interfaces
class Jefatura extends Empleado implements Interfaz_Jefes{
	
	public Jefatura(String nom, double suel, int anio, int mes, int dia) {
		super(nom, suel, anio, mes, dia);
		// TODO Auto-generated constructor stub
	}
	
	//hereda metodo de la interfaz: interfaz_jefes.java video 50
	public String tomar_decisiones(String decision) {
		return "Miembro de la direccion toma la decision: "+ decision;
	}
	
	//metodo setter
	public void estableceIncentivo(double b) {
		incentivo=b;
	}
	
	//metodo getter
	
	public double dameSueldo() {  //este metodo sobreescribe el metodo de la calse padre: Empleado.dameSueldo()
		double sueldoJefe=super.dameSueldo(); //alamcenamos en la variable:sueldoJefe el sueldo que retorna la clase padre dameSueldo()
		return sueldoJefe + incentivo;
	}

	private double incentivo;

}

