package com.jhonny.banco;

public class Nubank implements Banco {
	private Double saldo;
	private Boolean ativo;
	private String tipo;

	public Nubank(String tipo) {
		if (tipo == "Corrente" || tipo == "CORRENTE" || tipo == "corrente") {
			saldo = 100.0;
		} else {
			saldo = 50.0;
		}
		ativo = true;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public void saque(double valor) {
		if (ativo == true) {
			if (saldo >= valor) {
				saldo -= valor;
			} else {
				System.out.println("Você e pobre");
			}

		} else {
			System.out.println("Sua conta esta desativada");
		}
	}

	@Override
	public void deposito(double valor) {
		if (ativo == true) {
			if (valor > 0) {
				saldo += valor;
			}

		} else {
			System.out.println("Sua conta está desativada");
		}

	}

	@Override
	public double verSaldo() {
		if (ativo == true) {
			return saldo;

		}
		return 0;
	}

	public void desativa() {
		if (saldo == 0) {
			ativo = false;
		} else {
			System.out.println("Sua conta ainda possui dinheiro");
		}

	}
	public void reativa() {
		ativo = true;
	}

}
