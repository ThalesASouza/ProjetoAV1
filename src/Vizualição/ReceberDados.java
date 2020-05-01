package Vizualição;

import java.util.Scanner;

import Controles.FilmeControle;
import Entidades.Filme;
import Entidades_enum.Genero;

public class ReceberDados {
	
	Scanner sc= new Scanner(System.in);
	FilmeControle FC = new FilmeControle();
	Filme filme=new Filme();
	
	int ano;
	int codigo;
	int aux;
	
	String genero;
	String descricao;
	String titulo;
	
	//Recebendo dados da opção cadastrar
	public void DadosCadastro(){
		
		int qtd;
		int i=0;
		
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
			
			int cadastro = FC.CadastraFilme(titulo, descricao, ano, Genero.valueOf(genero.toUpperCase()));
			if(cadastro==1){
				i++;
				
			}
			
		}
	
		
	}
	
	//Recebendo dados da opção pesquisar
	
	public void DadosPesquisa(){
		
		System.out.println("\nDigite o titulo do filme\n");
		titulo=sc.nextLine();
		
		FC.PesquisaFilme(titulo.toLowerCase());
	}
	
	
	//Recebendo dados da opção editar
	public void DadosEdicao() {
		
		System.out.println("\nProcure pelo filme digitando aqui\n");
		titulo=sc.nextLine();
		
		aux=FC.PesquisaFilme(titulo.toLowerCase());
		
		if(aux==1) {
		
			System.out.println("\nDigite o código do filme que deseja editar\n");
			codigo=sc.nextInt();
			sc.nextLine();
			
			//recebendo o objeto filme a ser editado
			filme=FC.EditarFilme(codigo);
			
			
			//Digitando os novos dados do objeto recebido
			System.out.println("\nDigite o titulo do filme\n");
			titulo=sc.nextLine();
			
			System.out.println("\nDigite o ano do filme\n");
			ano=sc.nextInt();
			sc.nextLine();
			
			System.out.println("\nDigite o genero do filme\n");
			genero=sc.nextLine();
			
			System.out.println("\nDigite a descrição do filme\n");
			descricao=sc.nextLine();
			
			//Passando o objeto a ser editado e seus novos dados para ser inserido na lista.
			FC.InserirDadosEdicao(filme,titulo, descricao, ano, Genero.valueOf(genero.toUpperCase()));
		}
		
	}
	
	//Recebendo dados da opção remover
	public void DadosRemocao() {
		
		System.out.println("\nProcure pelo filme digitando aqui\n");
		titulo=sc.nextLine();
		
		aux=FC.PesquisaFilme(titulo.toLowerCase());
		
		if(aux==1) {
			System.out.println("\nDigite o código do filme que deseja remover\n");
			codigo=sc.nextInt();
			sc.nextLine();
			
			//passando o codigo do objeto filme a ser removido
			filme=FC.RemoverFilme(codigo);
			
			FC.RemoverFilmeSelecionado(filme);
		}		
	}
	
}