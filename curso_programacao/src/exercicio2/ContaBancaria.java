package exercicio2;

public class ContaBancaria {

	private int numeroConta;
	private String nomeTitular;
	private double saldo;
	private double taxaSaque = 5.00;

	public ContaBancaria(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}

	public ContaBancaria(int numeroConta, String nomeTitular, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		depositar(depositoInicial);
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valorDeposito) {
		this.saldo += valorDeposito;

	}

	public void sacar(double valorSaque) {
		this.saldo -= valorSaque + taxaSaque;

	}

	public String toString() {
		return "Account " + String.format("%d", getNumeroConta()) + ", Holder: " + getNomeTitular() + ", Balance: $ "
				+ String.format("%.2f", getSaldo());
	}
}
