package view;

import java.util.Scanner;

public class CaixaView {

	public void exibirSaldo(float conta) {
		System.out.println("---------------------------");
		System.out.println("Seu saldo atual é: " + conta);
		System.out.println("---------------------------");
	}

	public float sacar(Scanner lerDados) {
		float saque = 0;
		System.out.println("");
		System.out.println("Quanto vc deseja sacar:");
		saque = lerDados.nextFloat();
		return saque;
	}

	public float depositar(Scanner lerDados) {
		float deposito = 0;
		System.out.println("Quanto vc deseja depositar:");
		deposito = lerDados.nextFloat();
		return deposito;
	}
	
	public void valorNegativo() {
		System.out.println();
		System.out.println("Você nao tem esse dinheiro seu Ladrao zinho!!");
	}
	

}
