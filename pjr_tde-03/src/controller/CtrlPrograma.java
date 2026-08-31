package controller;

import java.util.Scanner;
import model.*;

public class CtrlPrograma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			Departamento dp1 = new Departamento("SI", "Sistema de Informação");	
			
			System.out.println(dp1);
			
		} catch(ModelException e) {
			
			System.out.println(e);
		}
	}

}