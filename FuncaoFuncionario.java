import java.util.Scanner; // Importamos o nosso leitor
/**
 * @author Anísio Marrime
 * http://www.anisiomarrime.com
 * itans.marrime@gmail.com
 * 
 * Programa que indique o nome da função exercida por um 
 * funcionário, cujo código é informado pelo usuário (10 - Técnico, 15 - Analista, 20- Supervisor, 25 - Gerente)
 * Caso o código não esteja entre estes, deverá ser informado ao usuário: Código não corresponde a uma função válida
 *
 */
public class FuncaoFuncionario {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in); // Inicializamos o nosso leitor
		
		String funcao = ""; // Armazenamos a saída da função 
		
		System.out.println("Qual é código da sua função???"); // Vamos exibir uma mensagem para o usuário
		
		int codigo = leitor.nextInt(); // Armazenamos o código do funcionario
		
		switch (codigo) { // Vamos verificar a função
			case 10: funcao = "Técnico"; break; // Técnico caso seja 10
			
			case 15: funcao = "Analista"; break; // Analista caso seja 15
			
			case 20: funcao = "Supervisor"; break; // Supervisor caso seja 20
			
			case 25: funcao = "Gerente"; break; // Gerente caso seja 25 o
			
			default: funcao = "Código não corresponde a uma função válida"; break; // caso não esteja entre os esperados
		}
		
		System.out.println(funcao); // Imprime a função
		
		leitor.close(); // Fechamos o nosso leitor
	}

}
