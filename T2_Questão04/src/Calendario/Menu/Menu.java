package Calendario.Menu;
import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);
	public int menu;
	
	public void menuUsuario() {
		System.out.println("Olá, aqui você irá escolher se quer você mesmo digitar a data e hora, ou se posso pegar do seu computador e apresentar.");
		System.out.print("\n                         MENU");
		System.out.print("\n[0] Para digitar data e hora");
		System.out.print("\n[1] Para ver a do sistema");
		menu = sc.nextInt();
	}
	
	public void veriErro() {
		if(menu != 0 && menu != 1) {
			System.out.println("ERROR!!!");
			menuUsuario();
		}
	}
}
