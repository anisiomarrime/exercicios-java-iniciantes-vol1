import java.util.Scanner; // Importamos o nosso leitor
/**
 * @author An�sio Marrime
 * http://www.anisiomarrime.com
 * itans.marrime@gmail.com
 * 
 * Programa que indique o nome da fun��o exercida por um 
 * funcion�rio, cujo c�digo � informado pelo usu�rio (10 - T�cnico, 15 - Analista, 20- Supervisor, 25 - Gerente)
 * Caso o c�digo n�o esteja entre estes, dever� ser informado ao usu�rio: C�digo n�o corresponde a uma fun��o v�lida
 *
 */
public class FuncaoFuncionario {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in); // Inicializamos o nosso leitor
		
		String funcao = ""; // Armazenamos a sa�da da fun��o 
		
		System.out.println("Qual � c�digo da sua fun��o???"); // Vamos exibir uma mensagem para o usu�rio
		
		int codigo = leitor.nextInt(); // Armazenamos o c�digo do funcionario
		
		switch (codigo) { // Vamos verificar a fun��o
			case 10: funcao = "T�cnico"; break; // T�cnico caso seja 10
			
			case 15: funcao = "Analista"; break; // Analista caso seja 15
			
			case 20: funcao = "Supervisor"; break; // Supervisor caso seja 20
			
			case 25: funcao = "Gerente"; break; // Gerente caso seja 25 o
			
			default: funcao = "C�digo n�o corresponde a uma fun��o v�lida"; break; // caso n�o esteja entre os esperados
		}
		
		System.out.println(funcao); // Imprime a fun��o
		
		leitor.close(); // Fechamos o nosso leitor
	}

}
