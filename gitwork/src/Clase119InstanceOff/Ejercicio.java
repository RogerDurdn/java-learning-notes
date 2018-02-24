package Clase119InstanceOff;

public class Ejercicio {

	public static void main(String[] args) {
		
		 Elipse e = new Elipse();
		
		determinarTipo(e);
		
		System.out.println("");
		
		determinarTodosLosTipos(e);
	
	
	}
	public static void determinarTipo(FiguraGeometrica figura) {
		
		if(figura instanceof Elipse) {				//determinara si el objeto es una instancia de esta clase
			System.out.println("Es una: Elipse");
		}
		else if(figura instanceof Circulo) {
			System.out.println("Es un circulo");
		}
		else if(figura instanceof Triangulo) {       	//cuando el if no se cumple por se false no se puestra el contenido
			System.out.println("Es un triangulo");
		}
		else if(figura instanceof FiguraGeometrica) {
			System.out.println("Es una figura geometrica");
		}
	}
	public static void determinarTodosLosTipos(FiguraGeometrica figura) {
		
		if(figura instanceof Elipse) {				//determinara si el objeto es una instancia de esta clase
			System.out.println("Es una: Elipse");
		}
		if(figura instanceof Circulo) {
			System.out.println("Es un circulo");
		}
		if(figura instanceof Triangulo) {       	//cuando el if no se cumple por se false no se puestra el contenido
			System.out.println("Es un triangulo");
		}
		if(figura instanceof FiguraGeometrica) {
			System.out.println("Es una figura geometrica");
		}
		if(figura instanceof Object) {
			System.out.println("Es un object");
		}
	}
}
