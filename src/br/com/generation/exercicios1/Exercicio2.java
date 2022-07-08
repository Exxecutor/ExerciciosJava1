package br.com.generation.exercicios1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		//Faça um programa que entre com três números e coloque em ordem crescente.
		Scanner entrada=new Scanner(System.in);
		int primeiro,segundo,terceiro,primeiromaior,segundomaior=0,terceiromaior=0;
		System.out.println("Insira o primeiro número: ");
		primeiro=entrada.nextInt();
		System.out.println("Insira o segundo número: ");
		segundo=entrada.nextInt();
		System.out.println("Insira o terceiro númeor: ");
		terceiro=entrada.nextInt();
		primeiromaior=primeiro;
		if(segundo>=primeiromaior && terceiro<=primeiromaior) {
			primeiromaior=segundo;
			segundomaior=primeiro;
			terceiromaior=terceiro;
			
		}
		if(terceiro>=primeiromaior && segundo<=primeiromaior) {
			primeiromaior=terceiro;
			segundomaior=primeiro;
			terceiromaior=segundo;
		}
		if(primeiro>=primeiromaior && segundo>=terceiro) {
			primeiromaior=primeiro;
			segundomaior=segundo;
			terceiromaior=terceiro;
		}
		if(terceiro>=primeiromaior && segundo>=primeiromaior) {
			primeiromaior=terceiro;
			segundomaior=segundo;
			terceiromaior=primeiro;
		}
		if(segundo>=primeiromaior && terceiro>=primeiromaior) {
			primeiromaior=segundo;
			segundomaior=terceiro;
			terceiromaior=primeiro;
		}
		System.out.println("A ordem foi: "+terceiromaior+","+segundomaior+","+primeiromaior);
		}
	}