/**
 * 
 */
package imipoecjava2017;

// JAVA pur : permet d'avoir accès à Scanner
import java.util.Scanner;

/**
 * @author Sacha
 *
 */
public class PoecJavaApplication {
	
	// ";" instruction de fin de ligne
	
	// Algo : déclaration variable entière
	// ENTIER : momVar => int nomVar
	
	// Algo : En java static est noté car utilisé dans une fonction
	// static int jasmine = 7;
	// static int aladin = 5; 
	// static int pannierCommun = jasmine + aladin;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Algo : Alternative au static, déclaration drirectement des variables
		//à l'intérieur de la focntion
		int jasmine=7;
		int aladin=5;
		int pannierCommun = jasmine + aladin;
		
		System.out.println("Nombre de pomme de Jasmine :"); // Ecrire
		Scanner lire = new Scanner(System.in) ; // Lire
		jasmine = lire.nextInt();				// Recupere la valeur inscrit par l'ultisateur dans jasmine
		System.out.println("Nombre de pomme de Aladin :");
		aladin = lire.nextInt();
		
		pannierCommun = jasmine + aladin;
		
		//lire.close();  JAVA -> Ferme le scanner
		
		// Algo : Ecrire
		System.out.println(pannierCommun);
		
		// Test Conditionnelle :
		// si alors sinon si sinon en java => if(condition) else if(condition) else 
		// test égalité en java => "=="
		// NON(condition) => !(condition)
		// ET => &&
		// OU => ||
		
		int chiffre1 ;
		int chiffre2 ;
		int res = 0;
		
		System.out.println("Chiffre 1 :");
		chiffre1 = lire.nextInt();
		System.out.println("Chiffre 2 :");
		chiffre2 = lire.nextInt();
		
		if (chiffre1==chiffre2){
			res = chiffre1 + chiffre2;			
		}else if((chiffre1 < 0) && (chiffre2 > 0)){
			res = chiffre1 * chiffre2;
		}else if( ( ((chiffre1 > 0) && (chiffre2 > 0))          ||
				    ((chiffre1 < 0) && (chiffre2 < 0))     )    && 
				  ( ((chiffre1 > 10) || (chiffre1 < -10))       || 
				    ((chiffre2 > 10) || (chiffre2 < -10))  )       ){
			res = chiffre1 / chiffre2;
		} 
		
		if(res!=0){
			System.out.println(res);
		}else{
			System.out.println("J'ai fait aucun test");
		}
	
		
		
	}

}
