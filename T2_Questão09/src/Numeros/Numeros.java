package Numeros;
import java.util.*;

public class Numeros {
	
	Scanner sc = new Scanner(System.in);
	
	//VARIÁVEIS
	public int tamanho, quantPares, quantImpares;
	public long controlador;
	public double soma = 0, somaPares = 0, media = 0, mediaPares = 0, porcent;
	public double[] numeros;
	
	//ENTRADA DE DADOS PARA O SISTEMA
	public void entrada() {
		System.out.println("Olá, quantos números você quer digitar?");
		tamanho = sc.nextInt();
		
		this.numeros = new double [tamanho];
		for(int i = 0; i<tamanho ; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = sc.nextDouble();
			soma += numeros[i];
		}
	}
	
	//VERIFICANDO SE O NÚMERO É PAR OU ÍMPAR
	public void paresEimpares() {
		for (int i = 0; i < tamanho; i++) {
			if ((numeros[i]%2) == 0) {
				somaPares += numeros[i];
				quantPares++; }
			else {
				quantImpares++; }
		}
	}
	
	//VERIFICANDO SE EXISTE NÚMEROS PARES E A MÉDIA DELES
	public void existPares() {
		if (quantPares != 0) {
			mediaPares = somaPares/quantPares;
			} else {
			System.out.println("\nNENHUM NÚMERO PAR FOI DIGITADO\n");
			}
	}
	
	//CALCULOS MAIS SIMPLES QUE FALTAVAM PARA AS QUESTÕES
	public void calculosRespostas() {
		media = soma/tamanho;
		Arrays.sort(numeros);
		porcent = quantImpares * 100 / tamanho;
	}
	
	//IMPRIMINDO AS RESPOSTAS PARA O USUÁRIO
	public void printRespostas() {
		System.out.println("                      RESPOSTAS DAS QUESTÕES                   ");
		System.out.println("A soma dos números digitados é: " + soma);
		System.out.println("Você digitou: " + tamanho + " números (eu sei que você já sabe isso, mas a questão pede)");
		System.out.println("O maior número que você digitou foi: " + numeros[tamanho-1]);
		System.out.println("O menor número que você digitou foi: " + numeros[0]);
		System.out.println("A média dos números pares é: " + mediaPares);
		System.out.println("Dos números que você digitou " + porcent + "% deles são ímpares");
	}
	
	//CONTROLADOR DE REPETIÇÕES PARA DO SISTEMA
	public void controladorUsuario() {
		System.out.println();
		System.out.println("Quer continuar no sistema? \n[0] Para reiniciar o sistema \n[30000] Para finalizar o sistema");
		controlador = sc.nextLong();
		
		if(controlador == 30000 ) {
			System.out.println("Obrigado por ultilizar esse sistema <3");
		} else if (controlador == 0) {
			
		} else {
			controladorUsuario();
		}
	}
}
