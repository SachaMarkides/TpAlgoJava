package imipoecjava2017;

import java.util.Scanner;

public class Tp6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choix;
		Scanner scan;
		
		do {
			System.out.println("La cuisson est :");
			System.out.println("1 bleu ");
			System.out.println("2 saignant");
			System.out.println("3 cuit");
			System.out.println("4 à point");
			System.out.println("5 brulé");
			scan = new Scanner(System.in);
			choix = scan.nextInt();
		} while (choix<1 || choix>5);
		
		switch (choix) {
			case 1:
				System.out.println("Le repas est bleu, laisse cuir");
				break;
			case 2:
				System.out.println("Le repas est saignant, laisse cuir");	
				break;
			case 3:
				System.out.println("Le repas est cuit, laisse cuir");
				break;
			case 4:
				System.out.println("Le repas est à point, tu es content");
				break;
			case 5:
				System.out.println("Le repas est brulé, tu es déçu");
				break;
		}
		
		scan.close();
	}

}
