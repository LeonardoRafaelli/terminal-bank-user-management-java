

public class Conta {
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
		return "Titular: " + titular + "\nNúmero: " + numero + "\nSenha: " + senha + "\nStatus: " + status + "\nSaldo: R$ " + saldo;
	}


//	public void cadastro() {
//		Conta contaTemp = new Conta();
//		System.out.println("Informe os dados da conta: ");
//		System.out.print("Titular: ");
//		contaTemp.setTitular(sc.next());
//		
//	}
	
	
	public void saque() {
		
	}

//	Buscar o saldo;
	public void saldo() {
		
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
