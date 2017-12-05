import java.util.Scanner; // Importamos o nosso leitor
/**
 * @author An�sio Marrime
 * http://www.anisiomarrime.com
 * itans.marrime@gmail.com
 * 
 * Programa que recebe um n�mero inteiro pelo teclado e mostra se o n�mero � primo ou n�o
 *
 */
public class NumeroPrimo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in); // Inicializamos o nosso leitor
		
		System.out.println("Digite o n�mero: "); // Vamos exibir uma mensagem para o usu�rio
		
		int numero = leitor.nextInt(); // Solicitamos o n�mero 
		
		/* 
		## Primeiro ! quando � que se diz que um n�mero � primo ????
		## Numero natural, maior que 1...bla..bla..bla.... n�o � ? resumindo � isso sim !!!
		## Mborrah determinar 
		*/
		
		int divisores = 0; // Variavel para armazenar o n�mero de divisores
		
		for(int i = 1;i <= numero;i++) { // Vamos iterar no intervalo de 1 at� o n�mero recebido pelo teclado
			if((numero % i) == 0) { // Calculamos o mod do numero recebido com todos os numeros que estao no seu intervalo 
				divisores++; // Se o resultado do mod ou o resultado da divisao for 0 entao incrementamos os divisores
			}
		}
		
		if(divisores == 2) System.out.println( "O N�mero � PRIMO." ); // Se o n�mero de divisores for 2 ent�o 
		else System.out.println( "O N�mero n�o � PRIMO." ); // n�o � primo
		
		leitor.close(); // Fechamos o nosso leitor
		
	}

}
