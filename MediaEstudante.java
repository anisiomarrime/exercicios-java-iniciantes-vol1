import java.util.Scanner; // Importamos o nosso leitor
/**
 * @author Anísio Marrime
 * http://www.anisiomarrime.com
 * itans.marrime@gmail.com
 *
 * Programa que recebe duas notas e calcula a média e apresenta como resultado o nome do estudante, a média e 
 * a situação mediante as condições: Excluído se média < 10 Aprovado se média >= 10 Dispensado se > 13 e <= 20  
 */
public class MediaEstudante {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in); // Inicializamos o nosso leitor
		
		String nome, resultado; // Declaramos as variáveis nome e resultado
		
		double nota1, nota2, media; // Declaramos as variáveis nota1, nota2 e media
		
		System.out.println("Digite a primeira nota: "); // Vamos exibir uma mensagem para o usuário
		
		nome = leitor.nextLine(); // Solicitamos o nome do estudante
		
		System.out.println("Digite a primeira nota: "); // Vamos exibir uma mensagem para o usuário
		
		nota1 = leitor.nextDouble(); // Solicitamos a primeira nota
		
		System.out.println("Digite a segunda nota: "); // Vamos exibir uma mensagem para o usuário
		
		nota2 = leitor.nextDouble(); // Solicitamos a segunda nota
		
		media = (nota1 + nota2) / 2; // Calculamos a média
		
		if(media < 10) resultado = "Excluído"; // Excluído se média for menor que 10
		
		else resultado = "Aprovado"; // Aprovado se média for maior ou igual a 10
		
		if(media > 13 && media <= 20) resultado = "Dispensado"; // Dispensado se média for maior que 13 e menor ou igual a 20   
		
		else resultado = "Fraude !!!"; // Só uma brincadeirinha
		
		System.out.println("Nome: " + nome + "\nResultado: " + resultado + "\nMédia: " + media); // Exibimos o resultado
		
		leitor.close(); // Fechamos o nosso leitor, precisaremos dele amanhã :) 
	}

}
