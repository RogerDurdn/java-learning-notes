package Clase91DisenoClassOrigin;

public class Venta {

		public static void main(String[] args) {
			
			Producto p1 = new Producto("panntalon",90);
			Producto p2 = new Producto("mochila",99.90);
			Producto p3 = new Producto("paraguas",76.50);
			Producto p4 = new Producto("bufanda",80.32);
			Producto p5 = new Producto("abrigo",13.90);
			Producto p6 = new Producto("camiseta",54.32);
			Producto p7 = new Producto("calcetines",44.89);
			Producto p8 = new Producto("zapatos",90.9);
			Producto p9 = new Producto("joggers",75.00);
			Producto p10 = new Producto("zandalias",50);
			
			Orden orden1 = new Orden();
			
			orden1.agregarProducto(p6);
			orden1.agregarProducto(p2);
			orden1.agregarProducto(p4);
			orden1.agregarProducto(p9);
			
			Orden orden2 = new Orden();
			
			orden2.agregarProducto(p1);
			orden2.agregarProducto(p2);
			orden2.agregarProducto(p3);
			
			orden1.mostrarOrden();
			orden2.mostrarOrden();
		}
}
