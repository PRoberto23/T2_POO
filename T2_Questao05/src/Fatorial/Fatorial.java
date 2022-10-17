package Fatorial;
import java.util.Scanner;

public class Fatorial {
	Scanner sc = new Scanner(System.in);
	
	//VARIÁVEIS
	public int n, num, i, j, controlador;
	public double fatorial;
	
	//RECEBE DO USUÁRIO QUANTOS NÚMEROS ELE QUER VER O FATORIAL	
	public void entradaUsuario() {
		System.out.print("Digite quantos números serão lidos: ");
		n = sc.nextInt();
	}
	
	//RECEBE UM NÚMERO E CALCULA O FATORIAL
	public void fatorial() {
		for(i = 1; i <= n; i++) {
			System.out.println("Digite o número que você quer ver o fatorial: ");
			num = sc.nextInt();
			fatorial = 1;
			for(j = 1; j <= num; j++) {
				fatorial = fatorial * j;
			}
			System.out.println("O fatorial de " + num + " é " + fatorial + "!\n");
		}
	}
	
	//CONTROLADOR DE REPETIÇÕES DO SISTEMA
		public void controladorUsuario() {
			System.out.println("\nQuer continuar no sistema? \n[0] Para reiniciar o sistema \n[1] Para finalizar o sistema ");
			controlador = sc.nextInt();
			
			if(controlador == 1) {
				System.out.println("\nObrigado por ultilizar esse sistema <3");
			} else if (controlador == 0) {
				
			} else {
				controladorUsuario();
			}
		}
}
