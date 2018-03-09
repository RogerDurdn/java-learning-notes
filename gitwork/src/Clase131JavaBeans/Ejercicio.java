package Clase131JavaBeans;
import beans.PersonaBeans;
public class Ejercicio {
	
	public static void main(String[] args) {
	PersonaBeans bean = new PersonaBeans();
	
	bean.setNombre("juan");
	bean.setEdad(20);
	
	System.out.println("Nombre:"+bean.getNombre());
	System.out.println("Edad:"+bean.getEdad());
	
	}
}
