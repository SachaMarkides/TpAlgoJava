/**
 * 
 */
package imipoecjava2017;

// JAVA pur : permet d'avoir acc�s � Scanner
import java.util.Scanner;

/**
 * @author Sacha
 *
 */
public class PoecJavaApplication {
	
	// ";" instruction de fin de ligne
	
	// Algo : d�claration variable enti�re
	// ENTIER : momVar => int nomVar
	
	// Algo : En java static est not� car utilis� dans une fonction
	// static int jasmine = 7;
	// static int aladin = 5; 
	// static int pannierCommun = jasmine + aladin;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Algo : Alternative au static, d�claration drirectement des variables
		//� l'int�rieur de la focntion
		int jasmine=7;
		int aladin=5;
		int pannierCommun = jasmine + aladin;
		
		System.out.println("Nombre de pomme de Jasmine :"); // Ecrire
		Scanner lire = new Scanner(System.in) ; // Lire
		jasmine = lire.nextInt();				// Recupere la valeur inscrit par l'ultisateur dans jasmine
		System.out.println("Nombre de pomme de Aladin :");
		aladin = lire.nextInt();
		
		lire.close(); // JAVA -> Ferme le scanner
		
		// Algo : Ecrire
		System.out.println(pannierCommun);
	}

}
