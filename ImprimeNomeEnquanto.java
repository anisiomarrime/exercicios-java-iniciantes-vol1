import java.util.Scanner; // Importamos o nosso leitor
/**
 * @author An�sio Marrime
 * http://www.anisiomarrime.com
 * itans.marrime@gmail.com
 * 
 * Programa que recebe um nome e imprime repetindo consoante o n�mero de caracteres predominantes.
 *
 */
public class ImprimeNomeEnquanto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in); // Inicializamos o nosso leitor
		
		System.out.println("Digite o seu nome:"); // Mostramos uma mensagem ao usu�rio
		
		String nome = leitor.nextLine(); // Solicitamos o nome
		
		int numero_carateres = nome.length(); // Pegamos o n�mero de carateres do nome
		
		int vezes_impressas  = 1; // Numero de repeti��es
		
		while(vezes_impressas < numero_carateres) {
			
			System.out.println(nome);
			
			vezes_impressas ++; // Incrementamos uma unidade
		}
		
		System.out.println("Seu nome tem " + numero_carateres + " caracteres por isso foi impresso: " + vezes_impressas + " vezes.");
		
		leitor.close(); // Fechamos o nosso leitor
		
		// Para voc�: 
		// Fa�a com que n�o conte o espa�o cajo exista exemplo: Jo�o Carlos
		// Deve parecer que ele tem 10 carateres e n�o 11 :-)
		// Bom trabalho !
	}

}
