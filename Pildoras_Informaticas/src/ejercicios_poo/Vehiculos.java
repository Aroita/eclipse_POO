package ejercicios_poo;

public class Vehiculos {
	
	private String marca;
	private String modelo;
	private double precio;
	
	//constructor
	public Vehiculos(String marca, String modelo, double precio) {
		this.marca=marca;
		this.modelo=modelo;
		this.precio=precio;
	}
	
	
	public double getPrecio() {
		return precio;
	}
	
	//getter
	public String datosVehiculo() {
		return "Marca del vehiculo: " + marca + " y modelo: " + modelo + ", precio: " + precio;
	}
}
	
	
