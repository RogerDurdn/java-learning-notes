package Clase145PropiedadesSystema;
import java.util.*;
/*================================================ PROPIEDADES DEL SYSTEMA ==============================================
 * 	Se utiliza para saber las propiedades del system(nos arroja las propiedades de nuestro sistema.)
 * */
public class PropiedadesSystema {

	public static void main(String[] args) {
		
		Properties propiedades = System.getProperties();
		
		Enumeration nombrePropiedades = propiedades.propertyNames();
		
		while(nombrePropiedades.hasMoreElements()) {
			String nombrePropiedad = (String) nombrePropiedades.nextElement();
			
			String valorPropiedad = propiedades.getProperty(nombrePropiedad);
			
			System.out.println("Llave: "+nombrePropiedad+"\t= "+valorPropiedad);
		}
	}
}
