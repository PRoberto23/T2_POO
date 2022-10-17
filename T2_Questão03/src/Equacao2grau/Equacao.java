package Equacao2grau;
import java.util.Scanner;

public class Equacao {
	Scanner sc = new Scanner(System.in);
	
	//VARIÁVEIS
	public int controlador;
	public double a, b, c, delta, x1, x2;
	public double respostax1, respostax2;
	
	//TEXTO PARA PRIMEIRA EXECUÇÃO
	public void mensagemInicial() {
		System.out.println("Olá, irei lhe ajudar a calcular uma equação do segundo grau.");
		System.out.println("Lembre-se, uma equação do segundo grau é qualquer equação escrita"
				+ " no seguinte modelo: \nA(X^2) + B(X) + C = 0."
				+ "\nA tem que ser diferente de 0");
	}
	
	//ENTRADA DE DADOS PARA O SISTEMA
	public void entrada() {
		System.out.print("\nDigite o valor de A: ");
		a = sc.nextDouble();
		System.out.print("Digite o valor de B: ");
		b = sc.nextDouble();
		System.out.print("Digite o valor de C: ");
		c = sc.nextDouble();
	}
	
	//CÁLCULO DE DELTA E DA FÓRMULA DE BÁSKARA
	public void baskara() {
		delta = Math.pow(b,2)- (4 * a) * c;
		if(a != 0) {
			x1 = (-b + Math.sqrt(delta)) / (2*a);
			x2 = (-b - Math.sqrt(delta)) / (2*a);
			
			respostax1 = (double) (Math.round(x1*1000.0)/1000.0);
			respostax2 = (double) (Math.round(x2*1000.0)/1000.0);
			
			if (delta == 0) {
				System.out.println("\nA equação possui apenas uma solução real, que é: " + respostax1);
			} else if (delta > 0) {
				System.out.println("A equação tem duas raízes " +respostax1 + " e " + respostax2);
			} else {
				System.out.println("\nDELTA MENOR QUE ZERO, A EQUAÇÃO NÃO POSSUI RAIZ NOS REAIS \n");
			}
		} else {
			System.out.println("\nA NÃO PODE SER IGUAL A ZERO!\n");
			entrada();
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
