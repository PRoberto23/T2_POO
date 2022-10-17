package Numeros;
import java.util.Scanner;

public class Numeros {
	public int entUsur, controlador, i;
	public boolean primo;
	
	Scanner sc = new Scanner(System.in);
	
	//ENTRADA DADOS DO USUARIO
	public void entradaUsuario() {
		System.out.print("Digite um número maior que 1: ");
		entUsur = sc.nextInt();
	}
	
	//VERIFICAR SE TEM ERRO
	public void veriErro() {
		if(entUsur == 1) {
			System.out.println("ERROR!!!");
			entradaUsuario();
		}
	}
	
	//VERIFICAR SE É PRIMO OU NÃO
	public void ePrimo() {
		for( i = 0; i < entUsur ; i++) {
			if(entUsur%1 == 0) {
				primo = false;
			}
		}
		if(primo) {
			System.out.println("O número " + entUsur + " é primo");
		}else {
			System.out.println("O número" + entUsur + "não é primo");
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
