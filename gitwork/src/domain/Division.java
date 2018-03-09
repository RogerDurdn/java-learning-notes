package domain;

public class Division {
	
	//atributos de la clase
	private int numerador;
	private int denominador;
	
	public Division(int numerador, int denominador) throws OperationException{ //Se especifica que es throw mas el tipo exepcion ya que esa hereda de la clase Exception
																				//throws es la palabra que indica que este metodo puede arrojar una exepcion
																				//Si heredara de la clase runTimeException, se podria omitir la declaracion.
		if(denominador == 0 ) {
			//throw new IllegalArgumentException ("denominador igual a cero"); //esta es una exepcion integrada en el API de java
			throw new OperationException("denominador igual a cero"); //throw new OperationException, esta creando una nueva clase de expecion 
		}
		this.numerador = numerador;			//si no hay exepcion se continua con la contruccion del metodo
		this.denominador = denominador;
	}
	public void visualizarOperacion() {
		System.out.println("El resultado de la division es:"+numerador/denominador);
	}
	
}
