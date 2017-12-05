import java.util.Scanner; // Importamos o nosso leitor
/**
 * @author An�sio Marrime
 * http://www.anisiomarrime.com
 * itans.marrime@gmail.com
 * 
 * Programa que receba dois n�meros e ao final mostra a soma, subtra��o, multiplica��o e a divis�o dos n�meros lidos
 * 
 */
public class CalculoLeitor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in); // Inicializamos o nosso leitor

		int n1, n2; // Declaramos as vari�veis n1, n2

		System.out.println("Digite o primeiro n�mero: "); // Vamos exibir uma mensagem para o usu�rio

		n1 = leitor.nextInt(); // Solicitamos o valor para a vari�vel n1; *nextInt()* => solicitamos um n�mero inteiro

		System.out.println("Digite o segundo n�mero: "); // Vamos exibir uma mensagem para o usu�rio
															
		n2 = leitor.nextInt(); // Solicitamos o valor para a vari�vel n2

		System.out.println(String.format("O resultado da soma �: %d", n1 + n2)); // Imprime o resultado da soma
		
		System.out.println(String.format("O resultado da subtra��o �: %d", n1 - n2)); // Imprime o resultado da subtra��o
		
		System.out.println(String.format("O resultado da multiplica��o �: %d", n1 * n2)); // Imprime o resultado da multiplica��o
		
		System.out.println(String.format("O resultado da divis�o �: %d", n1 / n2)); // Imprime o resultado da divis�o
		
		leitor.close(); // Fechamos o nosso leitor
	}

}
