package Principal;
import Numeros.*;

public class Principal {
	static Numeros num = new Numeros();
	
	public static void main (String[] args) {
		do {
			num.entradaUsuario();
			num.veriErro();
			num.ePrimo();
			num.controladorUsuario();
		}while(num.controlador == 0);
	}
}
