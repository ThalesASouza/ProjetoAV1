package Aplica��o;

import java.util.Scanner;

import Controles.FilmeControle;
import Entidades_enum.Genero;
import Vizuali��o.ReceberDados;


public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ReceberDados RD = new ReceberDados();
		
		int opc;
		int ano;
		String genero;
		String descricao;
		String titulo;
		
		
		System.out.println("O que voc� deseja fazer?\n");
		System.out.println("1 - Cadastrar Filme\n");
		System.out.println("2 - Pesquisar um Filme\n");
		System.out.println("3 - Editar Filme Cadastrado\n");
		System.out.println("4 - Deletar um Filme Cadastrado\n");
		System.out.println("Digite o n�mero da op��o que deseja:\n");
		
		opc = sc.nextInt();
		
		switch(opc){
		
			case 1: RD.DadosCadastro();				
			break;
			case 2:RD.DadosPesquisa();
			break;
		}
			 
		sc.close();
	}

}
