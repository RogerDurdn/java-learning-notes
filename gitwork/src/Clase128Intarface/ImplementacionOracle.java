package Clase128Intarface;

public class ImplementacionOracle implements AccesoDatos {

	@Override 
	public void insertar() {								//Se sorbreescribe el metodo, 
		System.out.println("Insertar desde Oracle");		//Aqui es donde se agrega el cuerpo del metodo el cual puede contener cualquier codigo de java valido lo que dara
	}														//su funcionalidad
	@Override												//el uso de Override no refleja realmente una sobre escritura ya que en esta clase se esta definiendo el
	public void listar() {									//comporttamiendo se la clase por vez primera
		System.out.println("Listar desde Oracle");			// pero como los metodos son usados en otra clase si se presta a la interpretacion de sobreescritura.
	}			//Nota: Si no se usan los metodos definidos en una interface, en su totalidad, la clase deberia de ser Abstracta. por eso aqui al usar los metodos la clase puede quedar normal
}	//Nota*:A diferencia del extends, cuando usamos implements, podemos hacerlo de varias interfaces, las cuales tienen que estar separadas entre si por "," en su nombre:
		// public class implmentacionOracle implements AccesoDatos,Int2,Int3 { y se tiene que recordar el uso de todos los metodos de cada interface, puues de lo contrarios la clase
		// no se podra usar normal y tendra que ser definica como una clase Abstracta.
