import java.util.Scanner; // Importamos o nosso leitor
/**
 * @author Anísio Marrime
 * http://www.anisiomarrime.com
 * itans.marrime@gmail.com
 * 
 * Programa que faz o cálculo da área de um triângulo eqüilátero (3 lados iguais), 
 * onde a área é igual à base (lado do triângulo) multiplicada pela altura, e divididos por 2. 
 * Após o cálculo da área do triângulo, este valor deverá ser mostrado.
 *
 */
public class AreaTrianguloEquilatero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in); // Inicializamos o nosso leitor

		double h, l, area; // Declaramos as variáveis area, h => altura e l => lado/base
		
		h = leitor.nextDouble(); // Solicitamos o valor da altura
		
		l = leitor.nextDouble(); // Solicitamos o valor do lado/base
		
		area = (l * h) / 2; // Calculamos a área
		
		System.out.println("A área do triângulo eqüilátero é: " + area); // Mostra o resultado
		
		leitor.close(); // Fechamos o nosso leitor
	}

}
