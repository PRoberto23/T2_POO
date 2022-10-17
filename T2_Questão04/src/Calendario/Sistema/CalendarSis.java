package Calendario.Sistema;
import java.util.Calendar;
import java.util.Date;

public class CalendarSis {
	public int dia,hora,ano,mes,min;
	Calendar cal = Calendar.getInstance();
    Date d = new Date();
	
    public void dataAtual() {
    	dia = cal.get(Calendar.DAY_OF_MONTH);
	    mes = cal.get(Calendar.MONTH) + 1;
	    ano = cal.get(Calendar.YEAR);
	    
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
  	    else if (mes == 12){
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
