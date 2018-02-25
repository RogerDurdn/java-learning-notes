package abstracto.domain;

public 	abstract class FiguraGeometrica {
	
	protected String tipoFigura;
	
	protected FiguraGeometrica(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}
	public abstract void dibujar();
	
	public void setTipoFigura(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}
	public String getTipoFigura() {
		return tipoFigura;
	}
	@Override
	public String toString() {
		return "\nTipo de figura:"+tipoFigura;
	}
}
