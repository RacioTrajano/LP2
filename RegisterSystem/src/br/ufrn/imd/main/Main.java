package br.ufrn.imd.main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import br.ufrn.imd.dominio.Aluno;
import br.ufrn.imd.dominio.Curso;
import br.ufrn.imd.dominio.Disciplina;

public class Main {

	public static void main(String[] args) {
		
		Aluno student = new Aluno();
		Scanner sc = new Scanner(System.in);
		Calendar dataNascimento = Calendar.getInstance();
		Curso course = new Curso();
		
		
		try {

			
			//cria um aluno
			System.out.println("Digite o Nome do Aluno: ");
			student.setNome(sc.nextLine());
			
			//System.out.println("Digite a Matrícula do Aluno");
			//student.setMatricula(sc.nextLine());
			
			/*
			//insere a data de nascimento do aluno
			System.out.println("Digite O DIA de Nascimento do Aluno");
			dataNascimento.set(Calendar.DATE, sc.nextInt());
			
			System.out.println("Digite O  MÊS Nascimento do Aluno");
			dataNascimento.set(Calendar.MONTH, sc.nextInt());
			
			System.out.println("Digite O ANO de Nascimento do Aluno");
			dataNascimento.set(Calendar.YEAR, sc.nextInt());
			*/
			
			
			//Cadastra o aluno em um curso
			System.out.println("Digite o curso do Aluno");
			if(student.getCurso() != null) {
				System.out.println("O Aluno já está matriculado em um curso: " + student.getCurso().getDescricao());
			}else {
				course.setDescricao(sc.nextLine());
				student.setCurso(course);
			}
				
			
			
			//Criação de disciplina 
			
			student.setDisciplinas(new ArrayList<Disciplina>());
			
			System.out.println("Digite a quantidade disciplinas a serem inseridas");
			int qtdmat = sc.nextInt();
			for (int i = 0; i<qtdmat; i++) {
				Disciplina subject = new Disciplina();
				System.out.println("Digite o nome da disciplina: " + i );
				subject.setDescricao(sc.nextLine());
				student.getDisciplinas().add(subject);
			}
			
			
			
			
			//código que imprime as disciplinas
			for (Disciplina d : student.getDisciplinas()) {
				System.out.println(d.getDescricao());
			}
			
			//saida do programa
			
			//student.setDataNascimento(dataNascimento.getTime());
			
			
			//System.out.println(student);
		
		
		
		}finally {
			sc.close();
		}
		
		
		
	}

}
