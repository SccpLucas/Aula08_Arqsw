package Exercicio7_1;
/**
 * 
 * @author Lucas Ribeiro Rios - RA:816114323 - Turma:SIN3AN-MCA
 * 			
 *
 */
public class ManipuladorDuplicar extends ManipuladorAbstrato {
	protected String transformarString(String string) {
		return string + " " + string;
	}
}
