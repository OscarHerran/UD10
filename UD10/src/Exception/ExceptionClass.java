package Exception;

public class ExceptionClass extends Exception {
	private int codiException;
	
	public ExceptionClass(int code) {
		super();
		this.codiException = code;
	}
	
	public ExceptionClass() {
	}
	
	public String getMessage() {
		
		String message = " ";
		
		switch (codiException) {
			case 1:
				message = "Excepcion capturada con mensaje: Es UN NÚMERO PAR . \nPrograma terminado";
			break;
			case 2:
				message = "ES UN NUMERO IMPAR";
			break;
		}
		
		return message;
	}
}