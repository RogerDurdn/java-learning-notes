/*====================USO DE LA PALABRA FINAL========================
 * Afecta a variables y es posible utilizarla en metodos y clases
 * Usos de la palabra fina:
 * -Variables; evita cambiar el valor que almacena la variable, es posible inicializar una variable, pero cuando se
 * inicializa su valor, es imposible modificar dicho valor.*en la variabbles(objeto) que refieren a una direccion
 *  de memoria es posible cambiar el estado del objeto, pero no la referencia donde se ubica.
 *  
 *  ~~Debido a que el uso de la palabra final se relaciona con las constantes, es comun que se combine con la 
 *  palabra static, para hacer uso directamente, en lugar de crear un objeto de la clase, para usar 
 *  la variable final, en cambio al definir una clase como public static y final, se puede acceder directamente 
 *  indicando el nombre de la clase y posteriormente el nombre de la variable, y si usamos la funcion de 
 *  import static podemos utilizar directamente el nombre de la constante.Ej: Math.Pi, esta variable esta definida 
 *  como public sttic final.
 * -Metodos: Cuando se utiliza en un metodo, lo que se hace es definir que una subclase no puede ReEscribir el 
 * comportamiento de la clase padre, lo que deja a la subclase solo con la posibilidad de usarlo tal como lo define
 * la clase padre,
 * -En clase: Cuando usamos la palabra final en una clase, decimos que no se puede crear una clase que extienda, 
 * herede de esta clase.
 * */
