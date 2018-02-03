package DisenoClas90;
import javax.swing.*;
public class Ventas {
	public static void main(String[] args) {
		int p = 0;
	Producto lista[];
	lista = new Producto[13];
	
	
		lista [0] = new Producto("pantalon",99.0);
		lista [1] = new Producto("camisa\t",55.3);
		lista [2] = new Producto("bolsa\t",20.0);
		lista [3] = new Producto("lentes\t",45.0);
		lista [4] = new Producto("cinturon",95.0);
		lista [5] = new Producto("paraguas",80.0);
		lista [6] = new Producto("chamarra",69.30);
		lista [7] = new Producto("teniz\t",77.0);
		lista [8] = new Producto("zapatos\t",12.0);
		lista [9] = new Producto("playera\t",30.0);
		lista [10] = new Producto("blusa\t",50);
		lista [11] = new Producto("mochila\t",90.0);
		lista [12]= new Producto("calcetines",38.70);
		
		JOptionPane.showMessageDialog(null,"Productos que se pueden comprar","La compra",JOptionPane.INFORMATION_MESSAGE);
		
		while(p<lista.length) {
		System.out.println(lista[p]+"\t#:"+p);
		p++;
		}
		String f="";
		
		String d = JOptionPane.showInputDialog("Comprara? si,no");
		
		
		if(d.equals("si")) {	
			do{
				Orden orden =new Orden();
		      do{
		    	  int a = Integer.parseInt(JOptionPane.showInputDialog("introdusca el numero del producto. #"));
		            
		            	orden.agregarProducto(lista[a]);
		            	
		            	
		            	 d = JOptionPane.showInputDialog("Quiere anadir otro producto: si,no");
		            	 
		     	}while(d.equals("si")); 
		      
		      orden.mostrarOrden();	
		      f = JOptionPane.showInputDialog("Quiere realizar otra compra?: si,no");
	
		 }while(f.equals("si"));
	}
		System.out.println("adios");
		
	}
}
