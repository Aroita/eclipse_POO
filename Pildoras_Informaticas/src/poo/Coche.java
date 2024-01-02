package poo;

public class Coche {
    //declaro las variables del objeto coche
    
    //encapsular, ponemos private delante y asi no es visible y no se modificara esa variable en otro archivo
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    
    private String color;
    private int peso_total;
    private boolean asientos_cuero, climatizador;
    

    //decirle cuales son sus valores con metodo constructor: Coche() (da un estado incial al objeto)
    //METODO CONSTRUCTOR establecemos las variables
    public Coche() {
        ruedas=4;
        largo=2000;
        ancho=300;
        motor=1600;
        peso_plataforma=500;


    }

    public Coche(String string) {
    }

    //MMETODO GETTER SINTAXIS. NOS INFORMA DEL VALOR, tiene que llevar un return
    public String dime_datos_generales(){
        return "la plataforma del coche tiene: " + ruedas + " ruedas. " +
    "mide: " + largo/1000 + " metros con un ancho de  " + ancho +
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
    		this.asientos_cuero=false;
    	}
    }
    
    //metodo asientos
    public String dime_asientos() {
    	if(asientos_cuero==true) {
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


    
}
