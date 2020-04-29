package Aplicação;


import java.util.Scanner;

import Vizualição.ReceberDados;


public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ReceberDados RD = new ReceberDados();
		
		int opc;
		boolean loop=true;
		
		while(loop){
			
		
			System.out.println("\n\nO que você deseja fazer?\n");
			System.out.println("1 - Cadastrar Filme\n");
			System.out.println("2 - Pesquisar um Filme\n");
			System.out.println("3 - Editar Filme Cadastrado\n");
			System.out.println("4 - Deletar um Filme Cadastrado\n");
			System.out.println("5 - Sair\n");
			System.out.println("Digite o número da opção que deseja:\n");
			
			
			
			opc = sc.nextInt();
			
			sc.nextLine();
			switch(opc){
		
				case 1:RD.DadosCadastro();				
				break;
				
				case 2:RD.DadosPesquisa();
				break;
				
				case 3:RD.DadosEdicao();
				break;
				
				case 4:RD.DadosRemocao();
				break;
				
				case 5:
					sc.close();
					loop=false;
				
			}
			 
		
		}
	

	}
	
}
