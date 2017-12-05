import java.util.Scanner; // Importamos o nosso leitor
/**
 * @author An�sio Marrime
 * http://www.anisiomarrime.com
 * itans.marrime@gmail.com
 *
 * Programa que recebe duas notas e calcula a m�dia e apresenta como resultado o nome do estudante, a m�dia e 
 * a situa��o mediante as condi��es: Exclu�do se m�dia < 10 Aprovado se m�dia >= 10 Dispensado se > 13 e <= 20  
 */
public class MediaEstudante {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in); // Inicializamos o nosso leitor
		
		String nome, resultado; // Declaramos as vari�veis nome e resultado
		
		double nota1, nota2, media; // Declaramos as vari�veis nota1, nota2 e media
		
		System.out.println("Digite a primeira nota: "); // Vamos exibir uma mensagem para o usu�rio
		
		nome = leitor.nextLine(); // Solicitamos o nome do estudante
		
		System.out.println("Digite a primeira nota: "); // Vamos exibir uma mensagem para o usu�rio
		
		nota1 = leitor.nextDouble(); // Solicitamos a primeira nota
		
		System.out.println("Digite a segunda nota: "); // Vamos exibir uma mensagem para o usu�rio
		
		nota2 = leitor.nextDouble(); // Solicitamos a segunda nota
		
		media = (nota1 + nota2) / 2; // Calculamos a m�dia
		
		if(media < 10) resultado = "Exclu�do"; // Exclu�do se m�dia for menor que 10
		
		else resultado = "Aprovado"; // Aprovado se m�dia for maior ou igual a 10
		
		if(media > 13 && media <= 20) resultado = "Dispensado"; // Dispensado se m�dia for maior que 13 e menor ou igual a 20   
		
		else resultado = "Fraude !!!"; // S� uma brincadeirinha
		
		System.out.println("Nome: " + nome + "\nResultado: " + resultado + "\nM�dia: " + media); // Exibimos o resultado
		
		leitor.close(); // Fechamos o nosso leitor, precisaremos dele amanh� :) 
	}

}
