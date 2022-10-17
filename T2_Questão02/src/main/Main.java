package main;
import Calculadora.*;

public class Main {
	static Calculadora calc = new Calculadora();
	public static void main(String[] args) {
		do {
			calc.menuOpcoes();
			calc.escolhaUsuario();
			calc.controladorUsuario();
		}while(calc.controlador == 0);
	}

}
