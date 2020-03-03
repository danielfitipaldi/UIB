
public class Conta {
	public String numeroDaConta;
	public double saldo;
	public Cliente donoDaConta;
	
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
	
	public Cliente getDonoDaConta() {
		return donoDaConta;
	}
	public void setDonoDaConta(Cliente donoDaConta) {
		this.donoDaConta = donoDaConta;
	}
	
}
