package Clase102VarArgsArgumentosDistintos;
/*================================================================VARIOS ARGUMENTOS================================================
 * Una regla nueva del uso de argumentos variables
 * *Si vamos a utilizar el concepto de argumentos variables, [Es necesario que sea el ultimo de los argumentos declarados en un metodo] 
 * =De esta manera al llamar a la funcion no habra confucion para el compilador, porque en cuanto detecte que comienzan el tipo de datos 
 * VarArg Definido, este (el compilador) comenzara a crear el arreglo de elementos enviados a la funcion
 * 
 *   Expl: El compilador de java detecta el numero de elementos enviados y una ves que termina se asignar lo elementos que no son de tipo VarArg
 *   revisara si el ultimo elemento declarado es de tipo VarArg y de esta manera es como todos los valores restantes que sean del mismo tipo del
 *   argumento VarArg definido los asignara al elemento de argumento variabley finalmente los convierte en un arreglo.
 *   
 *   -Esta regla es iportante para usar las VarArg ya que enm ocaciones las querremos utilizar con vasrios argumentos y es aqui donde se debe de
 *   aplica esta regla.
 * */

public class VarArgs {
	
	public static void main(String[] args) {
		
		variosParametros("Juan",true,10,12,32,11); //declaracion del argumento variable con diferentes argumentos pero al final con un argumento VarArg (10,12,32,11)
	}
	
	public static void variosParametros(String nombre,boolean valido,int... numeros) { //se definen los argumentos, y el que sera argumento variable tiene que se el ultimo en se definido
		
		System.out.println("nombre:"+nombre);						//imprimimos el argumento String
		System.out.println("Validos:"+valido);						//imprimimos el argumento boolean
		
		for(int numero : numeros) {								//usamos un for each para recorrer el arreglo que se creo en nuestro arggumento Variable
			
			System.out.println("el numero es:"+numero);		//imprimimos cada numero
			
		}
	}

}
