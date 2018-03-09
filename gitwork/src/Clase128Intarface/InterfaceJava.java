package Clase128Intarface;
/*===================================================LAS INTERFACES EN JAVA=========================================================
 * Define comportamiento, donde, posterior a la definicion, la clase debe de implementar el comportamiento definido.
 * Los metodos en una interface no contienen ninguna implementacion -- parecido a las clases abstractas en java
 * Po ello el termino eable, se utiliza en algunas interfaces del API de java able = capacidad de hacer algo
 * En java una interface es una declaracion formal de un contrato.
 * 
 * SINTAXIS====
 * Definicion--
 * <modificadores> interface<nombre_interface> [extends <interface padre>
 * {
 * 	<atributos>
 *  <metodos>
 *  }
 *  
 *  Uso-----
 *  <modificadores> class <nombre_interface> [extends <superclass>] [implements <interface1,interface2,etc>]
 *  {
 *  	<implementar_metodos_interface>
 *  }
 *  
 *  --Los atributos declarados en una interface son por defaul publicos,estaticos y finales, = es decir que son constantes y que podremos
 *  acceder simplemente con el uso de la interface y porteriormente el nombre de la constante.
 *  --Si definimos atributos en una interface los escribiremos con MAYUSCULA y si contienen varias palabras las separaremos por un guin bajo _ 
 *  --Los metiodos declarados en una interface por default son publicos, abstractos y no contienen ninguna implementacion, por ello terminan con ;
 *  esto es similar a los metodos abstractos de una clase abstracta, 
 *  
 *  
 *  Similar a la herencia de clases: Una interface puede heredar de otra interface pero no de una clase concreta
 *  --Una interface que hereda de otra interface, agregara a su definicion de metodos tanto los metodos de la interface padre, como los metodos de la
 *  interface que se esta definiendo 
 *  
 *  Relacion Interface-Clases:
 *  --Una interface sigue las mismas nomenclaturas que una clase, por eso hay muchas similitudes entre la sintaxis de una clase y una interface
 *  --Muchas clases pueden implementar la misma interface
 *  --Una clase puede implementar muchas interfaces[aunque no tengan relacion alguna dichas interfaces]
 *  
 *   --Como en una clase abstracta, no podremos crear objetos de una interface, Pero si podremos crear variables de tipo Interface que apunten a 
 *   objetos que implementaron dicha interface, De esta manera tambien aplica el concepto de POLIMORFISMO que hemos estudiado en las clases.
 *   
 *  CLASES ABSTRACTAS VS INTERFACES (diferencias):
 *  -Una clase ABSTRACTA: se utiliza para encapsular funcionalidad comun entre las clases, es decir caracteristicas en comun 
 *  --para hacer uso de una clase abstracta se debe de extender de dicha clase 
 *  
 *  +Una  INTERFACE: define comportamiento relacionado, que puede perteneser a cualquier clase o estructura 
 *  ++para hacer uso de una interface debemos de implementar la interface.
 *  
 *  CLASES ABSTRACTAS: Se utilizan principalmente para objetos estrechamente relacionados.
 *  INTERFACES: Son adecuadas para proporcionar funcionalidad comun a clases no relacionadas entre si.	 
 *  
 * */
public class InterfaceJava {

}
