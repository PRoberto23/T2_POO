package Principal;
import Fatorial.*;

public class Principal {
	public static void main(String[] args) {
		Fatorial fat = new Fatorial();
		
		do {
			fat.entradaUsuario();
			fat.fatorial();
			fat.controladorUsuario();
		}while(fat.controlador == 0);
	}
}
