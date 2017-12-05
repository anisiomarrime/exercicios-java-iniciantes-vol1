import java.util.Scanner; // Importamos o nosso leitor
/**
 * @author Anísio Marrime
 * http://www.anisiomarrime.com
 * itans.marrime@gmail.com
 * 
 * Programa que recebe 3 números inteiros e mostra como resultado o maior número. 
 *
 */
public class MaiorNumero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in); // Inicializamos o nosso leitor
		
		int n1, n2, n3, maior = 0;
		
		System.out.println("Digite o primeiro número: "); // Vamos exibir uma mensagem para o usuário
		
		n1 = leitor.nextInt(); // Solicitamos o primeiro número
		
		System.out.println("Digite o segundo número: "); // Vamos exibir uma mensagem para o usuário
		
		n2 = leitor.nextInt(); // Solicitamos o segundo número
		
		System.out.println("Digite o terceiro número: "); // Vamos exibir uma mensagem para o usuário
		
		n3 = leitor.nextInt(); // Solicitamos o terceiro número
		
		if(n1 > n2) { // Se n1 for maior que n2
			
			if(n1 > n3) maior = n1; // e n1 for maior que n3 então
			
			else if(n3 > n2) maior = n3; // ou n3 for maior que n2 e n1 então
			
		}else if(n2 > n3) {  // e n2 maior que n3 então
			
			maior = n2;
			
		}else maior = n3;  // ou n3 for maior que n2 e n1 então
		
		System.out.println("O maior número é: " + maior);
		
		leitor.close(); // Fechamos o nosso leitor
	}

}
