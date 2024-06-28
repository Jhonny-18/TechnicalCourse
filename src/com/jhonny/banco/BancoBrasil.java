package com.jhonny.banco;

public class BancoBrasil implements Banco {
	private Double saldo;
	private String tipo;
	private Boolean ativo;

	public BancoBrasil(String tipo) {
		if (tipo == "CORRENTE" || tipo == "corrente" || tipo == "Corrente") {
			this.saldo = 100.0;
		} else {
			this.saldo = 50.0;
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
			System.out.println("Sua conta está desativada!!");
		}

	}

	@Override
	public void deposito(double valor) {
		if (ativo == true) {
			if (valor > 0) {
				saldo += valor;
			}

		}
	}

	@Override
	public double verSaldo() {
		return saldo;
	}

	public void desativar() {
		if (saldo == 0) {
			ativo = false;
		} else {
			System.out.println("Você não pode desativar a conta com ddinheiro");
		}
	}

	public void reativaconta() {
		ativo = true;
	}

}
