package poo;


//video 42 y 43. herencias
public class Jefes extends Empleado {
	
	public Jefes(String nom, double suel, int anio, int mes, int dia) {
		super(nom, suel, anio, mes, dia);
		// TODO Auto-generated constructor stub
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
