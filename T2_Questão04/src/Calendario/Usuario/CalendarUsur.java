package Calendario.Usuario;
import java.util.Scanner;

public class CalendarUsur {
	public int hora, min, mes, ano, dia;
	Scanner sc = new Scanner(System.in);
	
	public void entradaUsuario() {
		System.out.print("\nDigite o dia: ");
		dia = sc.nextInt();
		System.out.print("\nDigite o mês: ");
		mes = sc.nextInt();
		System.out.print("\nDigite o ano: ");
		ano = sc.nextInt();
		System.out.print("\nDigite o hora: ");
		hora = sc.nextInt();
		System.out.print("\nDigite o minuto: ");
		min = sc.nextInt();	
	}
	
	public void veriErro() {
		if(dia > 31) {
			System.out.println("ERROR!!!");
			entradaUsuario();
		} else if(mes > 12) {
			System.out.println("ERROR!!!");
			entradaUsuario();
		} else if(hora > 24) {
			System.out.println("ERROR!!!");
			entradaUsuario();
		} else if(min > 59) {
			System.out.println("ERROR!!!");
			entradaUsuario();
		}
	}
	
	public void dataAtual() {
	    System.out.println("Data atual: " + dia + "/" + mes + "/" + ano);
	}
	
	public void mesAtual() {
		if (mes == 1){
	  	      System.out.println("\nO mes atual é Janeiro");
	  	    }
	  	    else if (mes == 2){
	  	      System.out.println("\nO mes atual é Fevereiro");
	  	    }
	  	    else if (mes == 3){
	  	      System.out.println("\nO mes atual é Março");
	  	    }
	  	    else if (mes == 4){
	  	      System.out.println("\nO mes atual é Abril");
	  	    }
	  	    else if (mes == 5){
	  	      System.out.println("\nO mes atual é Maio");
	  	    }
	  	    else if (mes == 6){
	  	      System.out.println("\nO mes atual é Junho");
	  	    }
	  	    else if (mes == 7){
	  	      System.out.println("\nO mes atual é Julho");
	  	    }
	  	    else if (mes == 8){
	  	      System.out.println("\nO mes atual é Agosto");
	  	    }
	  	    else if (mes == 9){
	  	      System.out.println("\n O mes atual é Setembro");
	  	    }
	  	    else if (mes == 10){
	  	      System.out.println("\nO mes atual é Outubro");
	  	    }
	  	    else if (mes == 11){
	  	      System.out.println("\nO mes atual é Novembro");
	  	    }
	  	    else {
	  	      System.out.println("\nO mes atual é Dezembro");
	  	    } 
	}
	
	public void horaApresentar() {
		 if (hora < 6){
	   	      System.out.println("\nHora atual: " + hora + ":" + min + " da Madrugada");
	   	    }
	   	    else if (hora < 12 && hora >= 6){
	   	      System.out.println("\nHora atual: " + hora + ":" + min + " da Manhã");
	   	    }
	   	    else if (hora >= 12 && hora < 18){
	   	      System.out.println("\nHora atual: " + hora + ":" + min + " da Tarde");
	   	    }
	   	    else if (hora >= 18){
	   	      System.out.println("\nHora atual: " + hora + ":" + min + " da Noite");
	   	    }	
	}
}
