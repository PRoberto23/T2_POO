package Calculadora;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculadora {
	DecimalFormat df = new DecimalFormat("0.00");
	Scanner sc= new Scanner(System.in);
	
	//VARIÁVEIS
	public int numUsuario1, numUsuario2, opcaoUsuario, numUsuario3, controlador; 
	public float raizNumUsuario;
	  
	  //MENU DE OPÇÕES DO USUÁRIO
	  public void menuOpcoes() {
		 System.out.println("-------------------------------------------------");
		 System.out.println("CALCULADORA");
		 System.out.println("\t 1: Somar");
		 System.out.println("\t 2: Raiz ");
		 System.out.print("Digite a Operação:"); 
		 opcaoUsuario = sc.nextInt();
	  }
	  
	  //AQUI FICA O CÓDIGO DA OPÇÃO QUE O USUÁRIO ESCOLHEU
	  public void escolhaUsuario() {
		  switch(opcaoUsuario) {
		  case 1:
			  entradaUsuario();
			  System.out.println(numUsuario1 + " + " + numUsuario2 + " = " + (numUsuario1 + numUsuario2) );
			  break;
		  case 2:
			  System.out.println("Digite o número que você quer ver a raiz: ");
			  numUsuario3 = sc.nextInt();		  
			  raizNumUsuario = (float) Math.sqrt(numUsuario3);
			  System.out.print("A raiz de " + numUsuario3 + " é: " + df.format(raizNumUsuario));
			  break;
		  }
	  }
	  
	  //O USUÁRIO DIGITA OS NÚMEROS QUE QUER USAR
	  public void entradaUsuario() {
		  System.out.print("Digite um numero: "); 
		    numUsuario1 = sc.nextInt();
		    System.out.print("Digite outro numero: "); 
		    numUsuario2 = sc.nextInt();
	  }
	  
	//CONTROLADOR DE REPETIÇÕES DO SISTEMA
		public void controladorUsuario() {
			System.out.println("\nQuer continuar no programa? \n[0] Para reiniciar o programa \n[1] Para finalizar o programa ");
			controlador = sc.nextInt();
			
			if(controlador == 1) {
				System.out.println("\nObrigado por ultilizar esse programa <3");
			} else if (controlador == 0) {
				
			} else {
				controladorUsuario();
			}
		}
}
