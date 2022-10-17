package Jogadores;
import java.util.Scanner;


public class Jogadores {
	Scanner sc = new Scanner(System.in);
	
	//VARIÁVEIS
	public int idade, controlador;
	public double altura, peso, porcent80;
	public double quantMenores = 0, medIdade = 0, medAltura = 0, peso80 = 0;
	
	//ENTRADA DE DADOS PARA O SISTEMA
	public void entradaDados() {
		for (int quantTimes = 0 ; quantTimes < 5 ;quantTimes++) {
		
			for (int i = 0 ; i < 11 ; i++) {
				System.out.print("\nDigite sua idade: ");
				idade = sc.nextInt();
				System.out.print("Digite sua altura: ");
				altura = sc.nextDouble();
				System.out.print("Digite seu peso: ");
				peso = sc.nextDouble();
				
				if(idade < 18) {
					quantMenores++;
					}
				
				medIdade += idade;
				medAltura +=altura;
				
				if(peso > 80) {
					peso80++;
				}
			}
				medIdade = medIdade/11;
				medIdade = (double) (Math.round(medIdade*1000.0)/1000.0);
				System.out.println("A média das idades dos jogadores de cada time " + medIdade);
			
		}
	}
	
	//CALCULOS SIMPLES PARA APRESENTAR O RESULTADO AO USUÁRIO
	public void calculos() {
		medAltura = medAltura/55;
		medAltura = (double) (Math.round(medAltura*1000.0)/1000.0);
		porcent80 = peso80 * (100/55);
		porcent80 = (double) (Math.round(porcent80*1000.0)/1000.0);
	}
	
	//PRINTANDO AS RESPOSTA AO USUÁRIO
	public void printResposta() {
		System.out.println("São " + quantMenores + " jogadores menores de 18 anos");
		System.out.println("A média da altura de todos os jogadores do campeonato é de: " + medAltura);
		System.out.println("A porcentagem de jogadores com mais de 80kg entre todos dom campeonato é de: " + porcent80);
	}
	
	//CONTROLADOR DE REPETIÇÕES DO SISTEMA 
	public void controladorUsuario() {
		System.out.println("\nQuer continuar no sistema? \n[0] Para reiniciar o sistema \n[1] Para finalizar o sistema");
		controlador = sc.nextInt();
		
		if(controlador == 1) {
			System.out.println("\nObrigado por ultilizar esse sistema <3");
		} else if (controlador == 0) {
			
		} else {
			controladorUsuario();
		}
	}
}
