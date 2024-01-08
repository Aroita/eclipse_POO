package ejercicios_DiscoDuroRoer;

public class Main_Libro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro libro1=new Libro(111111111, "Los enenitos ", "Anualel", 30);
		Libro libro2=new Libro(222222222, "Los gigantes ", "purcho", 60);
		
		System.out.println(libro1.datos_libro());
		System.out.println(libro2.datos_libro());
		
		//setter si modifico las paginas del libro 1
		libro1.setdame_np(70);
		
		
		//si libro tiene mas paginas(es mayor) que libro 2
		
		if(libro1.dame_np()>libro2.dame_np()) {
			System.out.println(libro1.dame_title()+ ", tiene más páginas");
			
		}else {
			System.out.println(libro2.dame_title()+ ", Tiene más páginas");
			
		}

	}

}
