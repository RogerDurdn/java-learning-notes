package d.a.persona;

public class Persona {
	
		 String persona;
		 String apellido;
		public Persona() {
			
		}
		public Persona(String persona) {
			this.persona = persona;
		}
		public Persona(String persona, String apellido) {
			this.persona = persona;
			this.apellido = apellido;
		}
		public String getPersona() {
			return persona;
		}
		public void setPersona(String persona) {
			this.persona = persona;
		}
		@Override
		public String toString() {
			return "persona: {nombre: ["+getPersona()+"]}";
		}
		
	}


