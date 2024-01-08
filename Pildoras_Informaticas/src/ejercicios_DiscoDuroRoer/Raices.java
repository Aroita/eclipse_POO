package ejercicios_DiscoDuroRoer;

//ejercicio 2: representar los valores de una ecuacion de 2º grado. tendremos 3 coeficientes(a,b,c)Las opreaciones son:
/*
 * obtenerRaices():imprime las 2 posibles soluciones
 * obtenerRaiz(): imprime unica raiz si hay solucion posible.
 * getDiscriminate()
: devuelve valor(double)dscriminante, tiene la formula, b2 -4ac
tieneRaices() : devuelve un booleano indicando si tiene solucion, el discriminante debe ser 0 para esto.
calcular(): mostrara por consola las posibles soñuciones, si npo existiria tambien.* 
 * */




public class Raices {
	
	private double a;
	private double b;
	private double c;
	
	
	public void obtenerRaices(){
		double x1=(-b+Math.sqrt(getDiscriminante()))/(2*a);
		double x2=(-b-Math.sqrt(getDiscriminante()))/(2*a);
		
		System.out.println("solucion 1");
		System.out.println(x1);
		System.out.println("solucion 2");
		System.out.println(x2);
		
		
	}
	
	private void obtenerRaiz(){
		double x=(-b)/(2*a);
		
		System.out.println("unica solucion");
		System.out.println(x);
		
	}
	
	public Raices(double a, double b, double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	private double getDiscriminante(){
		return Math.pow(b, 2)-(4*a*c);
	}
	
	private boolean tieneRaices(){
		return getDiscriminante()>=0;
		
	}
	private boolean tieneRaiz(){
		return getDiscriminante()==0;
		
	}
	
	private void calcular(){
		if(tieneRaices()) {
			obtenerRaices();	
		}else 
			if(tieneRaices()){
				obtenerRaiz();
		}else {
			System.out.println(" No tiene raíz ");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Raices ecuacion=new Raices(2,5,-3);
		ecuacion.calcular();

	}

}
