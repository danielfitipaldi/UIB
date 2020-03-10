import java.util.Scanner;

public class UibMain {

	public static void main(String[] args) {
		Scanner leTeclado = new Scanner(System.in);
		final int TOTAL_CLIENTE = 2;
		Cliente [] clientes = new Cliente[TOTAL_CLIENTE];
		Conta [] contas = new Conta[TOTAL_CLIENTE];
				
		System.out.println("Bem vindo ao Unit Internet Bank");
		System.out.println("-------------------------------");
		
		
		for (int i=0; i<2; i++) {
			clientes[i] = new Cliente();
			System.out.println("Por favor, digite o seu nome");
			clientes[i].setNome(leTeclado.next());
			
			System.out.println("Digite o seu CPF: ");
			clientes[i].setCpf(leTeclado.next());
			
		}
		for (int i=0; i<2; i++) {
			contas[i] = new Conta();
	
			contas[i].gerarNumero();
			System.out.println(contas[i].getNumeroDaConta());
			
			System.out.println("Informe o saldo inicial: ");
			contas[i].setSaldo(leTeclado.nextDouble());			
		
		}
				

	}

}
