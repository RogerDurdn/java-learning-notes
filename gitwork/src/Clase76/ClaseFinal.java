package Clase76;

public final class ClaseFinal {//la clase se marca como final
	
	public static final int varPrimitivo = 10;//variables marcadas como finales
	
	public static final Persona objPersona = new Persona();
	
	//metodo final, se estudiara la sobreescritura en una sesion posterior
	public static void metodoFinal() {
		
	}

}
//Si quisieramos hacer una clase con extends de esta clase(ClaseFinal) nos amrcaria error
//pues al momento de hacerla final, niega la creacion de subclases/clasesHija 
//class SubClasefinal extends ClaseFinal{} = Error.