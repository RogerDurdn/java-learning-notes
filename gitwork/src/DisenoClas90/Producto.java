package DisenoClas90;

public class Producto {
	private int idProducto;
	private String nombre;
	private  double precio;
	 static int contadorProductos;
	
	public Producto() {
		this.idProducto = ++contadorProductos;
	}

	public Producto(String nombre, double precio) {
		this();
		this.nombre = nombre;
		this.precio = precio;
		
	}
	public String getNombre() {
		return   nombre;
	}
	public  double getPrecio() {
		return precio;
	}
	public  void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString () {
		return nombre+"\tid:"+idProducto+": \tprecio:"+precio; 
	}
	
	
	

}
