package Main;
import Numero.*;

public class Main {
	static Numero pctnum = new Numero();
	
	public static void main (String[] args) {
		do {
			pctnum.entradaUsuario();
			pctnum.parOUimpar();
			pctnum.controladorUsuario();
		}while(pctnum.controlador == 0);
	}
}
