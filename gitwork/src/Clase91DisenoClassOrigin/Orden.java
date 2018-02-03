package Clase91DisenoClassOrigin;

public class Orden {
	private final int idOrden;
	private static int contadorOrden;
	Producto[] productos;
	int contadorProductos;
	static final int maxProductos=5;
	 
	 	public Orden() {
	 		idOrden = ++contadorOrden;
	 		productos = new Producto[maxProductos];
	 	}
	 		public void agregarProducto(Producto producto) {
	 			if(contadorProductos<maxProductos) {
	 				productos[contadorProductos++]= producto;
	 		}
	 			else {System.out.println("no se puden agragar mas productoos");}
	 	}
	 		public double calcularTotal() {
	 			double total=0;
	 			for(int i = 0; i<contadorProductos;i++) {
	 				total += productos[i].getPrecio();
	 			}
	 			return total;
	 		}
	 		
	 			public void mostrarOrden() {
	 				int i=0;
	 			System.out.println("idOrden:#"+idOrden);
	 			System.out.println("Total de la Orden:#"+idOrden+" :$"+calcularTotal());
	 			System.out.println("Productos de la orden");
	 			while(i<contadorProductos) {
	 				System.out.println(" "+productos[i]);
	 				i++;
	 			}
	 		}
}
