package Numero;

import javax.swing.JOptionPane;

public class Numero {
		//VARIÁVEIS
		public int num, a, controlador;
		
		//RECEBE O NÚMERO DO USUÁRIO
		public void entradaUsuario() {
			JOptionPane.showInputDialog("Bem vindo ao progama onde você vai descobrir se o numero é par ou impar: ");
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite o Numero que será usado: "));
			}
		
		//VERIFICAÇÃO SE O NÚMERO É PAR OU ÍMPAR
		public void parOUimpar() {
			if (num % 2 == 0) {
	        	JOptionPane.showMessageDialog(null, "O numero " + num + " é Par");
	        } else {
	        	JOptionPane.showMessageDialog(null, "O numero " + num + "  é Ímpar");
	        }
		}
		
		//CONTROLADOR DE REPETIÇÕES DO SISTEMA
		public void controladorUsuario() {
			controlador = Integer.parseInt(JOptionPane.showInputDialog("\nQuer continuar no sistema? \n[0] Para reiniciar o programa \n[1] Para finalizar o programa "));
			
			if(controlador == 1) {
				System.out.println("\nObrigado por ultilizar esse sistema <3");
			} else if (controlador == 0) {
				
			} else {
				controladorUsuario();
			}
		}
}
