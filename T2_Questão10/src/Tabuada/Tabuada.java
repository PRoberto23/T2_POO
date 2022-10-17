package Tabuada;
import java.util.Scanner;

public class Tabuada {
	Scanner sc = new Scanner(System.in);
	public int controlador;
	
	//TABUADA DE MULTIPLICAÇÃO
	public void tabuadaMulti() {
		System.out.println("Tabuada de multiplicação");
		System.out.print("  ");
		for (int i = 1; i <= 10; i++){ 
			System.out.println("\nTabuada do número "+i);  
			
			for (int n = 1; n <= 10; n++){
			System.out.print(i+" x "+n+" = " +i*n);
			System.out.println("                             ");
			
			}
		}
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
