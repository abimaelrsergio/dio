package br.com.abimael;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Por favor, digite o número da Agência: ");
		String agencia = scan.next();
		System.out.print("Por favor, digite o número da conta: ");
		int numero = scan.nextInt();
		System.out.print("Por favor, digit seu nome: ");
		String nomeCliente = scan.next();
		nomeCliente += scan.nextLine();
		double saldo = 237.48d;
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
				+ agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
		scan.close();
	}
}
