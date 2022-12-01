package Pagina1;
import Pagina1.Prueba;
public class Descripcciones {


	private final String DescriptWords[] = new String[10];
	
	public Descripcciones() {
		
	}
	
	public void AsignarDescripcciones() {
		DescriptWords[0] =  "Es el saludo mas normal del mundo";
		DescriptWords[1] = "Es la despedida mas comun del mundo";
		DescriptWords[2] = "es el lenguaje con el que esta hecho este programa";
		DescriptWords[3] = "es el tipo de dato principal en la programacion, similar a las constantes";
		DescriptWords[4] = "es un lenguaje de programacion usado para la mineria de Datos, la IA, el hacking, el Backend, etc";
		DescriptWords[5] = "es un lenguaje de programacion que sirve para backend y esta";
		DescriptWords[6] = "es el simbolo principal de la generacion Z/Milenials";
		DescriptWords[7] = "es el lenguaje de programacion Scripting mas conocido en el mundo";
		DescriptWords[8] = "es el protagonista de Naruto";
		DescriptWords[9] = "Es el bucle mas usado para recorrer un arreglo";

	}
	public String MostrarDescripcciones(int numDescripccion) {
		
		return DescriptWords[numDescripccion];
	}
}