package Ejer1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Number {
	private int number;
	private final int MINIMO = 1;
	private final int MAXIMO = 500;
	private int randomNumber;
	private int counterIntents;
	
	// CONSTRUCTOR POR DEFECTO
	public Number() {
		number = 0;
		randomNumber = 0;
		counterIntents = 0;
	}
	
	public Number(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
			this.number = number;
		}

	// GENERA EL NÚMERO ALEATORIO
	public void setRandomNumber() {
		this.randomNumber = (int) (Math.random() * (MAXIMO - MINIMO));
		System.out.println(this.randomNumber);
	}
	
	//VERIFICA SI COINCIDE EL NÚMERO CON EL RANDOM
	public void randomVerified() {
		if(this.number == this.randomNumber) {
			System.out.println("Has acertado");
		} else {
			this.counterIntents ++;
			System.out.println(this.counterIntents);
			if(this.number > this.randomNumber) {
				System.out.println("El número a hallar es menor al que indicas");
			} else {
				System.out.println("El número a hallar es mayor al que indicas");
			}
		}
	}
	
	public boolean isNotNull() {
		if(this.number != this.randomNumber) {
			return true;
		}
		return false;
	}

	public void printVerification() {
		if(!isNotNull()) {
			System.out.println("El número de intentos ha sido igual a " + this.counterIntents);
		}
	}
}
