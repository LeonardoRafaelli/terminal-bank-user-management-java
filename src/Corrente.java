
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




	public void pagamento() {
		
	}
	
	public void deposito() {
		
	}
	
	public void transferencia() {
		
	}
	
	
	
}
