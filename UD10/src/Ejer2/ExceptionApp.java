package Ejer2;

import java.util.Scanner;


import CustomException.ExceptionClass;

public class ExceptionApp {

	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		System.out.println("indique numero");
		int num = ask.nextInt();

		try {	
			//LAS EXCEPCIONES CAPTURADAS CON TERNARIO SE LLAMAN DIRECTAMENTE DESDE EL THROW Y CONDICIONADO LA RESPUESTA 
			throw ((num % 2 == 0) ?  new ExceptionClass(1) : new ExceptionClass(2));
		} catch (ExceptionClass ex) {
			System.out.println(ex.getMessage());
		}
		
	}

}
