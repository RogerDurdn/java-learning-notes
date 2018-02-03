package Clase91DisenoClassOrigin;

public class Producto {

	private int idProducto;
	private static int contadorProducto;
	private String nombre;
	private double precio;
	
		public Producto() {
			this.idProducto = ++contadorProducto;
		}
		public Producto(String nombre, double precio) {
			this();
			this.nombre = nombre;
			this.precio = precio;
		}
			public void setNombre(String nombre) {
				this.nombre = nombre;
			}
			public String getNombre() {
				return nombre;
			}
			public void setPrecio(double precio) {
				this.precio = precio;
			}
			public double getPrecio() {
				return precio;
			}
			@Override
			public String toString() {
				
				return "|id:"+idProducto+"| nombre:"+nombre+"|precio:"+precio;
			}
}
