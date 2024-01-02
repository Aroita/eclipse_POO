package poo;

public class Coche {
    //declaro las variables del objeto coche
    
    //encapsular, ponemos private delante y asi no es visible y no se modificara esa variable en otro archivo
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    
    //propiedades no comunes(las caracteristicas que cambian en cada coche)
    private String color;
    private int peso_total;
    private boolean asientos_cuero, climatizador;
    

    //decirle cuales son sus valores con metodo constructor: Coche() (da un estado incial al objeto)
    //METODO CONSTRUCTOR establecemos las variables, puede haber varios constructores para cada clase.
    public Coche() {
        ruedas=4;
        largo=2000;
        ancho=300;
        motor=1600;
        peso_plataforma=500;


    }

    public Coche(String string) {
    }

    //METODO GETTER SINTAXIS. NOS INFORMA DEL VALOR, tiene que llevar un return
    public String dime_datos_generales(){
        return "la plataforma del coche Renault tiene: " + ruedas + " ruedas. " +
    "mide: " + largo/1000 + " metros con un ancho de:  " + ancho +
    " cm y peso de plataforma " + peso_plataforma + " kg";
    }
    
    //METODO SETTER. MODIFICA el valor de las propiedades de los objetos. //el void indica que el metodo NO devuelve ningun valor(no se pone el return con void).
    public void establece_color(String color_coche) {
    	color= color_coche;
    }
    
  //METODO GETTER 
    public String dime_color() {
    	return "el color es: " + color;
    }
    //######################### asientos
    
    //metodo configurar asientos si es si pasara true y no false.
    public void configura_asientos(String string) {
    	if(string== "Si") {
    		this.asientos_cuero=true;
    		
    	} else {
    		this.asientos_cuero=true;
    	}
    }
    
    //metodo asientos
    public String dime_asientos() {
    	if(asientos_cuero) {
    		return "el coche tiene asientos de cuero";
    	}else {
    		return "el coche no tiene asientos de cuero";
    	}
    }
    
    //##############################climatizador
    
    //setter
    public void configura_climatizador(String climatizador) {
    	if(climatizador=="si") {
    		this.climatizador=true;
    	}else {
    		this.climatizador=false;
    	}
    }
    //getter
    public String dime_climatizador() {
    	if(climatizador==true) {
    		return "el coche tiene climatizador";
    	}else {
    		return "el coche tiene Aa";
    	}
    }
    
    
    
    //NO RECOMENDABLE PONER JUNTOS SETTER Y GETTER:
    public String dime_peso_coche() { //setter (establece las variables)  + getter (obtiene con return)
    	int peso_carroceria=500; //iniciamos una variable peso_carroceria
    	
    	peso_total= peso_plataforma + peso_carroceria;  //iniciamos otra variable peso_total sea igual a la suma
    	
    	if(asientos_cuero==true) {
    		peso_total += 50;
    	}
    	if(climatizador==true) {
    		peso_total +=20;
    	}
    	
    	//getter
    	return "El peso del coche es " + peso_total;
    }
   
    
    public int precio_coche() {
    	int precio_final=10000;
    	
    	if(asientos_cuero==true) {
    		precio_final+=2000;
    	}
    	if(climatizador==true) {
    		precio_final += 1500;
    	}
    	
    	return precio_final;
    }
     


    
}
