import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Corrente contaCorr1 = new Corrente();
		contaCorr1.setNumero(123);
		contaCorr1.setLimite(2000);
		contaCorr1.setSenha("123");
		contaCorr1.setTitular("Leozin");
		contaCorr1.setSaldo(1000);
		Corrente.listaCorrente.add(contaCorr1);
		menuPrincipal();
	}

	private static void menuPrincipal() {
		Scanner sc = new Scanner(System.in);

		System.out.print(
					"\n------ MENU PRINCIPAL ------" 
					+ "\n1 - Ger�ncia;" 
					+ "\n2 - Usu�rio;"
					+ "\n3 - Fechar."
					+ "\nDigite aqui: ");
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:	
			menuGerencia();
			break;
		case 2:
			menuUsu�rio();
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("Anta! � de 1 � 3 p�.");
			menuPrincipal();
			break;
		}

	}

	
	// C�DIGOS DE USU�RIO
	private static void menuUsu�rio() {
		System.out.print("\n------ MENU USU�RIO ------"
				+ "\nSelecione o tipo da conta:"
				+ "\n1 - Corrente;" 
				+ "\n2 - Cr�dito;"
				+ "\n3 - Poupan�a;"
				+ "\n4 - Voltar;"
				+ "\nDigite aqui: ");
		int opcao = sc.nextInt();
		switch (opcao) {
			case 1:
				entradaContaCorrente(opcao);
				break;
			case 2:
//				menuContaCr�dito(opcao);
				break;
			case 3:
//				menuContaPoupan�a(opcao);
				break;
			case 4:
				menuPrincipal();
				break;
			default:
				System.out.println("Anta! � de 1 � 4 p�.");
				menuGerencia();
				break;
		};
	}
	
	
	private static void entradaContaCorrente(int tipoConta) {
		int i, verificar = 0, indice;

		System.out.print("\n------ CONTA CORRENTE ------" +
				"\nDigite o n�mero da conta (0 - Voltar): ");
		int conta = sc.nextInt();
		if(conta == 0){
			menuUsu�rio();
		}
		System.out.print("Digite a senha: ");
		String senha = sc.next();
			for(i = 0; i < Corrente.listaCorrente.size(); i++) {
				if (Corrente.listaCorrente.get(i).getNumero() == conta) {
					if (Corrente.listaCorrente.get(i).getSenha().equals(senha)) {
						verificar = 1;
						indice = i;
						menuOpcoesCorrente(tipoConta, indice);
					}
				}
			}
		if(verificar != 1){
		System.out.println("N�mero ou senha incorretos!");
		entradaContaCorrente(tipoConta);
		}
	}
	
	private static void menuOpcoesCorrente(int tipoConta, int indice) {
		System.out.print("\n------ MENU MINHA CONTA CORRENTE ------" +
				"\n1 - Ver Saldo;" +
				"\n2 - Saque;" +
				"\n3 - Dep�sito;" +
				"\n4 - Transfer�ncia;" +
				"\n5 - Pagamento;" +
				"\n6 - Voltar." +
				"\nDigite aqui: ");
		int opcao = sc.nextInt();
		switch(opcao){
			case 1:
				Conta.saldo(tipoConta, indice);
				menuOpcoesCorrente(tipoConta, indice);
				break;
			case 2:
				Conta.saque(tipoConta, indice);
				menuOpcoesCorrente(tipoConta, indice);
				break;
			case 3:
				Corrente.deposito(indice);
				menuOpcoesCorrente(tipoConta, indice);
				break;
			case 4:
//				transferencia(tipoConta, indice);
				break;
			case 5:
				break;
			case 6:
				entradaContaCorrente(tipoConta);
				break;
			default:
				System.out.println("Por favor, digite um n�mero de 1 � 4");
				menuOpcoesCorrente(tipoConta, indice);
				break;
		}
	};


	private static void menuContaCr�dito() {
		
	}
	
	private static void menuContaPoupan�a() {
		
	}

//	private static void verSaldo(int tipoConta, int i){
//		switch(tipoConta){
//			case 1:
//				System.out.println(Corrente.listaCorrente.get(i).getSaldo());
//				break;
//			case 2:
//				System.out.println(Credito.listaCredito.get(i).getSaldo());
//				break;
//			case 3:
//				System.out.println(Poupan�a.listaPoupanca.get(i).getSaldo());
//				break;
//		}
//		menuDecisaoCorrente(tipoConta, i);
//	}

//	private static void saque(int tipoConta, int i) {
//		System.out.print("Qual o valor que desejas sacar?" +
//				"\nDigite aqui: ");
//		double valorSaque = sc.nextDouble();
//		switch(tipoConta){
//			case 1:
//				if(valorSaque > Corrente.listaCorrente.get(i).getLimite()){
//					System.out.println("Seu limite de saque � de: " + Corrente.listaCorrente.get(i).getLimite());
//				}
//				Corrente.listaCorrente.get(i).setSaldo(Corrente.listaCorrente.get(i).getSaldo() - valorSaque);
//				break;
//			case 2:
//				Credito.listaCredito.get(i).setSaldo(Credito.listaCredito.get(i).getSaldo() - valorSaque);
//				break;
//			case 3:
//				Poupan�a.listaPoupanca.get(i).setSaldo(Poupan�a.listaPoupanca.get(i).getSaldo() - valorSaque);
//				break;
//		}
//
//
//		menuDecisaoCorrente(tipoConta, i);
//	};
	
	
	
	
	
	
	
	
	// C�DIGOS DE GERENCIAMENTO
	private static void menuGerencia() {
		System.out.print("\n------ MENU GER�NCIA ------" 
							+ "\n1 - Cadastrar Conta;" 
							+ "\n2 - Bloquear Conta;"
							+ "\n3 - Listar Contas;"
							+ "\n4 - Voltar."
							+ "\nDigite aqui: ");
		int opcao = sc.nextInt();
		switch (opcao) {
		case 1:
			menuCadastro();
			break;
		case 2:
			menuBloqueio();
			break;
		case 3:
			menuListar();
			break;
		case 4:
			menuPrincipal();
			break;
		default:
			System.out.println("Anta! � de 1 � 4 p�.");
			menuGerencia();
			break;
		};
	}
	
	
	
	
	private static void menuCadastro() {
		System.out.print(
				"\n------ MENU CADASTRO ------" 
				+ "\n1 - Corrente;" 
				+ "\n2 - Cr�dito;"
				+ "\n3 - Poupan�a;"
				+ "\n4 - Voltar."
				+ "\nDigite aqui: ");
		int opcao = sc.nextInt();
		if (opcao > 0 && opcao < 4) {
			cadastrar(opcao);
		} else if(opcao == 4){
			menuGerencia();
		} else {
			System.out.println("Anta! � de 1 � 4 p�.");
			menuCadastro();
		}
	}
	
	private static void menuBloqueio() {
		System.out.print(
				"\n------ MENU BLOQUEIO ------" 
				+ "\n1 - Corrente;" 
				+ "\n2 - Cr�dito;"
				+ "\n3 - Poupan�a"
				+ "\n4 - Voltar"
				+ "\nDigite aqui: ");
		int opcao = sc.nextInt();
		
		System.out.print("Informe o n�mero da conta a ser bloqueada: ");
		int conta = sc.nextInt();
		
		if (opcao > 0 && opcao < 4) {
			cancelar(opcao, conta);
		} else if(opcao == 4){
			menuGerencia();
		} else {
			System.out.println("Anta! � de 1 � 4 p�.");
			menuBloqueio();
		}
	}
	
	public static void cancelar(int opcao, int conta) {
		int i;
		switch(opcao) {
		case 1:
			for(i = 0; i < Corrente.listaCorrente.size(); i++){
				if(Corrente.listaCorrente.get(i).getNumero() == conta) {
					Corrente.listaCorrente.get(i).setStatus(false);
				}
			}
			break;
		case 2:
			for(i = 0; i < Credito.listaCredito.size(); i++){
				if(Credito.listaCredito.get(i).getNumero() == conta) {
					Credito.listaCredito.get(i).setStatus(false);
				}
			}
			break;
		case 3:
			for(i = 0; i < Poupan�a.listaPoupanca.size(); i++){
				if(Poupan�a.listaPoupanca.get(i).getNumero() == conta) {
					Poupan�a.listaPoupanca.get(i).setStatus(false);
				}
			}
			
			break;
		}
		System.out.println("Conta cancelada com sucesso paeee!");
		menuBloqueio();
	}
	
	
	private static void menuListar() {
		System.out.print(
				"\n------ MENU LISTAR ------" 
				+ "\n1 - Corrente;" 
				+ "\n2 - Cr�dito;"
				+ "\n3 - Poupan�a;"
				+ "\n4 - Voltar."
				+ "\nDigite aqui: ");
		int opcao = sc.nextInt();
		
		if (opcao > 0 && opcao < 4) {
			listar(opcao);
		} else if(opcao == 4){
			menuGerencia();
		} else {
			System.out.println("Anta! � de 1 � 4 p�.");
			menuListar();
		}
	}
	
	
	
	private static void listar(int opcao) {
		switch(opcao) {
		case 1:
			for(int i = 0; i < Corrente.listaCorrente.size(); i++) {
				System.out.println(Corrente.listaCorrente.get(i).toString());
				if(i+1 != Corrente.listaCorrente.size()) {
					System.out.println("------------------");
				}
			}
			break;
		case 2:
			for(int i = 0; i < Credito.listaCredito.size(); i++) {
				System.out.println(Credito.listaCredito.get(i).toString());
				if(i+1 != Credito.listaCredito.size()) {
					System.out.println("------------------");
				}
			}
			break;
		case 3:
			for(int i = 0; i < Poupan�a.listaPoupanca.size(); i++) {
				System.out.println(Poupan�a.listaPoupanca.get(i).toString());
				if(i+1 != Poupan�a.listaPoupanca.size()) {
					System.out.println("------------------");
				}
			}
		}
		menuListar();
	}
	
	private static void cadastrar(int opcao) {
		
		System.out.print("\nN�mero da conta: ");
		int numero = sc.nextInt();
		System.out.print("Titular: ");
		String titular = sc.next();
		System.out.print("Senha: ");
		String senha = sc.next();
		boolean status = true;
		double saldo = 0.0;
		
		switch(opcao) {
		case 1:
			System.out.print("Limite: ");
			double limite = sc.nextDouble();
			Corrente corrente = new Corrente(saldo, titular, senha, status, numero, limite);
			Corrente.listaCorrente.add(corrente);
			break;
			
		case 2:
			System.out.print("Limite: ");
			limite = sc.nextDouble();
			System.out.print("Data da fatura: ");
			int dataFatura = sc.nextInt();
			Credito credito = new Credito(saldo, titular, senha, status, numero, limite, dataFatura);
			Credito.listaCredito.add(credito);
			break;
			
		case 3:
			System.out.println("Rendimento: ");
			double rendimento = sc.nextDouble();
			Poupan�a poupan�a = new Poupan�a (saldo, titular, senha, status, numero, rendimento);
			Poupan�a.listaPoupanca.add(poupan�a);
			break;
		}
		System.out.println("Cadastro realizado com sucesso!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		menuCadastro();
	}
	
	
	
	
}
