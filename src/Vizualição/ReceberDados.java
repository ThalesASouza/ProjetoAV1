package Vizualição;

import java.util.Scanner;

import Controles.FilmeControle;
import Entidades_enum.Genero;

public class ReceberDados {
	
	Scanner sc= new Scanner(System.in);
	FilmeControle FC = new FilmeControle();
	
	int ano;
	String genero;
	String descricao;
	String titulo;
	
	
	public void DadosCadastro(){
		int qtd;
		int i =0;
		System.out.println("Quantos filmes você quer cadastrar?\n");
		qtd=sc.nextInt();
		sc.nextLine();
		while(i<qtd) {
			System.out.println("\nDigite o titulo do filme\n");
			titulo=sc.nextLine();
			System.out.println("\nDigite o ano do filme\n");
			ano=sc.nextInt();
			sc.nextLine();
			System.out.println("\nDigite o genero do filme\n");
			genero=sc.nextLine();
			System.out.println("\nDigite a descrição do filme\n");
			descricao=sc.nextLine();
			int cadastro = FC.CadastraFilme(titulo, descricao, ano, Genero.valueOf(genero));
			if(cadastro==1){
				i++;
				
			}
		}
	
		sc.close();
	}
	
	public void DadosPesquisa(){
		System.out.println("\nDigite o titulo do filme\n");
		titulo=sc.nextLine();
		FC.PesquisaFilme(titulo.toLowerCase());
	}
	
}
