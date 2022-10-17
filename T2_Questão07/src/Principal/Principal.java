package Principal;
import Jogadores.*;
public class Principal {
	public static void main (String[] args) {
		Jogadores jogadores = new Jogadores();
		
		do {
			jogadores.entradaDados();
			jogadores.calculos();
			jogadores.printResposta();
			jogadores.controladorUsuario();
			
		}while(jogadores.controlador == 0);
		
	}
}
