package Principal;
import Funcionario.salario.*;

public class Principal {
	static calcSalario func = new calcSalario();
	
	public static void main(String[] args) {
		func.menuUsuario();
		func.opcUsuario();
		func.veriError();
	}
}
