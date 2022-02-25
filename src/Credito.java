import java.util.ArrayList;
import java.util.Scanner;

public class Credito extends Conta {
	
	private double limite;
	private int dataFatura;
	

	static ArrayList<Credito> listaCredito = new ArrayList<Credito>();
	

	@Override
	public String toString() {
		return super.toString() + "\nLimite: " + limite + "\nData da fatura: " + dataFatura;
	}

	
	
	
	public Credito(double saldo, String titular, String senha, boolean status, int numero, double limite,
			int dataFatura) {
		super(saldo, titular, senha, status, numero);
		this.limite = limite;
		this.dataFatura = dataFatura;
	}


	public Credito() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void pagamento() {
		
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public int getDataFatura() {
		return dataFatura;
	}

	public void setDataFatura(int dataFatura) {
		this.dataFatura = dataFatura;
	}
	
	
	
}
