package Clase131JavaBeans;
/*====================================================================MANEJO DE JAVANEANS====================================
 * Un javabean es una clase pura de java, la cual usa ciertas reglas minimas para llamarse javabeas.
 * la idea es que puedan ser utilizadas por otras clases.
 * -Estas javabeans son utilizadas por framework, otras clases u otras tecnologias.
 * 
 * Caracteristicas basicas que debe tener una javaBEans
 * -Debe tener un constructor bacio/ sin importar si tiene mas constructores/ ya que loas tecnologias que agan uso de nuestra clase
 * deben poder instanciar nuestra clase javabeans
 * 
 * -Atributos privados/Con esto se realiza el concepto de encapsulamiento y se prevee la utilizacion de los metodos de get y set
 *
 * -Cada propiedad debe tener su metodo get o set y en caso de ser de tipo booolean en lugar de set se utilizara is/No es necesario que 
 * tenga get y set, si no que puede definir solo alguno de ellos segun lo necesitemos ya que un atributo de solo lectura, implementara solo get
 * 
 * -Implementara la interface serializable del paquete .io "java.io.Serializable", /Existen muchas interfaces llamadas serializable, por ello debemos de
 * asegurarnos de utilizar la llamada java.io/ Esta interface no tiene mtodos, por ello no nos obliga a implementar ningun metodo, pero tiene funciones mas avanzadas, 
 * pero basicamente nos sirbe para serializar nuestros objetos, si lo es necesario [A grandes razgos quiere decir que al tecnologia o clase que utiliza nuestra clase, en claso 
 * de que necesite transmitir nuestra clase por la red, es decir entre 
 * distintos servidores, podra serialisar nuestro objeto(convertirlo en 1-0s) ] Asi como de manera inversa, cuando llega nuestro objeto, deserialisamos nuestro objeto
 * 
 * Resumen: Javabean con la clase java.io.Serializable , serialisa (convierte en numero binario 1-0 ) nuestros objetos para ser enviados por la red y los deserialisa(pasa de binario 
 * a codigo) cuando son entregados los objetos.
 * 
 * Nota*:No se debe de confundir los javabeans con los enterprice javabeans, ya que estos ultimos son tecnologias del lado del servidor.
 * */
public class JavaBeans {

}
