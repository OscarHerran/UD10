package Ejer5;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

import javax.swing.JOptionPane;

import Ejer5.Password;

public class Control {
	public static void start() {
		Hashtable <Integer, String> passwords = new Hashtable <Integer, String>();
		ArrayList <String> forza = new ArrayList<String>();
		String ask = JOptionPane.showInputDialog("Desea crear contraseña").toLowerCase();
		Password pass;
		if(ask.equals("si")) {
			do {
				String longi = JOptionPane.showInputDialog("Indique longitud");
				int longitud = Integer.parseInt(longi);
				pass = new Password(longitud);
				creaDictionario(pass, passwords, forza);
				ask = JOptionPane.showInputDialog("Desea crear contraseña").toLowerCase();
			}while(ask.equals("si"));
			returnDictionary(passwords, forza);
		}else {
			JOptionPane.showMessageDialog(null, "Adeu");
		}
	}
	
	public static void creaDictionario(Password pass, Hashtable <Integer, String> passwords, ArrayList <String> forza) {
		pass.createPassword();
		
		passwords.put(pass.getLongitud(), pass.getPassword());
		
		if(pass.esFuerte()) {
			forza.add(pass.getPassword());
		}
		
		returnDictionary(passwords, forza);
	}
	
	public static void returnDictionary(Hashtable <Integer, String> passwords, ArrayList <String> forza) {
		
		Enumeration <String> letras = passwords.elements();
		Enumeration <Integer> longitud = passwords.keys();
		System.out.println("Las contraseñas almacenadas son : \n\n");
		while(longitud.hasMoreElements() && letras.hasMoreElements()) {
			System.out.println("Longitud : " + longitud.nextElement() + "\nPassword : " + letras.nextElement());
		}
		
		System.out.println("Las contraseñas FUERTES son : \n\n");
		for(String aux : forza) {
			System.out.println(aux);
		}
	}
}