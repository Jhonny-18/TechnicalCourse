package com.jhonny.banco;

public class Caixa implements Banco {
	private Double saldo;

	public Caixa() {
		saldo = 0.0;
	}
	private double getSaldo() {
		return saldo;
	}
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public void saque(double valor) {
		if(saldo >= valor) {
			saldo -= valor;
		}else {
			System.out.println("Você e pobre");
		}
		
	}
	@Override
	public void deposito(double valor) {
		if (valor > 0) {
			saldo += valor;
		}
		
	}
	@Override
	public double verSaldo() {
		return saldo;
	}
	

}
