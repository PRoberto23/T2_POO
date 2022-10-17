package Funcionario.salario;

import java.util.Scanner;

public class calcSalario {
	public int aumento, controlador;
	public float salario, imposto, novSalario;
	Scanner sc = new Scanner(System.in);
	
	
	public void menuUsuario() {
		System.out.println("                  MENU DE OPÇÕES");
		System.out.println("\n1 - Imposto \n2 - Novo salário \n3 - Classificação \n4 - Finalizar o programa");
		controlador = sc.nextInt();
	}
	
	
	public void opcUsuario() {
		if(controlador == 1) {
    		System.out.println("Digite seu salário: ");
    		salario = sc.nextFloat();
    		  if(salario < 500) {
    			  imposto = salario * 5/100;
    		  }
    		  else if(salario >= 500 && salario <= 850 ) {
    		 	  imposto = salario * 10/100;
    		  }
    		  else if(salario > 850) {
    			  imposto = salario * 15/100;
    		  }
    		System.out.println("O valor do imposto é " + imposto);
    	}
		else if(controlador == 2) {
    		System.out.println("Insira o valor do salário: ");
    		salario = sc.nextFloat();
    		  if(salario > 1500) {
    			  aumento = 15;
    		  }
    		  else if(salario >= 750 && salario <= 1500) {
    			  aumento = 50;
    		  }
    		  else if(salario >= 450 && salario <= 750) {
    			  aumento = 75;
    		  }
    		  else if(salario < 400) {
    			  aumento = 100;
    		  }
    		  novSalario = salario + aumento;
    		  System.out.println("Seu novo salário é  " + novSalario);
    	}
		else if(controlador == 3) {
    		System.out.println("Digite o valor do seu salário ");
    		salario = sc.nextFloat();
    		  if(salario <= 700) {
    			  System.out.println("Você é mal pago!");
    		  }
    		  else {
    			  System.out.println("Você é bem pago!");
    		  }
		}
		else if(controlador == 4) {
    		System.out.println("Fim do programa");
    	}
		else {
			veriError();
		}
	}


	public void veriError() {
		System.out.println("ERROR!!!");
		menuUsuario();
	}
}
