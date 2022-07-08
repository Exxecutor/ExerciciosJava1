package br.com.generation.exercicios1;

import java.util.Scanner;

public class Exercicio1 {
	

	public static void main(String[] args) {
		//Faça um programa que receba três inteiros e diga qual deles é o maior.
		Scanner entrada=new Scanner(System.in);
		int primeiro,segundo,terceiro,maior;
		System.out.println("Insira o primeiro número: ");
		primeiro=entrada.nextInt();
		System.out.println("Insira o segundo número: ");
		segundo=entrada.nextInt();
		System.out.println("Insira o terceiro númeor: ");
		terceiro=entrada.nextInt();
		maior=primeiro;
		if(segundo>=maior) {
			maior=segundo;
		}
		if(terceiro>=maior) {
			maior=terceiro;
		}
		System.out.println("O maior valor foi: "+maior);
		}
	}

