import java.util.ArrayList;
import java.util.Scanner;

public class Poupan�a extends Conta {
	
	private double rendimento;

	static ArrayList<Poupan�a> listaPoupanca = new ArrayList<Poupan�a>();
	


	@Override
	public String toString() {
		return super.toString() + "\nRendimento: " + rendimento;
	}
	
	

	public Poupan�a(double saldo, String titular, String senha, boolean status, int numero, double rendimento) {
		super(saldo, titular, senha, status, numero);
		this.rendimento = rendimento;
	}



	public Poupan�a() {
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
