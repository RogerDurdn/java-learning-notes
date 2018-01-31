package clase80Arreglos;
/*===========================INICIAR LOS ELEMENTOS DE UN ARREGLO==================
 *sintaxis para inicializar los elementos de UNA DIMENCION:
 *
 * */
public class IniciarElementoArray {
	public static void main(String[] args) {
		
		int [] enteros;
		enteros = new int[5];
		//para inicializar los elementos en un array se hace los isguiente
		enteros [0] = 5;
		enteros [1] = 49;
    //donde iniciamos con el nombre del array seguido por los corchetes y dentro de ellos el indice(lugar) 
	//que ocupara el valor que modificaremos dentro del array, despues lo igualamos al valor que queremos 
    // poner dentro del indice, dicho valor tiene que ser igual al tipo de array(int, String, double, object, etc)
	
		Perso [] personas;
		String [] nombres;
		
		personas = new Perso[10];
		nombres = new String[5];
		
		personas [3] = new Perso("peped");//para iniciar un array de tipo personas se pone la indicacion new 
										  //seguido de el nombre de la clase y dentro de parentesis el contenido
										  //en este caso por ser String se pone asi.
		personas [0] = new Perso ("Pedro","Lara");
		nombres [3] = new String ("pepe");
		nombres [2] = new String ("tuco");
//si queremos ingresar un valor a un indice que sale de la longitud instannciada del arreglo nos saldra un error
		//array index excepcion para evitar esto podemos poner nombreArray.lenght-1, lo que nos dara el largo 
		//del array																
//================================EXTRAER ELEMENTOS DE UN ARREGLO==============================
		//sintaxis para extraer los elementos de un arreglo de una deimension
//**es lo opuesto de la sintaxis para inicializar los arreglos variableReceptora = nombreArreglo[indice];, 
//la variable debe de ser del mismo tipo un un tipo compatible del arreglo.
	int t = enteros [1];
	int j = enteros [0];
//sintaxis para extraer los elementos en un array object
//exactamente lo opuesto a iniciarla
	String p1 = nombres [3];
	System.out.println("asu mare: "+enteros[0]+" :"+t+" : "+j+" "+p1);
		
		
	}
}
class Perso{
	private String nombre;
	private String apellido;
	public Perso(String nombre) {
		this.nombre = nombre;
	}
	public Perso(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
