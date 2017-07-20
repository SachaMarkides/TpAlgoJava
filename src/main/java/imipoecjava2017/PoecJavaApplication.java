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
	
	//public final static int TAILLE_J1 = 10;
	
	public final static int DEGAT = 0;
	public final static int PAU = 1;
	public final static int ARMURE = 2;
	public final static int PV = 3;
	public final static int PA = 4;
	public final static int EQUIPE = 1;
	public final static int OUT = -1;
	public final static int NBATTRIBUT = 5;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/* Java -> création d'un tableau à une dimension
		int[] joueur1 = new int[TAILLE_J1] ; // Algo : TABLEAU<ENTIER> [10] : joueur1
		int joueur2[][] = new int[10][10];
		
		 Java -> création d'un tableau avec valeurs initials à une dimension
		int[] joueur3 = {0,2,5,8,9};
		
		 Java -> création d'un tableau à plusieurs dimensions
		int[][][] joueurX = new int[2][2][2];
		
		
		
		for (int i = 0; i < TAILLE_J1; i++) {
			joueur1[i] = i;
		}
		
		
		for (int i = 0; i < TAILLE_J1; i++) {
			
			System.out.print(joueur1[i]+" ");  affichage sur une ligne

			 
			   i++ => i <- i + 1 en Algo
			   i-- => i <- i - 1 en Algo
			 
		}
		
		
		System.out.println();
		
		for (int i = TAILLE_J1-1; i >= 0; i--) {
			System.out.print(joueur1[i]+" ");
		}
		
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				joueur2[i][j]= i*j;
				System.out.print(joueur2[i][j]+" ");
			}
			System.out.println();
		}
		
		boolean flag = true ;
		int k = 0;
		
		 Algo : TANTQUE (condition) ALORS instructions FINTANTQUE
		
		while (flag) {
			System.out.println("yoloswag " + k);
			if (k==10){
				flag = false;
			}
			k++;
		}
		
		k=0;
		flag = true;
		
		 Algo : FAIRE instructions TANTQUE (conditions)
		
		do {
			System.out.println("yoloswag 2 " + k);
			if (k==10){
				flag = false;
			}
			k++;
		} while (flag);
		
		 Algo : SELON (condition) FAIRE instructions FINSELON
		
		
		switch (k) {
		case 10:
			System.out.println("k = "+k);
			break;
			
		default:
			System.out.println("k = "+k);
			break;		
		}
	
	*/
		
		int nbjoueurs ;
		
		do {
		System.out.println("Nombre de joueurs");
		Scanner scan = new Scanner(System.in);
		nbjoueurs = scan.nextInt();
			if(nbjoueurs<2){
				System.out.println("Erreur de saisie");
			}
		} while(nbjoueurs<2) ;
		
		int[] joueurs = new int[nbjoueurs*NBATTRIBUT];
		int choix;
		int adversaire;
		int paCourant;
		boolean process = true ;
		int j=0;
		
		
		
		for (int i = 0; i < (nbjoueurs*NBATTRIBUT); i=i+NBATTRIBUT) {
			j++;
			do {
				System.out.println("Choix arme perso "+j);
				System.out.println("1 concasseur");
				System.out.println("2 pelle");
				System.out.println("3 gatling");
				System.out.println("4 batte de cricket");
				System.out.println("5 blaster");
				Scanner scan1  = new Scanner(System.in);
				choix = scan1.nextInt();
			} while (choix < 1 || choix > 5);
			
			switch (choix) {
				case 1:
					joueurs[i+DEGAT]=3;
					joueurs[i+PAU]=4;
					break;
				case 2:
					joueurs[i+DEGAT]=2;
					joueurs[i+PAU]=1;								
					break;
				case 3:
					joueurs[i+DEGAT]=10;
					joueurs[i+PAU]=6;				
					break;
				case 4:
					joueurs[i+DEGAT]=1;
					joueurs[i+PAU]=1;					
					break;
				case 5:
					joueurs[i+DEGAT]=6;
					joueurs[i+PAU]=3;
					break;
			}
			
			
			choix = OUT;
			
			do {
				System.out.println("Choix armure perso "+j);
				System.out.println("1 gilet bleu ");
				System.out.println("2 armure de cuir");
				System.out.println("3 armure de plaque");
				Scanner scan1  = new Scanner(System.in);
				choix = scan1.nextInt();
			}while(choix<1 || choix >3);
			
			switch (choix) {
				case 1:
					joueurs[i+ARMURE]=1;
					break;
				case 2:
					joueurs[i+ARMURE]=3;			
					break;
				case 3:
					joueurs[i+ARMURE]=5;
					break;
			}
			
			choix=OUT;
			
			do {
				System.out.println("Choix PV perso "+j);
				Scanner scan3  = new Scanner(System.in);
				choix = scan3.nextInt();
			} while (choix<0 || choix>20);
			joueurs[i+PV]=choix;
			choix=OUT;
			
			do {
				System.out.println("Choix PA perso "+j);
				Scanner scan4  = new Scanner(System.in);
				choix = scan4.nextInt();
			} while (choix<0 || choix>20);
			joueurs[i+PA]=choix;
			choix=OUT;
		}
		
		for (int k = 0; k < nbjoueurs*NBATTRIBUT; k++) {
			System.out.print(joueurs[k]+" ");
			if(k%NBATTRIBUT==4){
				System.out.println();
			}
		}
		
	
		
		while (process) {
			int round=0;
			for (int i = 0; i < (nbjoueurs*NBATTRIBUT); i=i+NBATTRIBUT ) {
				round++;
				System.out.println("Round n°"+round);
				if (joueurs[i+PV]>0) {
					adversaire=OUT;
					j=i;
					System.out.println("Choix de l'adversaire");
					do {
						j=j+NBATTRIBUT;
						if(j>NBATTRIBUT*nbjoueurs){
							j = 0;
						}
					} while (joueurs[j+PV]<=0 && j!=i);
					
					if (j!=i) {
						adversaire=j;
					}
					
					if (adversaire!=OUT) {
						paCourant=joueurs[i+PA];
						System.out.println("Le joueur qui tape posede "+paCourant+" PA");
						paCourant--;
						System.out.println("Le joueur qui tape s'équipe de son arme");
						while (((paCourant-joueurs[i+PAU]) >= 0) && process) {
							System.out.println("a");
							if (joueurs[adversaire+PV]>0) {
								System.out.println("b");
								if ((joueurs[adversaire+ARMURE] - joueurs[i+DEGAT]) < 0) {
									joueurs[adversaire+PV] = joueurs[adversaire+PV]  + ( joueurs[adversaire+ARMURE] - joueurs[i+DEGAT] );
									System.out.println("Le joueur qui tape fait "+(- (joueurs[adversaire+ARMURE] - joueurs[i+DEGAT]))+" dégats");
								}else{
									System.out.println("Ne fait pas de degats");
								}
								paCourant=paCourant-joueurs[i+PAU];
								System.out.println("Le joueur qui tape perd "+joueurs[i+PAU]+" PA");
								System.out.println("Il lui reste "+paCourant+" PA");
							} else {
								adversaire=OUT;
								j=i;
								do {
									j=j+NBATTRIBUT;
									if (j > nbjoueurs*NBATTRIBUT) {
										j=0;
									}
								} while (joueurs[j+PV]<=0 && j!=i);
								
								if(j!=i){
									adversaire=j;
								}
								
								if (adversaire==OUT) {
									process=false;
								}
							}
						}
						
					} else {
						System.out.println("Tournoi Fini");
						process = false;
					}
					
				}
			}
		}
		
		System.out.println("programme terminée");
	}
}
