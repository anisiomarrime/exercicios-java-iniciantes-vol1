import java.util.Scanner; // Importamos o nosso leitor
/**
 * @author Anísio Marrime
 * http://www.anisiomarrime.com
 * itans.marrime@gmail.com
 * 
 * Programa que receba dois números e ao final mostra a soma, subtração, multiplicação e a divisão dos números lidos
 * 
 */
public class CalculoLeitor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in); // Inicializamos o nosso leitor

		int n1, n2; // Declaramos as variáveis n1, n2

		System.out.println("Digite o primeiro número: "); // Vamos exibir uma mensagem para o usuário

		n1 = leitor.nextInt(); // Solicitamos o valor para a variável n1; *nextInt()* => solicitamos um número inteiro

		System.out.println("Digite o segundo número: "); // Vamos exibir uma mensagem para o usuário
															
		n2 = leitor.nextInt(); // Solicitamos o valor para a variável n2

		System.out.println(String.format("O resultado da soma é: %d", n1 + n2)); // Imprime o resultado da soma
		
		System.out.println(String.format("O resultado da subtração é: %d", n1 - n2)); // Imprime o resultado da subtração
		
		System.out.println(String.format("O resultado da multiplicação é: %d", n1 * n2)); // Imprime o resultado da multiplicação
		
		System.out.println(String.format("O resultado da divisão é: %d", n1 / n2)); // Imprime o resultado da divisão
		
		leitor.close(); // Fechamos o nosso leitor
	}

}
