package Ejer5;

import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Pattern;

import Ejer5.ExceptionPas;

public class Password {
	private String password;
	private int longitud;
	private final String NUM_MAYUS_MINUS = "abcdefghijklmnñopqrstvwxyzABCDEFGHIJKLMNÑOPQRSTVWXYZ1234567890¬!@#$%&/()=?¡*-+.,{}";
	// DEFECTO
	public Password() {
		this.password = "";
		this.longitud = 8;
	}
	
	// CONSTRUCTOR QUE ACTUALIZA LA LONGITUD E INSERTO DENTRO DE UN TRY CATCH
		public Password(int longi) {
			try {
				if(longi < 8) {
					throw new ExceptionPas(1);
				} else if(longi > 30) {
					throw new ExceptionPas(2);
				} else {
					this.longitud = longi;
				}
			}catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
		
	
	public void createPassword() {
		char [] aux = new char[this.longitud];//ARRAY DE CHARS QUE ALMACENARAN LOS VALORES A ITERAR RANDOM
		Random rand = new Random(); // INSTANCIAMOS LA CLASE RANDOM PARA OBTENER VALORES ALEATORIOS EN CADA ITERACION
		for(int i = 0; i < this.longitud; i++) {
			
			aux[i] = NUM_MAYUS_MINUS.charAt(rand.nextInt(NUM_MAYUS_MINUS.length()));// RETORNA UN NÚMERO RANDOM DENTRO DE LA LONGITUD DEL STRING, CON EL CHAR AT RETORNA LA LETRA ESPECÍFICA DE ESE RANDOM Y CON EL CHAR ARRAY VA ALMACENANDO LOS MÚLTIPLES CARACTERES PARA RETORNAR EL STRING
			}
		this.password = new String(aux);// RETORNA EL ARRAY DE CHARS QUE ALMACENÓ TODOS LOS VALORES RANDOM Y LOS CONVIERTE EN UN STRING INSTANCIANDO LA CLASE
	}
	
	//MÉTODO GETPASSWORD
	public String getPassword() {
		return password;
	}
//GETTERS Y DETTERS DE LONGITUD
	public int getLongitud() {
		return longitud;
	}
	
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
	public boolean esFuerte() {
		String regexVerified = "[A-Z]{2}[a-z]{1}\\d{5}";//MAYUSCULAS =2 O MÁS, MINÚSCULAS = 1 O MÁS, DÍGITOS = 5 O MÁS
		if(this.password.matches(regexVerified)) {
			return true;
		} 
		return false;
	}
	
}