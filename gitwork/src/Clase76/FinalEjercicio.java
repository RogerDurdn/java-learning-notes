package Clase76;

public class FinalEjercicio {
	
	public static void main(String[] args) {
		
		
		//ClaseFinal.varPrimitivo =15;  
		//da error ya que no se puede modificar una variable final
		
		//ClaseFinal.objPersona = new Persona();
		//Da error ya que no se puede REASIGNAR la REFERENCIA de la variable persona.
		
		System.out.println("Nombre persona: "+ClaseFinal.objPersona.getNombre());
		
		
		//en cambio si que se puede cambiar el estado del objeto
		ClaseFinal.objPersona.setNombre("hola");
		//Referenciando la variable persona.
		
		System.out.println("Nombre persona: "+ClaseFinal.objPersona.getNombre());
	}
}
