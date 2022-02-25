import java.util.ArrayList;
import java.util.Scanner;

public class Poupança extends Conta {
	
	private double rendimento;

	static ArrayList<Poupança> listaPoupanca = new ArrayList<Poupança>();
	


	@Override
	public String toString() {
		return super.toString() + "\nRendimento: " + rendimento;
	}
	
	

	public Poupança(double saldo, String titular, String senha, boolean status, int numero, double rendimento) {
		super(saldo, titular, senha, status, numero);
		this.rendimento = rendimento;
	}



	public Poupança() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void deposito() {

	}

	public void transferencia() {

	}



//	Getters and Setters
	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}



}
