package controller;

import java.util.Scanner;

import model.Caixa;
import view.CaixaView;

public class CaixaController {
	private Caixa conta;
	private CaixaView caixaView;

	public CaixaController() {
		conta = new Caixa();
		caixaView = new CaixaView();
	}

	public void consultarSaldo() {
		caixaView.exibirSaldo(conta.getCaixa());
	}

	public void sacarSaldo(Scanner lerDados) {
		float valor = 0;
		float saque = 0;
		valor = caixaView.sacar(lerDados);
		if (valor > conta.getCaixa()) {
			caixaView.valorNegativo();
			
		} else {
			saque = (conta.getCaixa() - valor);
			conta.setCaixa(saque);
			System.out.println("Seu novo saldo é " + conta.getCaixa());
			
		}

	}

	public void depositar(Scanner lerDados) {
		float valor = 0;
		valor = caixaView.depositar(lerDados);
		conta.setCaixa(valor);
		System.out.println("Deposito no valor de: " + conta.getCaixa());
	}

}
