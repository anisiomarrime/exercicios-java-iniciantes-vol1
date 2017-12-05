import java.util.Scanner; // Importamos o nosso leitor
/**
 * @author An�sio Marrime
 * http://www.anisiomarrime.com
 * itans.marrime@gmail.com
 * 
 * Programa que recebe 3 n�meros inteiros e mostra como resultado o maior n�mero. 
 *
 */
public class MaiorNumero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in); // Inicializamos o nosso leitor
		
		int n1, n2, n3, maior = 0;
		
		System.out.println("Digite o primeiro n�mero: "); // Vamos exibir uma mensagem para o usu�rio
		
		n1 = leitor.nextInt(); // Solicitamos o primeiro n�mero
		
		System.out.println("Digite o segundo n�mero: "); // Vamos exibir uma mensagem para o usu�rio
		
		n2 = leitor.nextInt(); // Solicitamos o segundo n�mero
		
		System.out.println("Digite o terceiro n�mero: "); // Vamos exibir uma mensagem para o usu�rio
		
		n3 = leitor.nextInt(); // Solicitamos o terceiro n�mero
		
		if(n1 > n2) { // Se n1 for maior que n2
			
			if(n1 > n3) maior = n1; // e n1 for maior que n3 ent�o
			
			else if(n3 > n2) maior = n3; // ou n3 for maior que n2 e n1 ent�o
			
		}else if(n2 > n3) {  // e n2 maior que n3 ent�o
			
			maior = n2;
			
		}else maior = n3;  // ou n3 for maior que n2 e n1 ent�o
		
		System.out.println("O maior n�mero �: " + maior);
		
		leitor.close(); // Fechamos o nosso leitor
	}

}
