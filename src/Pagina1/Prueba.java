package Pagina1;
import java.util.*;
import javax.swing.JOptionPane;
public class Prueba {

	public static void main(String[] args) {
		final String palabras[] =  {"hola", "adios", "java", "variable","python","php","xd","javascript","naruto","for"};
		Descripcciones descriptions = new Descripcciones();
		descriptions.AsignarDescripcciones();
		String States[] = new String [6];
		States[1] = " \n"
	            + " ------\n"
	            + "|      |\n"
	            + "|      O\n"
	            + "|\n"
	            + "|\n"
	            + "|\n"
	            + "|\n"
	            + "|\n"
	            + "|\n"
	            + "|";
		States[2] = " \n"
	            + " ------\n"
	            + "|      |\n"
	            + "|      O\n"
	            + "|      |\n"
	            + "|      |\n"
	            + "|      |\n"
	            + "|\n"
	            + "|\n"
	            + "|\n"
	            + "|";
		States[3] = " \n"
	            + " ------\n"
	            + "|      |\n"
	            + "|      O\n"
	            + "|      |\n"
	            + "|      |\n"
	            + "|      |\n"
	            + "|      |\n"
	            + "|     / \\n"
	            + "|    /   \\n"
	            + "|   /     \\";
		States[4] =" \n"
	            + " ------\n"
	            + "|      |\n"
	            + "|      O  /\n"
	            + "|      | /\n"
	            + "|      |/\n"
	            + "|      |\n"
	            + "|      |\n"
	            + "|     / \\n"
	            + "|    /   \\n"
	            + "|   /     \\";
		States[5] = " \n"
	            + " ------\n"
	            + "|      |\n"
	            + "|   \\  O  /\n"
	            + "|    \\ | /\n"
	            + "|     \\|/\n"
	            + "|      |\n"
	            + "|      |\n"
	            + "|     / \\n"
	            + "|    /   \\n"
	            + "|   /     \\";
		States[0] = "tas bien\n ***POR AHORA***"; 
		
		Random xd = new Random();//todo este parrafo es una declaracion de variables impresionante
		int randomWord =  xd.nextInt(palabras.length);
		String WordActual = palabras[randomWord];
		char newWord[] =  new char[WordActual.length()];
		int Ahorcar = 0;
		boolean existencia = false;
		boolean ExistenciaLetra = false;
		boolean GameOver = Ahorcar == States.length;
		
		System.out.println("la palabran tiene " + WordActual.length()  +"digitos");
		System.out.println("la descripccion de la palabra es:" + descriptions.MostrarDescripcciones(randomWord));
		System.out.println("indica un caracter para adivinar la palabra");
		
		do {	
			ExistenciaLetra = false;
			char respUsuario = JOptionPane.showInputDialog("introduce un CARACTER").charAt(0);
		
			System.out.print("actualmente vas asi ");//esta sentencia es para mostrar al usuario como va el juego
			for (int i = 0; i < WordActual.length(); i++) {
				if(respUsuario == WordActual.charAt(i)) {
					newWord[i] =  respUsuario;
					ExistenciaLetra = true;
				} //Probando un ternario
				System.out.print( newWord[i] );
				System.out.print("_");
							
			}
			System.out.println(" "); 
			if(!ExistenciaLetra && Ahorcar < States.length) {//eso es para incrementar el print de los ahorcados
				Ahorcar++;
			}///comentando lo negativo
			if(Ahorcar<States.length) {
				 System.out.println(States[Ahorcar]);
			}
			
 System.out.println("\n" + Ahorcar + "/" + States.length);
			String newWordString =  new String(newWord); //usando este metodo conovierto un array de charr en String
		existencia = newWordString.equalsIgnoreCase(WordActual) ;
		GameOver = Ahorcar == States.length;
		}while(!existencia && !GameOver);
		
		if(existencia) {//dependiendo del final del do while gan o pierde el usuario y se le muestra un mensaje
			System.out.println("felicidades Ganaste la palabra era: " + WordActual);
		}else if(GameOver) {
			System.out.println("Lo siento bro, you lose la palabra era: " + WordActual);
		}else {
			System.out.println("end");
		}
		//	ran.setArgumento(palabras.length);
			
		
	}
}
