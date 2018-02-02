package MatrizEjerc;
import d.a.persona.Persona;
public class MatrzEjerc {

	public static void main(String[] args) {
		
		int [][] numeros;
		Persona [][] personas;
		
		String [][] nombres= {{"juan","pepe","paco","josue"},{"albert","fuli","guy","poncho"}};
		
		personas = new Persona[3][2];
		numeros = new int [3][3];
		
		
		personas [0][0] = new Persona("luis");
		personas [0][1]= new Persona("juan");
		personas [1][0]= new Persona("Dal");
		personas [1][1]= new Persona("niel");
		personas [2][0]= new Persona("anil");
		personas [2][1]= new Persona("ani");

		numeros [0][0] = 1;
		numeros [0][1] = 2;
		numeros [0][2] = 3;
		numeros [1][0] = 4;
		numeros [1][1] = 5;
		numeros [1][2] = 6;
		numeros [2][0] = 7;
		numeros [2][1] = 8;
		numeros [2][2] = 10;
		
		for(int i=0 ;i < numeros.length;i++) {
			
			for(int j = 0;j<numeros[i].length;j++) {
				
				System.out.println("la celda:["+i+"]["+j+"] tiene el numero:"+numeros[i][j]);
				
			}
		}
		System.out.println("");
				for(int i=0 ;i < nombres.length;i++) {
			
						for(int j = 0;j<nombres[i].length;j++) {
				
								System.out.println("la celda:["+i+"]["+j+"] tiene el nombre:"+nombres[i][j]);
									
						}
				}
		System.out.println("");
				for(int i=0 ;i < personas.length;i++) {
					
					for(int j = 0;j<personas[i].length;j++) {
						
						System.out.println("la celda:["+i+"]["+j+"] tiene la:"+personas[i][j]);
						
					}
				}
				
	}
}

