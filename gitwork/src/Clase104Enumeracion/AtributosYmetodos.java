package Clase104Enumeracion;
/*==========================================ATRIBUTOS Y METODOS EN UNA ENUMERACION=================
 * Ademas de definir simples valores constantes, podemos agregar valores a cada una de las constantes 
 * para ello debemos de crear un constructor para iniciar cada uno de los valores asociados a cada
 * constante 
 * */
public enum AtributosYmetodos {
	
	AFRICA(53),
	EUROPA(46),
	ASIA(44),
	AMERICA(34),
	OCEANIA(14);
	
	//atributo de cada elemento de la enumeracion
	
	 private final int paises;
	
	//constructor de cada elemento de la enumeracion 
	AtributosYmetodos(int paises){
		this.paises = paises;
	}
	public int getPaises() {
		return paises;
	}
}


