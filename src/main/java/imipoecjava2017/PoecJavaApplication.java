/**
 * 
 */
package imipoecjava2017;

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
		int jasmine = 7;
		int aladin = 5;
		int pannierCommun = jasmine + aladin;
		// Algo : Ecrire
		System.out.println(pannierCommun);
	}

}
