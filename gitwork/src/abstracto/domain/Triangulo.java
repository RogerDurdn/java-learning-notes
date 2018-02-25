package abstracto.domain;

public class Triangulo extends FiguraGeometrica {
	
	public Triangulo(String tipoFigura) {
		super(tipoFigura);
	}
	public void dibujar() {
		System.out.println("Aqui debe dibujar un:"+this.getClass().getSimpleName());
	}
}

