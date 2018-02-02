package MtricesManejo;

public class RecorrerConFor {
	
	public static void main(String[] args) {
	    //Matriz de tipo string con notacion simplificada	
		String [][] nombres= {{"paco","puca","juan"},{"daniels","verizon","aleido"}};
		
		//imprimimos el numero de indices de los renglones.
		System.out.println("el largo de los renglones: "+nombres.length);
		
		//al colocar el nombre de la varibale, tambien asignamos un indice del cual comenzara a contar las columnas
		//(cuenta los valores que son el numero de columnas),*todos los renglones tienen las mismas columnas.
		System.out.println("El numero de columnas es: "+nombres[1].length);
		
		//Se utiliza un ciclo for para recorre la matriz e imprimir cada celda
		//para ello utilizamos un ciclo for dentro de otro, donde iniciamos delimitando el primer ciclo for con nombres.length que hace referencia
		//a la cantidad de renglones que tiene la matriz
		//despues en el siguiente ciclo for lo delimitamos con nombres[i].length que tomara la variable de el ciclo for anterior y contara a partir
		//de ella hacia el lado derecho*(la y)
		
		for(int i=0; i < nombres.length;i++) {
			//el ciclo for externo es el que define los renglones de la matriz, comenzando en 0
			
			for(int j = 0; j<nombres[i].length;j++) {
				//en este ciclo interno se definen las columnas de la matriz, 
				
				System.out.println("El valor de la celda :"+i+" "+j+": es: "+nombres[i][j]);
                 
				//por ultimo imprimimos el valor de cada celda que estara sujeta a los valores de i(x) y j(y) en cada ciclo del for
		//Nota, el ciclo for externo, continua hasta qye el ciclo for interno aya terminado con su ciclo
			//(hasta que se complete su condicion.)
			}
		}
		
	}
}
