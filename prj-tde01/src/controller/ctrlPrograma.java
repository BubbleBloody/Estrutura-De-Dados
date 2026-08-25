package controller;

import model.*;
import java.util.Scanner;

public class ctrlPrograma {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o número de Cursos a ser Cadastrado: ");
		int m = scan.nextInt();		
		
		Curso[] cursos = new Curso[m];
		
		for(int i = 0; i < m; i++) {
			System.out.print("\nCódigo do Curso: ");
			int codigo = scan.nextInt();
			scan.nextLine();
			
			System.out.print("Nome do Curso: ");
			String nome = scan.nextLine();
			
			cursos[i] = new Curso(codigo, nome);
		}
		
		System.out.println();
		
		for(int i = m - 1; i >= 0; i--) {
			System.out.println(cursos[i]);
		}
		
		scan.close();

	}

}