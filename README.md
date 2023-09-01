## Diplomado de Automatización de Pruebas Web

### Bases de Java y Programación Orientada a Objetos

Este proyecto esta enfocado en brindar la mayor cantidad de conceptos importante sobre Java y POO con el fin de enseñar y reforzar el conocimiento base para la automatización de pruebas web.

###Java - Conceptos Básicos

####Partes básicas de una Clase

```java
public class Persona {

/*
ATRIBUTOS
Estos van acompañados de los modificadores de acceso, tipo de dato, nombre y asignación (opcional).
*/

	public int id = 1088;
    private String nombre = "Juan";
	
	/*
	CONSTRUCTOR: 
	- Si no se crea un constructor, este asume por defecto uno vacio.
	- Si se desea crear uno o más constructores, se nombra igual que la clase. 
	- Puede o no recibir parametros y 
	- No necesariamente debe recibir la misma cantidad de parametros o mismos tipos de datos declarados en los atributos.
	*/
	
	public Persona(int id, String nombre){
		this.id = id;
		this.nombre = nombre;
	}
	
	//Constructor vacio: Si se crea un constructor con parametros, pero se quiere tener el vacio, es importante declararlo, ya que Java ya no lo toma por defecto al existir uno previamente.
	
	public Persona(){
	}
	
	/*
	GETTER Y SETTER
	Estos metodos permiten acceder a los atributos sin tener que hacerlo de manera directa. De esta manera se pueden tener los atributos privados.
	Set: Asignar valor a una variable. Generalmente no retorna nada por lo que su tipo es "void".
	Get: Para obtener el valor de un atributo, si hablamos de obtener, claramente debe retornar un tipo de dato (String, int, Boolean, Clases, etc).
	*/

	 public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
	
	/*
	MÉTODOS
	Aparte de Get y Set, cada clase puede tener comportamientos especificos. Estos se declaran en la clase con la lógica, parametros y acciones correspondientes.
	*/
	
	public int calcularPasosPorDia(int estatura) {
        int pasosDia; //Se pueden declarar variables locales, no necesariamente como atributos.
		//Logica para el metodo
		return pasosDia;
    }
}
```

####Declaración de Objetos
```java
//Objeto creado con constructor que recibe parámetros.
Persona ingJuan = new Persona(1088, "Juan"); 
//Objeto creado con constructor vacio.
Persona ingJuan = new Persona();
```

####Invocación de Métodos desde los Objetos
```java
//Si se quiere asignar valores a atributos privados, se puede hacer con los set enviando parametros..
ingJuan.setNombre("Carlos");
//Invocar método get de la clase, no recibe parámetros.
ingJuan.getNombre()
//Invocar métodos diferentes a Get y Set pasando parámetros.
ingJuan.calcularPasosPorDia(185);;
```
###Happy Coding!


------------



####Diplomado de Automatización de Pruebas Web
#####Dip Learn Academy y AseUTP
***Juan de Jesús Fernández Graciano***
***Bryan Estefan Moreno Diaz***