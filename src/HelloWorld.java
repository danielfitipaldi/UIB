import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner leTeclado = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		
		String nome = leTeclado.next();
		
		System.out.println("Hello, " + nome + "!" );
		
		leTeclado.close();
		
	}

}
