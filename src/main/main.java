package main;

import java.util.Random;
import java.util.Scanner;

public class main {
/*Chiedere all'utente numeri interi e calcolarene la somma. Continuare a
 chiedere numeri, finche' la sommatoria non supera il valore `1000` */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int somma = 0;
		while(somma < 1000) {
			System.out.println("inserisci un intero");
			int val = scan.nextInt();
			somma += val;
			
		}
		System.out.println(somma);
		
		
/* Creare un array di 10 elementi randomici compresi tra 100 e 1000 e stampare:
 - tutti gli elementi pari
 - tutti gli elementi dispari
 - tutti gli elementi in indice pari
 - tutti gli elementi in indice dispari*/
		Random rand = new Random();
		 
		int[] random = new int[10];
		 for (int i = 0; i<10; i++) {
			 int  r = rand.nextInt(100, 1000);
			 random[i] = r;
			
			 if(random[i] % 2 == 0) {
				 System.out.println("Il numero " + random[i] + " è pari.");
				 
			 } else {
				 System.out.println("Il numero " + random[i] + " è dispari.");
			 } 
		 } for(int i = 0; i < random.length; i += 2) {
			 System.out.println("I numeri con indie pari sono " + random[i]);
		 } for(int i = 1; i < random.length; i += 2) {
			 System.out.println("I numeri con indice dispari sono " + random[i]);
		 }
		
	}
}
