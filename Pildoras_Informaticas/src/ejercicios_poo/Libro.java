package ejercicios_poo;

public class Libro  {
	private int ISBN;
	private String Title;
	private String Autor;
	private int numero_paginas;
	

	public Libro(int i, String t, String a, int np) {
		ISBN=i;
		Title=t;
		Autor=a; 
		numero_paginas=np;
		
	}
	
	//getter individuales
	public int dame_isbn() {
		return ISBN;
	}
	
	public String dame_title() {
		return Title;
	}
	
	public String dame_autor() {
		return Autor;
	}
	
	public int dame_np() {
		return numero_paginas;
	}
	
	
	//getter general
	public String datos_libro() {
		return " ISBN: " + ISBN + ", titulo: "+ Title + ", autor: "+ Autor + ", numero de paginas: "+ numero_paginas;
	}
	
	//setter
	
	public void setISBN(int ISBN) {
		this.ISBN=ISBN;
	}
	public void setdame_title(String Title) {
		this.Title=Title;
	}
	public void setdame_autor(String Autor) {
		this.Autor=Autor;
	}
	public void setdame_np(int numero_paginas) {
		this.numero_paginas=numero_paginas;
	}
	
}


	

