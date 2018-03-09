package Clase128Intarface;

public class ManejoInterfaces {
	
	public static void main(String[] args) {
		
		AccesoDatos datos = new ImplementacionOracle(); //se declara una variable de tipo interface(accesoDatos) y al mismo momento guarda una referencia 
														//a un objeto que implementa la clase
		ejecutar(datos,"insertar");						//se llama al metodo que se creo en esta clase el cual es static
	
		datos = new ImplementacionMySql();				//asignamos un objeto de tipo MySql a la misma variable de tipo interface
		
		ejecutar(datos,"listar");
	}
	private static void ejecutar(AccesoDatos datos, String accion) { //en este metodo utilizamos un elemento de tipo interface para la creacion del constructor
		if("listar".equals(accion) ) {		//utilizamos un if else para determinar cual sera el metodo de tipo interface que se utilizara
											//para definir cual sera el metodo se utiliza equals a igualar con un string
			datos.listar();					//utilizancdo la variable de tipo interface llamamos a uno de sus metodos
		}
		else if("insertar".equals(accion)) { //lo mismo que en el if, solo que aqui cambia el string a igualar
			
			datos.insertar();				//se accede al metodo que esta implementado en una de las clases que hace referencia de la interface 
									//pues el metodo en la interface no esta definido.
		}//En este ejemplo podemos notar que una variable de tipo interface puede llamar a un objeto del tipo que aya implementado dicha interface
			//al momento de llamar al metodo y poner los argumentos del constructor el metodo llamara el metodo para la clase que esta en tiempo de ejecucion.
		///lo que se conoce como polimorfismo
	}
}		//las variables de tipo interface pueden apuntar a objetos de clases que las ayan implementado. 
		//tambien hay gerarquia de clases en las interfaces, por lo que se se puede hacer que una variable de tipo interface apunte a un clase que tiene 
		//una interface que sea padre de la interface con la que se declara
