package paquete1;

public class Clase2 {

	public Clase2() {
		
		System.out.println();
		
		new Clase1(1);
		
		new Clase1(1,2);
		
		new Clase1(1,2,3);
		
		//new Clase1(1,2,3,4); por ser un constructor private no puede utilizarlo esta clase
		System.out.println("Constructor private acceso denegado");
	}
	public void pruevaDesdeClase2() {
		Clase1 c1  = new Clase1();
		
		System.out.println("");
		System.out.println("Atributo Publico:"+c1.atrPublico);
		System.out.println("Atributo Protegido:"+c1.atrProtegido);
		System.out.println("Atributo paquete:"+c1.atrPaquete);
		System.out.println("Atributo privado acceso denegado");
		
		System.out.println("");
		System.out.println("Metodo Publico:"+c1.metodoPublico());
		System.out.println("Metodo Protegido"+c1.metodoProtected());
		System.out.println("Metodo pauqte:"+c1.metodoPaquete());
		System.out.println("Metodo privado acceso denegado");



	}
}
