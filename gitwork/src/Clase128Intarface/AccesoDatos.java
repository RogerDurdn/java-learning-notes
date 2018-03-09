package Clase128Intarface;

public interface AccesoDatos {
	
	public static int MAX_REGISTROS = 10; //en una interface los atributos son Funciones de tipo public y static, y si no se ponen las palabras de acceso 
										  //public y static el compilador las pondra por defecto
		public abstract void insertar(); //Los metodos son publicos y abstractos y si no se colocan las palabras, el compilador lo tomara por defecto como
		public abstract void listar();	//publicos y abstractos
}				//Los metodos terminan comn ; ya que la implementacion del funcionamiento de los metodos sera anadida por las clases que implementen la interface

