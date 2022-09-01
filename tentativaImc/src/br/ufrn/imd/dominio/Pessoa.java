package br.ufrn.imd.dominio;

/**
 * Classe pessoa para c�culo do IMC
 * @author A302
 *
 */
public class Pessoa {
	
	//vari�veis
	private String nome;
	private double altura;
	private double peso;
	
	//construtores
	
	public Pessoa() {}
		
	public Pessoa(String nome, double altura, double peso){
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
	}
	
	//getters e setters
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	//Calcula o IMC da pessoa
	public double calcIMC() {
		return  peso/Math.pow(altura, 2);
	}
	
	//Avalia com est� a sa�de do indiv�duo
	
	public void avaliaIMC() {
		if(calcIMC() < 18.5) {
			System.out.println(nome + " est� abaixo do peso!");
		}
		else if(calcIMC() >= 18.5 && calcIMC()< 25) {
			System.out.println(nome + " est� no peso normal!");
		}
		else if (calcIMC() >= 25 && calcIMC() < 30) {
			System.out.println(nome + " est� com pr�-obesidade!");
		}
		else if (calcIMC() >=30 && calcIMC() < 35) {
			System.out.println(nome + " est� com Obesidade Grau 1!");
		}
		else if (calcIMC() >=35 && calcIMC() < 40) {
			System.out.println(nome + " est� com Obesidade Grau 2!");
		}
		else {
			System.out.println(nome + " est� com Obesidade Grau 3!");
		}
	}
	
	//Sa�da padronizada
	@Override
	public String toString() {
		return nome + " ,altura: " + altura + " ,peso: " + peso;
	}
	
	
	
}
