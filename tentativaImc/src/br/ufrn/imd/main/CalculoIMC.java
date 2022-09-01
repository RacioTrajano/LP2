package br.ufrn.imd.main;

import java.util.Scanner;

import br.ufrn.imd.dominio.Pessoa;

public class CalculoIMC {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Digite o nome da pessoa: ");
			p.setNome(sc.nextLine());
			
			System.out.println("Digite o peso de: " + p.getNome());
			p.setPeso(sc.nextDouble());
			
			System.out.println("Digite a altura de: " + p.getNome());
			p.setAltura(sc.nextDouble());
			
			//calculo do IMC
			double IMC = p.calcIMC();
			
			System.out.println(p);
			System.out.println("O IMC de " + p.getNome() +" é " + IMC);
			
			// análise do IMC
			p.avaliaIMC();
			
		}finally {
			sc.close();
		}
	}

}
