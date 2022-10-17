package Principal;
import Tabuada.*;

public class Principal {
	static Tabuada tabu = new Tabuada();
	public static void main(String[] args) {
		do {
			tabu.tabuadaMulti();
			tabu.controladorUsuario();
		}while(tabu.controlador == 0);
	}
}
