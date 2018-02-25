package Clase126ClassAbstractas;
import abstracto.domain.*;

public class Ejercicio {
	
	public static void main(String[] args) {
		
		 FiguraGeometrica triangulo = new Triangulo("triangulo");
		 FiguraGeometrica rectangulo = new Rectangulo("rectangulo");
		 FiguraGeometrica circulo = new Circulo("circulo");
		 
		 System.out.println(triangulo);
		 triangulo.dibujar();
		 
		 System.out.println("");
		 System.out.println(rectangulo);
		 rectangulo.dibujar();
		 
		 System.out.println("");
		 System.out.println(circulo);
		 circulo.dibujar();
		 
		 
	}
}
