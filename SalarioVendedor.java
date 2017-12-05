import java.util.Scanner; // Importamos o nosso leitor
/**
 * @author An�sio Marrime
 * http://www.anisiomarrime.com
 * itans.marrime@gmail.com
 * 
 * programa que leia o nome de um vendedor, o seu sal�rio fixo e ototal de vendas efetuadas por ele no m�s (em dinheiro). 
 * Sabendo que este vendedor ganha 15% de comiss�o sobre suas vendas efetuadas, informar o
 * seu nome, o sal�rio fixo e sal�rio no final do m�s.
 *
 */
public class SalarioVendedor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in); // Inicializamos o nosso leitor
		
		final double comissao = 0.15; // Percentagem da comiss�o
		
		double salarioFixo; // Sal�rio fixo
		
		double salarioFinal;// Sal�rio com a comiss�o 
		
		String nome; // Nome do vendedor
		
		System.out.println("Nome do vendedor: "); // Vamos exibir uma mensagem para o usu�rio
		
		nome = leitor.nextLine(); // Solicitamos o nome do vendedor
		
		System.out.println("Digite o sal�rio fixo do vendedor: "); // Vamos exibir uma mensagem para o usu�rio
		
		salarioFixo  = leitor.nextDouble(); // Solicitamos o sal�rio fixo do vendedor
		
		salarioFinal = salarioFixo + (salarioFixo * comissao); // Determinamos o salario final
		
		System.out.println("Nome do vendedor: " + nome); // Mostramos o nome
		System.out.println("Sal�rio fixo: " + salarioFixo); // Mostramos o sal�rio fixo
		System.out.println("Sal�rio deste m�s: " + salarioFinal); // Mostramos o sal�rio do final do m�s
		
		leitor.close(); // Fechamos o nosso leitor
	}

}
