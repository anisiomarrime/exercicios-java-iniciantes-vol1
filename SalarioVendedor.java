import java.util.Scanner; // Importamos o nosso leitor
/**
 * @author Anísio Marrime
 * http://www.anisiomarrime.com
 * itans.marrime@gmail.com
 * 
 * programa que leia o nome de um vendedor, o seu salário fixo e ototal de vendas efetuadas por ele no mês (em dinheiro). 
 * Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o
 * seu nome, o salário fixo e salário no final do mês.
 *
 */
public class SalarioVendedor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in); // Inicializamos o nosso leitor
		
		final double comissao = 0.15; // Percentagem da comissão
		
		double salarioFixo; // Salário fixo
		
		double salarioFinal;// Salário com a comissão 
		
		String nome; // Nome do vendedor
		
		System.out.println("Nome do vendedor: "); // Vamos exibir uma mensagem para o usuário
		
		nome = leitor.nextLine(); // Solicitamos o nome do vendedor
		
		System.out.println("Digite o salário fixo do vendedor: "); // Vamos exibir uma mensagem para o usuário
		
		salarioFixo  = leitor.nextDouble(); // Solicitamos o salário fixo do vendedor
		
		salarioFinal = salarioFixo + (salarioFixo * comissao); // Determinamos o salario final
		
		System.out.println("Nome do vendedor: " + nome); // Mostramos o nome
		System.out.println("Salário fixo: " + salarioFixo); // Mostramos o salário fixo
		System.out.println("Salário deste mês: " + salarioFinal); // Mostramos o salário do final do mês
		
		leitor.close(); // Fechamos o nosso leitor
	}

}
