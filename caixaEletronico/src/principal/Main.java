package principal;

import java.util.Scanner;

import controller.CaixaController;

public class Main {

	public static void menu() {
		System.out.println("-------Menu Caixa-------");
		System.out.println("1.Consultar saldo.");
		System.out.println("2.Sacar.");
		System.out.println("3.Depositar.");
		System.out.println("0.Sair.");
	}

	public static void main(String[] args) {
		int escolhaMenu = 0;
		CaixaController caixaController = new CaixaController();
		Scanner lerDados = new Scanner(System.in);

		do {
			menu();
			System.out.println();
			System.out.println("Digite sua escolha:");
			System.out.println("-------------------");
			escolhaMenu = lerDados.nextInt();

			switch (escolhaMenu) {

			case 1:
				caixaController.consultarSaldo();
				break;

			case 2:
				caixaController.sacarSaldo(lerDados);
				;
				break;

			case 3:
				caixaController.depositar(lerDados);
				break;

			}

		} while (escolhaMenu != 0);
		System.err.println("Saindo...");

	}

}
