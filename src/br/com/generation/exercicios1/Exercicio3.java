package br.com.generation.exercicios1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto
		 */
		Scanner entrada=new Scanner(System.in);
		int idade;
		//String classf;
		System.out.println("Escreva a sua idade: ");
		idade=entrada.nextInt();
		if(idade>=10 && idade<=14) {
			System.out.println("Você é classificado como infantil");
		}
		if(idade>=15 && idade<=17) {
			System.out.println("Você é classificado como juvenil");
		}
		if(idade>=18 && idade<=25) {
			System.out.println("Você é classificado como adulto");
		}
		if(idade<10 && idade>25){
			System.out.println("Você não está dentro das classificações, por favor insira uma idade entre 10 e 25 anos");
		}
	}
}

/*
 Outra solução é:
 System.out.println("Escreva a sua idade: ");
		idade=entrada.nextInt();
		if(idade>=10 && idade<=14) {
			classf="infantil";
		}
		if(idade>=15 && idade<=17) {
			classf="juvenil";
		}
		if(idade>=18 && idade<=25) {
			classf="adulto";
		}
		System.out.println("Você é classificado como: "+classf)
*/
