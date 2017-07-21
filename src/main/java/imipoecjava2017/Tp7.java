package imipoecjava2017;

import java.util.Scanner;

public class Tp7 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bac1 = 100;
		int bac2 = 100;
		int bac3 = 100;
		int bac4 = 100;
		int concasseur1 = 0;
		int concasseur2 = 0;
		
		int choix;
		Scanner scan = null;
		
		while(bac1 > 0 && bac2 > 0 && bac3 > 0 && bac4 > 0){
			do {
				System.out.println("Liste des cafes :");
				System.out.println("1 cafe n°1");
				System.out.println("2 cafe n°2");
				System.out.println("3 cafe n°3");
				System.out.println("4 cafe n°4");
				System.out.println("5 cafe n°5");
				System.out.println("6 cafe n°6");
				System.out.println("7 cafe n°7");
				System.out.println("8 cafe n°8");
				scan = new Scanner(System.in);
				choix = scan.nextInt();
			} while (choix <1 || choix >8 );
			
			switch(choix){
				case 1 :
					bac1 = bac1 - 10;
					concasseur1=concasseur1+1;
					System.out.println("café prêt");
					break;
				case 2 :
					bac2 = bac2 - 25;
					concasseur1++;
					System.out.println("café prêt");
					break;
				case 3 :
					bac1 = bac1 - 10;
					concasseur1++;
					System.out.println("café prêt");
					break;
				case 4 :
					bac1 = bac1 - 10;
					concasseur1++;
					System.out.println("café prêt");
					break;
				case 5 :
					bac2 = bac2 - 25;
					concasseur1++;
					System.out.println("café prêt");
					break;
				case 6 :
					bac2 = bac2 - 10;
					concasseur1++;
					System.out.println("café prêt");
					break;
				case 7 :
					bac3 = bac3 - 25;
					concasseur2=concasseur2+1;
					System.out.println("café prêt");
					break;
				case 8 :
					bac4 = bac4 - 12;
					System.out.println("café prêt");
					break;
			}
		
		}
		System.out.println("La machine est hors-service");
		
		if (bac1 <= 0) {
			System.out.println(" Le bac 1 est vide ");
		} else if (bac2 <= 0){
			System.out.println(" Le bac 2 est vide ");
		} else if (bac3 <= 0){
			System.out.println(" Le bac 3 est vide ");
		} else if (bac4 <= 0){
			System.out.println(" Le bac 4 est vide ");
		}
		
		scan.close();
	}

}
