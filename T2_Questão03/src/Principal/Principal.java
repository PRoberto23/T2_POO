package Principal;
import Equacao2grau.*;

public class Principal {

	public static void main(String[] args) {
		Equacao equa = new Equacao();
		
		//MENSAGEM INICIAL SERÁ APRESENTADA APENAS NA PRIMEIRA VEZ EXECUTADA
		equa.mensagemInicial();
		
		//CÓDIGO A SER EXECUTADO A CADA REPETIÇÃO
		do {
			equa.entrada();
			equa.baskara();
			equa.controladorUsuario();
		}while(equa.controlador == 0);
	}

}
