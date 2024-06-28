package com.jhonny.banco;

public interface Banco {
	public abstract void saque(double valor);

	public abstract void deposito(double valor);

	public abstract double verSaldo();
}
