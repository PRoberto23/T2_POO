package Principal;
import Numeros.*;
public class Principal {

	public static void main(String[] args) {		
		Numeros numeros = new Numeros();
		
		do {
		numeros.entrada();
		numeros.paresEimpares();
		numeros.existPares();
		numeros.calculosRespostas();
		numeros.printRespostas();
		numeros.controladorUsuario();	
		}while(numeros.controlador == 0);

	}

}
