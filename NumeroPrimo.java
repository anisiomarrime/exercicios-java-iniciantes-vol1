import java.util.Scanner; // Importamos o nosso leitor
/**
 * @author Anísio Marrime
 * http://www.anisiomarrime.com
 * itans.marrime@gmail.com
 * 
 * Programa que recebe um número inteiro pelo teclado e mostra se o número é primo ou não
 *
 */
public class NumeroPrimo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in); // Inicializamos o nosso leitor
		
		System.out.println("Digite o número: "); // Vamos exibir uma mensagem para o usuário
		
		int numero = leitor.nextInt(); // Solicitamos o número 
		
		/* 
		## Primeiro ! quando é que se diz que um número é primo ????
		## Numero natural, maior que 1...bla..bla..bla.... não é ? resumindo é isso sim !!!
		## Mborrah determinar 
		*/
		
		int divisores = 0; // Variavel para armazenar o número de divisores
		
		for(int i = 1;i <= numero;i++) { // Vamos iterar no intervalo de 1 até o número recebido pelo teclado
			if((numero % i) == 0) { // Calculamos o mod do numero recebido com todos os numeros que estao no seu intervalo 
				divisores++; // Se o resultado do mod ou o resultado da divisao for 0 entao incrementamos os divisores
			}
		}
		
		if(divisores == 2) System.out.println( "O Número é PRIMO." ); // Se o número de divisores for 2 então 
		else System.out.println( "O Número não é PRIMO." ); // não é primo
		
		leitor.close(); // Fechamos o nosso leitor
		
	}

}
