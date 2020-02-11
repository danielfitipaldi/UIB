

public class UibMain {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.saldo = 100;
		
		Cliente cliente1 = new Cliente();
		cliente1.nome = "Daniel";
		cliente1.cpf = "070.940.554-55";
		cliente1.conta = conta1;
		
		System.out.println(cliente1.nome + " tem " + cliente1.conta.saldo);
		
		
		
	}

}
