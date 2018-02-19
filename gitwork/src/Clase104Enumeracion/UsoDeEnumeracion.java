package Clase104Enumeracion;

public class UsoDeEnumeracion {
	
	public static void main(String[] args) {
		
		//valores de la enumeracion 
		System.out.println("valor1:"+Enumeraciones.LUNES);
		
		//hacemos un test del dia utilizado
		indicarDia(Enumeraciones.LUNES);
	}
	public static void indicarDia(Enumeraciones dias) {
		
		switch (dias) {
		
		//Podemos usar algun valor constante de la enumeracion directamente
		case LUNES: 
			System.out.println("Primer dia de la semana");
			break;
		}
	}
}
