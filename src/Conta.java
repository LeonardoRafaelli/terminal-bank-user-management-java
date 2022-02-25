import java.util.Scanner;

public class Conta {
	static Scanner sc = new Scanner(System.in);
//	Scanner sc = new Scanner(System.in);
	
//	ArrayList<Conta> contas = new ArrayList<Conta>();
	
	private double saldo;
	private String titular, senha;
	private boolean status;
	private int numero;


	public Conta(double saldo, String titular, String senha, boolean status, int numero) {
		super();
		this.saldo = saldo;
		this.titular = titular;
		this.senha = senha;
		this.status = status;
		this.numero = numero;
	}


	
	public Conta() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "\nTitular: " + titular + "\nNúmero: " + numero + "\nSenha: " + senha + "\nStatus: " + status + "\nSaldo: R$ " + saldo;
	}


//	public void cadastro() {
//		Conta contaTemp = new Conta();
//		System.out.println("Informe os dados da conta: ");
//		System.out.print("Titular: ");
//		contaTemp.setTitular(sc.next());
//		
//	}
	
	
	public static void saque(int tipoConta, int i) {
		System.out.print("Qual o valor que desejas sacar?" +
				"\nDigite aqui: ");
		double valorSaque = sc.nextDouble();
		switch(tipoConta){
			case 1:
				if(valorSaque > Corrente.listaCorrente.get(i).getLimite()){
					System.out.println("Seu limite de saque é de: " + Corrente.listaCorrente.get(i).getLimite());
				} else if(valorSaque > Corrente.listaCorrente.get(i).getSaldo()) {
					System.out.println("Você não possui saldo suficiente!" +
							"\nSaldo atual: " + Corrente.listaCorrente.get(i).getSaldo());
				} else {
					Corrente.listaCorrente.get(i).setSaldo(Corrente.listaCorrente.get(i).getSaldo() - valorSaque);
				}
				break;
			case 2:
				if(valorSaque > Credito.listaCredito.get(i).getLimite()){
					System.out.println("Seu limite de saque é de: " + Credito.listaCredito.get(i).getLimite());
				} else if(valorSaque > Credito.listaCredito.get(i).getSaldo()) {
					System.out.println("Você não possui saldo suficiente!" +
							"\nSaldo atual: " + Credito.listaCredito.get(i).getSaldo());
				} else {
					Credito.listaCredito.get(i).setSaldo(Credito.listaCredito.get(i).getSaldo() - valorSaque);
				}
				break;
			case 3:
				if(valorSaque > Poupança.listaPoupanca.get(i).getSaldo()){
					System.out.print("Você não possui saldo suficiente para o saque!" +
							"\nSaldo atual: " + Poupança.listaPoupanca.get(i).getSaldo());
				} else {
					Poupança.listaPoupanca.get(i).setSaldo(Poupança.listaPoupanca.get(i).getSaldo() - valorSaque);
					System.out.println("Saldo Atual: " + Poupança.listaPoupanca.get(i).getSaldo());
				}
				break;
		}
	}

//	Buscar o saldo;
	public static void saldo(int tipoConta, int i) {
		System.out.print("Saldo Disponível: ");
		switch(tipoConta){
			case 1:
				System.out.println(Corrente.listaCorrente.get(i).getSaldo());
				break;
			case 2:
				System.out.println(Credito.listaCredito.get(i).getSaldo());
				break;
			case 3:
				System.out.println(Poupança.listaPoupanca.get(i).getSaldo());
				break;
		}
	}
	
	
//	Getters and Setters
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
