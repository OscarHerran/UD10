package Ejer5;

public class ExceptionPas extends Exception {

	private int exceptionCode;
	
	public ExceptionPas(int code) {
		super();
		this.exceptionCode = code;
	}
	
	public ExceptionPas() {}
	
	public String getMessage() {
		String message = " ";
		switch(exceptionCode) {
			case 1:
				message = "La longitud mínima es de 8 carácteres";
				break;
			case 2:
				message = "lA LONGITUD NO PUEDE SUPERAR MÁS DE 30 CARACTERES";
				break;
		}
		return message;
	}
	
}