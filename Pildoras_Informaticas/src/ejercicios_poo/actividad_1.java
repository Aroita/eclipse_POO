package ejercicios_poo;

public class actividad_1 {
	private String nombre;
	private int edad;
	private double salario;
	
	//constructor de la clase
	public actividad_1(String nombre, int edad, double salario) {
		this.nombre=nombre;
		this.edad=edad;
		this.salario=salario;
	}
	
	//getter metodo para consultas
	public String getNombre() {
		return nombre;
	}
	
	public Double getSalario() {
		return salario;
	}
	
	public int getEdad() {
		return edad;
	}
	
	
	//setter metodo modifica Y PODEMOS añadirle condiciones
	public void setNombre(String nombre) {
		// if("Pepa".equalsIgnoreCase(nombre)) { //si no es pepa no se cambia el nombre
			this.nombre=nombre;
		}
		
	
	public void setEdad(int edad) {
		this.edad=edad;
	}
	public void setSalario(double salario) {
		this.salario=salario;
	}
	public static void main(String[] args) {
		// creamos un objeto(ob1) de actividad_1= llamamos al constructor y le pasamos sus parametros
		
		actividad_1 ob1 = new actividad_1("Lola ",33, 1600);
		
		//acceder  LOS metodos del objeto
		ob1.setNombre("Pepe ");
		//System.out.println(ob1.getNombre());
		System.out.println("Nombre: "+ ob1.getNombre()+ ", Edad: "+ ob1.getEdad()+", Salario: " + ob1.getSalario());
		

	}
	

}
