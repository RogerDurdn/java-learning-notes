package Clase119InstanceOff;
/*==========================================PALABRA INSTANCE OFF EN JAVA=======================================
 * Responde a la pregunta de si una Clase tiene relacion alguna con otra clase que indiquemos
 * 
 * Ejemplo:
 * 							Object						//clase por default en java de la cual derivan todas
 * 							  |
 * 							  |Extends
 * 							  |
 * 						Figura Geometrica				//La clase padre, deriva solamente de la clase object
 * 							  |
 * 							  |
 * 							  |Extends
 * 				--------------------------------		
 * 				|				|				|
 * 				|				|				|		
 * 				|				|				|
 * 			Rectangulo		Triangulo		Circulo		//se crean 3 clases que derivan de la clase padre y de la clase object
 * 												|
 * 												|Extends
 * 												|
 * 											Elipse		//esta clase deriva de la clase circulo, figuras y de la clase object
 * 
 * La palabra reservada instance off nos ayuda en saber cual es la relacion de una clase
 * 
 * Su uso en JAVA:
 * Si corresponde con el tipo de dato, regresa True, de lo contrario regresa false,
 * -Se debe de hacer la comparacion desde las clases inferiores hacia las superiores, ya que si comenzamos con las clases superiores, regresa un true y 
 * las demas clases(inferiores) ya no las analisa.
 * -Solo puede usarce en variables de tipo object
 * -Sirbe para la gerarquia de clases, ver el codigo claramente, saber cuales clases son subclases y asi poder usar sus metodos etc
 * Permite saber el tipo de dato del objeto en TIEMPO DE EJECUCION y asi poder realizar alguna accion por la relacion detectada
 * */
public class InstanceOff {
	
	public static void main(String[] args) {
		
		
		FiguraGeometrica figura; //se crea una variable de tipo figurageometrica
		
		figura = new Elipse();		//se usa la variable para hacer de ella un objeto
		
		determinarFigura(figura); //se utiliza el metodo 
	}
	private static void determinarFigura(FiguraGeometrica figura) { //metodo para determinar que instancias tiene el objeto creado
		
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
		
	}
}
