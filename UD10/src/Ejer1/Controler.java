package Ejer1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Controler {
	public static void start() {
		Scanner ask = new Scanner(System.in);
		System.out.println("Desea continuar? \n1.- para sí \n2.- Para salir");
		int respuesta = ask.nextInt();
		if(respuesta != 2) {
			init();
		} else {
			System.out.println("HASTA PRONTO");
		}
			
	}
	
	public static void init() {
		Scanner ask = new Scanner(System.in);
		System.out.println("Pruebe su suerte, adivine numero");
		try {
			int number = ask.nextInt();
			Number numero = new Number(number);
			numero.setRandomNumber();
			numero.randomVerified();
			do {
				System.out.println("Pruebe su suerte, adivine numero");
				try {
					number = ask.nextInt();
					numero.setNumber(number);
					numero.randomVerified();
					numero.printVerification();
				}catch(InputMismatchException e) {
					System.out.println(e.getMessage());
					break;	
				}
			}while(numero.isNotNull());
		}catch(InputMismatchException e) {
			System.out.println(e.getMessage());
	}
	}		
}
