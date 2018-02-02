package DisenoClas90;

public class Producto {
	private int idProducto;
	 String nombre;
	private double precio;
	
	public Producto() {
		
	}
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	public String getNombre() {
		return   nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public  String setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString () {
		return "el producto:"+nombre+"con id:"+"tiene un precio de:"+precio; 
	}
	
	
	

}
