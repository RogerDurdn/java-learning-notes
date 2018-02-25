package Clase124ClaseObject;
	/*	-toString:
	 * 			 Nos sirbe para mostrar una representacion en  texto de nuestras clases, al sobreescribirlo podemos mandar a mostrar el 
	 * 				estado de un objeto en cualquier momento, si no se sobreescribe el metodo, al usarlo, mandara a imprimir la referencia
	 * 				en memoria donde se hubica el objeto en el momento actual, la cual se compone del nombre de la clase, seguida de la 
	 * 				direccion exadecimal en memoria donde se encuentra el objeto, si embargo eso no describe el estado actual del objeto
	 * 				(de sus atributos), debido a esto con el metodo toString tenemos la oportunidad de mostrar una cadena con el etado de nuestro 
	 * 				objeto, simplemente concatenando cada uno de los valores que nos interese mostar de nuestro objeto, por lo regular se 
	 * 				utilizas todos los elementos, pero hay ocaciones en que no sera asi, en los que atributos, seran otros objetos o listas
	 * 				de otros objetos, por lo que hay que tener cuidado ya que podremos tener problemas de RECURCIBIDAD O LLAMADAS CIRCULARES
	 * 				 A OTROS OBJETOS   
	 * 		Ejemplo:
	 * 				String nombre;
	 * 				double sueldo;
	 * 				
	 * 				@Override 												//es opcional agregar la anotacion 
	 * 				public String toString(){
	 * 					return "Empleado:\nnombre:"+nombre+"sueldo:"+sueldo;
	 * 
	 * -equals y -hashCode: 
	 * 				Se utilizan para saber si dos objetos son iguales, 
	 * 				Al no sobreescribirse el metodo equals, este comparara la direccion en memoria de los objetos, en lugar de comparar el 
	 * 				contenido de los objetos(cada uno de sus atributos), pero si lo que queremos es comparar el contenido de los objetos 
	 * 				debemos de sobreescribir el metodo equals.
	 * 			 	Ejemplo:
	 * 					
	 * 						public boolean equals(Object obj){
	 * 							 if (obj == null){
	 * 									return false;
	 * 								}
	 * 								if (obj instanceof Empleado){
	 * 									Empleado emp = (Empleado) obj;
	 * 										if (nombre.equals(emp.nombre) && Double.valueof(sueldo).equals(emp.sueldo)){
	 * 										  return true;
	 * 									}else{
	 * 										return false;
	 * 									}
	 * 								}else{
	 * 									return false;
	 * 								}
	 * 						}
	 * Este tipo de metodos se utilizan comunmente en algoritmos de ordenamiento, ya que se necesita saber si un objeto es igual a otro, y conocer su 
	 * contenido con el objetivo de ordenar objetos, asi que el tema de ordenamiento de objetos se apolla directamente de estos metodos, para saber
	 * que objeto es igual a otro.
	 * 
	 * -hashCode:
	 * 			Cuando definimos un objeto y redefinimos el metodo equals(), DEBEMOS redefinir TAMBIEN le metodo hashCode!! 
	 * 			Si dos objetos son iguales segun el metodo equals, el valor retornado por sus respectivos hashCodes debe de igual.
	 * Por defecto el metodo hashCode devuelve un entero diferente para cada objeto, su uso principal es la optimizacion de las colecciones basadas en 
	 * hashTables para el ordenamiento de sus elementos.
	 * 	Ejemplo:
	 * 			@Override
	 * 			public int hashCode() {
	 * 			int hash = 7;
	 * 			hash = 31 * hash + this.nombre.hashCode();
	 * 			hash = 31 * hash + Double.valueOf(this.sueldo).hashCode();
	 * 			return hash;
	 * 		}
	 * ***************Implementar estos metodos nos permiten saber si dos objetos son iguales, ya sea comparando el contenido de dos objetos por medio de los atributos(equals)
	 * 				O el numero entero que representa al objeto mismo es decir el valor hashCode, de esta manera garantizamos la comprobacion de que sean iguales.
	 * --Entre mas elavorado el hashCode, mas se garantiza que no existan conincidencias entre los objetos a comparar.
	 * [Cabe mencionar que la mayoria de los IDES nos ayuda a desarrollar estos metodos, sin embargo se debe usar cuando ya lo sabemos.
	 * El metodo hashCode genera un valor numerico utilizando los atributos de nuestra clase y cada uno de nuestros atributos de la clase podemos solicitarle su valor
	 * unico, haciendo uso del hascode, y se utiliza algun valor numerico(como la multiplicacion *31) de base, o algun numero base de corrimiento, y asi obtenemos un valor 
	 * numerico unico para cada uno de nuestros objetos 
	 * En el ejemplo de arriba: Utilizamos el 7 y el 31 albitrariamente, ya que lo que queremos es obtener elvalor numerico unico de nuestros atributos, para asi 
	 * compararlos.
	 * En resumen cuando se agrega el metodo equals, se tiene que sobreescribir el metodo hashCode  
	 * 
	 * 			
	 */
public class MetodosClaseObject {

}
