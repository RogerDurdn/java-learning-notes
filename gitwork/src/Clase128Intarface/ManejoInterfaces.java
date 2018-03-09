package Clase128Intarface;

public class ManejoInterfaces {
	
	public static void main(String[] args) {
		
		AccesoDatos datos = new ImplementacionOracle();
		
		ejecutar(datos,"insertar");
	
		datos = new ImplementacionMySql();
		
		ejecutar(datos,"listar");
	}
	private static void ejecutar(AccesoDatos datos, String accion) {
		if("listar".equals(accion) ) {
			datos.listar();
		}
		else if("insertar".equals(accion)) {
			datos.insertar();
		}
		
	}
}
