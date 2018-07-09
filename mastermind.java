package Mastermind;

import java.util.Random;
import java.util.Scanner; 

class mastermind {
	
	public static void main(String[] args) {
		System.out.println("Welkom! Het is aan jou om binnen 12 beurten de geheime code te kraken.");
		System.out.println("De code bestaat uit 4 getallen tussen de 1 en de 6. Succes!");
		
		
		//Generate four random numbers between 1 and 6
		//Je kan niet random een getal tussen 1111 en 6666 generen, want 789 doen niet mee.
		Random rand = new Random();
		int getal1 = rand.nextInt(6)+1;
		int getal2 = rand.nextInt(6)+1;
		int getal3 = rand.nextInt(6)+1;
		int getal4 = rand.nextInt(6)+1;
		
		//int mastermindcode[] = new int[] {rand.nextInt(6) + 1, rand.nextInt(6) + 1, rand.nextInt(6) + 1, rand.nextInt(6) + 1};
		//Dit moet eleganter kunnen
//		System.out.print(getal1);
//		System.out.print(getal2);
//		System.out.print(getal3);
//		System.out.println(getal4);
	
		int getallengoed = 0;
		int hoeveelkeer = 12;
		
		while (getallengoed < 4 && hoeveelkeer > 0) {

			hoeveelkeer--;
			
			//Ask for system input
			System.out.println("Welke code wil je proberen?");
			Scanner scanner = new Scanner(System.in);
			String gegevenAntwoord = scanner.nextLine();
			//System.out.println(gegevenAntwoord);
			
			//Wat hier aan de hand is: om een char met een nummerieke waarde naar een int te transformeren, trek je van char 4 char 0 af, waardoor je eigenlijk de ascII-code van 0 van die 4 aftrekt en op het juiste int.-getal uitkomt 
			int antwoord1 = gegevenAntwoord.charAt(0) - '0';
			int antwoord2 = gegevenAntwoord.charAt(1) - '0';
			int antwoord3 = gegevenAntwoord.charAt(2) - '0';
			int antwoord4 = gegevenAntwoord.charAt(3) - '0';

			System.out.print(antwoord1);
			System.out.print(antwoord2);
			System.out.print(antwoord3);
			System.out.println(antwoord4);
			
	//Dit controleert of het getal klopt en op de juiste plek staat		
			int eengetalgoed = 0;
				if(getal1 == antwoord1) {
				eengetalgoed = 1;
				}
			int tweedegetalgoed = 0;
				if(getal2 == antwoord2) {
				tweedegetalgoed = 1;
				}
			int derdegetalgoed = 0; 
				if (getal3 == antwoord3) {
				derdegetalgoed = 1;
				}
			int vierdegetalgoed = 0;
				if(getal4 == antwoord4) {
				vierdegetalgoed = 1;
				}
	//Dit telt hoeveel je er al goed hebt		
			getallengoed = eengetalgoed + tweedegetalgoed + derdegetalgoed + vierdegetalgoed;
	//Dit controleert of de juiste getallen hebt bij degenen die niet op de juiste plek staan		
			
			
			int eengetalbijnagoed = 0;
				if(getal1 == antwoord1 || getal1 == antwoord2 || getal1 == antwoord3 || getal1 == antwoord4) {
				eengetalbijnagoed = 1;				
				}
				
			int tweedegetalbijnagoed = 0;
				if(getal2 == antwoord1 || getal2 == antwoord2 || getal2 == antwoord3 || getal2 == antwoord4) {
				tweedegetalbijnagoed = 1;				
				}	
				
			int derdegetalbijnagoed = 0;
				if(getal3 == antwoord1 || getal3 == antwoord2 || getal3 == antwoord3 || getal3 == antwoord4) {
				derdegetalbijnagoed = 1;				
				}
				
			int vierdegetalbijnagoed = 0;
				if(getal4 == antwoord1 || getal4 == antwoord2 || getal4 == antwoord3 || getal4 == antwoord4) {
				vierdegetalbijnagoed = 1;				
				}	
				
			int getallenbijnagoed = eengetalbijnagoed + tweedegetalbijnagoed + derdegetalbijnagoed + vierdegetalbijnagoed;
			
			getallenbijnagoed = getallenbijnagoed - getallengoed;
	

			System.out.println("Je hebt er " + getallengoed + " op de juiste plek gezet en je hebt er " + getallenbijnagoed + " die je nog niet op de juiste plek heb gezet, maar die de juiste waarde hebben.");
			if(getallengoed < 4) {
				System.out.print("Je mag nog " + hoeveelkeer + " keer raden... ");
				}
		
			if(hoeveelkeer <= 0) {
				System.out.println("Helaas! Je hebt verloren.");
				}
		
			if(getallengoed == 4) {
				System.out.print(" Gefeliciteerd, je hebt gewonnen!");
				}
		}
	}
}