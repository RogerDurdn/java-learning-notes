package Clase142Generics;
/*================================================================   GENERICS EN JAVA	====================================
 * Los tipos generics se introdujeron en la version 1.5 y el cual fue un gran cambio para la version.
 * -Anteriormente teniamos que saber exactamente el tipo de dato que hibamos a utilizar para por ejemplo, pasar parametros 
 * a una funcion, pero ahora con el uso de genericos, podemos dejar pendiente el tipo de dato, hasta el momento de instanciar alguna
 * clase generica o del paso de un parametro gnerico.
 * Tipos genericos que se pueden utilizar TG= Tipo Generico:
 * 	Nombre TG | Significado del TG
 * 		E			Element(generalmente usado por el framework de colecciones de Java)
 * 		K			Key(Llave, utilizado en mapas)
 * 		N			Numbre(Utilizado para numeros)
 * 		T			Type(Representa un tipo, es decir una clase)
 * 		V			Value(Representa un valor, tambien se usa en mapas)
 * 	S,U,etc			Usado para representar otros tipos
 * 
 * Definicion de una clase gnerica:
 * 	
 * 	public class ClaseGenerica<T>{
 * 		
 * 			//definimos una variable de tipo generico
 * 		T objeto;
 * 	public ClaseGenerica(T objeto){
 * 		this.objeto = objeto;
 * 	public void obtenerTipo(){
 * 		System.out.println("El tipo T es:"+ objeto.getClass().getName());
 * 		}
 * 	 }
 * }
 * */
public class Genericos<T> {													//uso del operador <diamante> donde la T es el pseudonimo de la clase
																			//la variable T es remplazada al momento de usar la clase generica
 			//definimos una variable de tipo generico
		  T objeto;
		public Genericos(T objeto){
		this.objeto = objeto;
		}
		public void obtenerTipo(){
		  System.out.println("El tipo T es:"+ objeto.getClass().getName());
		  }	 
	public static void main(String[] args) {
		
		Genericos<Integer> objetoInt = new Genericos<Integer>(15);
		
		Genericos<Double> objetoD = new Genericos<Double>(1.5);
		objetoInt.obtenerTipo();
		objetoD.obtenerTipo();
	}
}