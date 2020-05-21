package Programa;
import java.util.Scanner;


public class passarLlista {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		String user = preguntarUsuari();
		String pw = preguntarPassword();
		System.out.println("Benvingut " + user);


	}



	public static String preguntarUsuari() {
		System.out.println("Indica el teu usuari: ");
		
		return sc.next();
	}
	
	public static String preguntarPassword() {
		System.out.println("Indica la teva contrasenya: ");
		
		return sc.next();
	}


}
