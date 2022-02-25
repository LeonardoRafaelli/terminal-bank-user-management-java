import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
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
				+ "\nSelecione o tipo de conta que quer usar"
				+ "\n1 - Corrente;" 
				+ "\n2 - Cr�dito;"
				+ "\n3 - Poupan�a;"
				+ "\n4 - Voltar;"
				+ "\nDigite aqui: ");
		int opcao = sc.nextInt();
		switch (opcao) {
			case 1:
				menuContaCorrente();
				break;
			case 2:
				menuContaCr�dito();
				break;
			case 3:
				menuContaPoupan�a();
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
	
	
	private static void menuContaCorrente() {
		int i;
		System.out.print("Digite o n�mero da conta: ");
		int conta = sc.nextInt();
			for(i = 0; i < Corrente.listaCorrente.size(); i++){
				if(Corrente.listaCorrente.get(i).getNumero() == conta) {
					menuDecisaoCorrente();
				}
			}
			
		System.out.println("Conta n�o existe! Tente dnv");
		menuContaCorrente();
//		System.out.println("Conta cancelada com sucesso paeee!");
//		menuBloqueio();
	
	}
	
	private static void menuDecisaoCorrente() {
		
	};
	
	private static void menuContaCr�dito() {
		
	}
	
	private static void menuContaPoupan�a() {
		
	}

	
	
	
	
	
	
	
	
	
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
