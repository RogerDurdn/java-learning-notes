package Clase126ClassAbstractas;
/*=================================================================CLASES ABSTRACTAS=====================================
 * Si una clase contiene un metodo abstracto, la clase se debe declarar de igual forma como abstracta (abstract) esto es 
 * una regla del compilador de java, 
 * Una clase abstracta puede contener metodos abstractos pero tambien no abstractos,
 * --Un metodo abstracto no tiene cuerpo ({}) y solo termina con (;), de esta manera un metodo abstracto solo define
 * la forma del metodo, pero no agrega ningun comportamiento y son las clases hijas las que se encargan de implementar 
 * este comportamiento, de alguna manera es como si se sobreescribiera, pero como en el metodo padre no se define ningun 
 * comportamiento en el metodo abstracto, no se "sobreescribe" ya que no hay comportamiento a reemplazar, si no que la implementa.
 * 
 * =============================================================RESTRICCIONES DE LAS CLASES ABSTRACTAS=========================================================
 * Una clase abstracta no se puede instaciar, debido a que algo abstractono puede materializarce en un objeto.
 * Si se pueden crear variables del tipo de la clase abtracta que almacenen referencias a subclases y asi llamar a los metodos en comun entre la clase padre
 * y la subclase.
 * Es muy similar su comportamiento al concepto de polimorfismo,
 *  Si asignamos una referencia de un objeto de subclase de una clase padre abstracta a una variable 
 * de tipo padre, podremos ejecutar el metodo definido en la subclase. 
 * */
public class ClasesAbstractas {

}
