package br.com.generation.exercicios1;

	import java.util.Scanner;
	import java.math.*;
public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
		 */
		Scanner entrada=new Scanner(System.in);
		float num,rest;
		System.out.println("Insira um número");
		num=entrada.nextFloat();
		rest=num%2;
		if(rest==0) {
			System.out.println("O número é par");
			System.out.println("A raiz quadrada deste número é "+Math.sqrt(num));
		}else {
			System.out.println("O número é impar");
			System.out.println("Este número ao quadrado é "+Math.pow(num, 2));
		}
	}

}
