
public class Conta {
	private String numeroDaConta;
	private double saldo;
	private Cliente cliente;

	public String getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumerodaConta(String numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void creditar(double valor) {
		saldo += valor;

	}

	public void debitar(double valor) {
		saldo -= valor;
	}

	public void transferir(Conta contaDestino, double valor) {
		debitar(valor);
		contaDestino.creditar(valor);

	}

	public void gerarNumero() {
		this.numeroDaConta = String.valueOf(Math.random() * 100);

	}

	public String toString() {
		return "Conta [numeroDaConta=" + numeroDaConta + ", saldo=" + saldo + ", cliente=" + cliente.getNome() + "]";
	}

}
