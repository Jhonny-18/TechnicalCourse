package com.jhonny.banco;

public class Main {

	public static void main(String[] args) {
		BancoBrasil br = new BancoBrasil("Poupança");
		System.out.println(br.verSaldo());
		//br.saque(50);
		System.out.println(br.verSaldo());
		br.desativar();
		
		
	}

}
