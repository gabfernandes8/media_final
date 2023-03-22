package br.senai.sp.jandira;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {

		System.out.println("**********************************************");
		System.out.println("                 MÉDIA FINAL                  ");
		System.out.println("**********************************************");
		System.out.println("");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Nome do aluno: ");
		String nome = teclado.next();
		
		System.out.print("Nota do bimestre 1: ");
		double bi1 = teclado.nextDouble();
		
		System.out.print("Nota do bimestre 2: ");
		double bi2 = teclado.nextDouble();
		
		System.out.print("Nota do bimestre 3: ");
		double bi3 = teclado.nextDouble();
		
		System.out.print("Nota do bimestre 4: ");
		double bi4 = teclado.nextDouble();
		
		double media = (bi1 + bi2 + bi3 + bi4) / 4;
		
		System.out.println("");
		System.out.println("----------------------------------------------");
		System.out.println("");
		System.out.println(" "+ nome +", sua nota final é "+ media +" ");
		System.out.println("");
		System.out.println("----------------------------------------------");
		
		

	}

}
