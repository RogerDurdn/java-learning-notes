package Clase111ModificadoresAcceso;
/*===================================================================MODIFICADORES DE ACCESO======================================================
 * Se pueden aplicar a la definicion de una clase, a un atributo, un metodo de una clase o al constructor de una clase
 * 
 * Tabla:
 * 
 * 	Modificador		Clase	Variable 	Metodo		Constructor		MismaClase	MismoPaquete	Subclase	TodasLasDemas
 * 
 * 	public			si		si			si			si					si			si				si			si
 *  protected		no		si			si			si					si			si				si			no
 * 	default*		si		si			si			si					si			si				no			no
 * 	private			no 		si			si			si					si 			no				no			no
 * 
 * Estan ordenados de menor restriccion a mayor
 * 
 * default* No es una palabra reservada en java, se usa para definir que una variable de tipo defaul, donde se omite el modificador de acceso 
 * Este se usa implicitamente cuando no se modifica el "modificador de acceso"
 * 
 * Public(+): Aplica para todo, es el menos restrictivo 
 * 
 * Protected(#): Se utiliza cuando se decea proteger las clases que no decienden de la misma clase que define el elemento protected y que no pueden acceder 
 * 	a dicho elemento
 * 	Se encuentra comunmente en los atributos de las clases con el objetivo de que las clases hijas puedean acceder a estos elementos, ya sea en el mismo 
 * 	paquete o en uno distinto Proteje El ACCESO de CLASES EXTERNAS que no tienen que ver con la jerarquia de subclases
 * 	Se usa el simbolo de #
 * 	Ejemplo: 		
 * 		Paquete1]						Paquete2]
 * 		Clase1			<----Extends---	Clase3
 * 		#id: atributo				
 * 		#metodo()										//solo pueden acceder a lo protegido las que deciendan de la clase 1
 * 		
 * 		Clase2 							Clase4
 * 
 * NOTA:No se puede definir una clase como tipo protected, solo los elementos
 * 
 * default o package(~): Limita el acceso a las clases definidas dentro del mismo paquete, por lo que cualquier clase fuera del paquete donde
 * se definio, no podra acceder a sus elemento.
 * Este modificador se implementa cuando NO HAY uso de ningun modificador, lo que le dice al compilador que esta por "default"
 * NOTA: Es poco seguro yaq ue permite que cualquier clase del paquete pueda acceder a los elementos en cuestion.
 * 
 * private(-): Este modificador evita que cualquier otra clase e incluso las mismas subclases puedan acceder al elmento marcado como private, es el mas 
 * restrictivo y no se puede aplicar a ladefinicion de una clase, ya que una clase no puede ser private,  
 *Es comun aplicar este modificador a los atributos de una clase, ya que la idea es que sea a traves de los metodos, get y set la manera en que se acceda 
 *a los atributos de un objeto, pero no directamente,  por lo tanto en general los atributos los nombraremos como private y los get y set como publicos 
 *Tambien se pueden crear metodos privados que solo se podran usar desde la clase donde se definen, 
 *Se pueden definir constructores privados, con el objetivo de ser utilizados en la clase que los define.
 * */
public class ModificadoresAcceso {

}
