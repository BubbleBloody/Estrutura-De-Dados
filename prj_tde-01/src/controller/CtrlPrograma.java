package controller;

import java.util.Scanner;
import model.*;

public class CtrlPrograma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número de cursos a ser cadastrado: ");
		int qtdCurso = sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		
		Curso cursos[] = new Curso[qtdCurso];
		
		//Preenchendo atributos do array de cursos instanciados
		try {
			for(int i = 0; i < qtdCurso; i++) {
				System.out.print("Digite o nome do " + (i + 1)  + "° curso: ");
				String nomeCurso = sc.nextLine();
				
				System.out.print("Digite o código do " + (i + 1) + "° curso: ");
				int codigoCurso = sc.nextInt();
				sc.nextLine();
				
				System.out.println();
				
				cursos[i] = new Curso(nomeCurso, codigoCurso);
			}
			
		}	catch(ModelException e) {
				System.out.println(e);
		}
		
		//Exibindo cursos
		System.out.println("------------ Exibindo cursos ------------");
		for(int i = qtdCurso - 1; i >= 0; i--) {
			System.out.println("Curso n°" + (i + 1) + " " + cursos[i]);
		}
		
		sc.close();
		
	}

}