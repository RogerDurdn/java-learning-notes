package Clase110AUTOBOXINGuNBOXIN;

public class Ejercicio {

	public static void main(String[] args) {
		
		System.out.println("Autoboxing");
		
		Integer enteroObj = 10;
		Float flotanteObj = 14.4F;
		Double dobleObj = 23.2;
		
		System.out.println("valores obj:"+enteroObj.intValue());
		System.out.println("valores obj:"+flotanteObj.floatValue());
		System.out.println("valores obj:"+dobleObj.doubleValue());
		
		
		System.out.println("\nAutoUnboxing");
		
		int entero = enteroObj;
		float flotante = flotanteObj;
		double doble = dobleObj; 
		
		System.out.println("valores ptv:"+entero);
		System.out.println("valores ptv:"+flotante);
		System.out.println("valores ptv:"+doble);
		
		
	}
}
