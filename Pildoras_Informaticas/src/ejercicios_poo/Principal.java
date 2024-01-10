package ejercicios_poo;

import java.util.*;

public class Principal {
	
	public static int indiceCocheBarato(Vehiculos coches[]) {
		double precio;
		int indice =0;
		
		// arreglo para saber el precio menor
		precio=coches[0].getPrecio();
		for(int i=1;i<coches.length;i++) {
			if(coches[i].getPrecio()<precio);
			precio=coches[i].getPrecio();
			indice = i;
		}
		return indice;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entradaDatos = new Scanner(System.in);
		String marca, modelo;
		double precio;
		int numVehiculos;
		
		System.out.println("escribe un nº de vehiculos: ");
		numVehiculos = entradaDatos.nextInt();
		
		
		//creamo los objetos
		Vehiculos coches[] = new Vehiculos[numVehiculos];
		
		for(int i=0; i<coches.length;i++ ) {
			System.out.println("dime las caracteristicas del coche: " + (i+1) + " ");
			System.out.println("Introduce marca: ");
			marca = entradaDatos.nextLine();
			System.out.println("Introduce modelo: ");
			modelo = entradaDatos.nextLine();
			System.out.println("Introduce precio: ");
			precio = entradaDatos.nextDouble();
			
			coches[i]= new Vehiculos(marca, modelo, precio);
			
			
			
		}
		
	}

}
