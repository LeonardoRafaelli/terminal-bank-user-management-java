
import java.util.ArrayList;
import java.util.Scanner;

public class Corrente extends Conta {
	
	static ArrayList<Corrente> listaCorrente = new ArrayList<Corrente>();
	
	private double limite;
	
	public double getLimite() {
		return limite;
	}



	public void setLimite(double limite) {
		this.limite = limite;
	}

	
	



	@Override
	public String toString() {
		return super.toString() + "\nLimite: " + limite;
	}



	public Corrente(double saldo, String titular, String senha, boolean status,
			int numero, double limite) {
		super(saldo, titular, senha, status, numero);
		this.limite = limite;
	}



	public Corrente() {
		super();
		// TODO Auto-generated constructor stub
	}




	public static void pagamento() {
		
	}
	
	public static void deposito(int indice) {
		System.out.print("Digite o valor do depósito: ");
		double valorDeposito = sc.nextDouble();
		double saldoAntigo = listaCorrente.get(indice).getSaldo();
		listaCorrente.get(indice).setSaldo(listaCorrente.get(indice).getSaldo() + valorDeposito);

		System.out.println("Saldo antigo: " + saldoAntigo);
		System.out.println("Saldo atual: " + listaCorrente.get(indice).getSaldo());
	}
	
	public static void transferencia() {
		
	}
	
	
	
}
