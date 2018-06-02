package Exercicio4_2;

/**
 * 
 * @author Lucas Ribeiro Rios - RA:816114323 - Turma:SIN3AN-MCA
 * 			
 *
 */
public class Main {
	
	public static void main(String[] args) {
		// Cria o cliente com o adaptador.
		Cliente cliente = new Cliente(new SomadorAdapter());
		cliente.executar();
	}
}
