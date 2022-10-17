package main;
import Calendario.Sistema.*;
import Calendario.Usuario.*;
import Calendario.Menu.*;

public class Main {
	static CalendarSis calenSis = new CalendarSis();
	static CalendarUsur calenUsur = new CalendarUsur();
	static Menu menu = new Menu();
	
	public static void main(String[] args) {
		
		menu.menuUsuario();
		if(menu.menu == 1) {
			calenSis.dataAtual();
			calenSis.mesAtual();
			calenSis.horaApresentar();
		} else {
			calenUsur.entradaUsuario();
			calenUsur.veriErro();
			calenUsur.dataAtual();
			calenUsur.mesAtual();
			calenUsur.horaApresentar();
		}
	}
}
