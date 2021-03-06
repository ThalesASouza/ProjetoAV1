package Controles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidades.Filme;
import Entidades_enum.Genero;


public class FilmeControle {
	
	
	private List<Filme> filmes= new ArrayList<>();
	
	Filme  filme = new Filme();
	Scanner sc = new Scanner(System.in);
	
	
	//Cadastrar filme
	
	public int CadastraFilme(String titulo,String descricao,int ano, Genero genero){
		
		filme = new Filme(titulo,ano,genero,descricao);
		
		for(Filme f : filmes ) {
		
			if((f.getTitulo().contains(titulo)) && (f.getGenero()==genero) && (f.getAno()==ano)){
				
				System.out.println("ERRO!!!\nFilme j� cadstrado no sistema");
				System.out.println("\n\nAperte Enter para continuar...");
				sc.nextLine();
				return 0;
			}	
			
		}
		
		filmes.add(filme);
		System.out.println("Filme cadastrado com sucesso");
		System.out.println("\n\nAperte Enter para continuar...");
		sc.nextLine();
		return 1;
	}
	
	
	//Pesquisar filme
	public int PesquisaFilme(String titulo){
		
		List<Filme> result=new ArrayList<>();
		
		if(filmes.isEmpty())
			
			System.out.println("\n\nERRO AO PESQUISAR!!!\nN�o existem filmes cadastrados");
		
		for(Filme f : filmes) {
			
			if(f.getTitulo().toLowerCase().contains(titulo)){
				result.add(f);
				System.out.println("\n\nFilmes encontrados\n");
				f.MostrarFilme();
				System.out.println("\nAperte Enter para continuar...");
				sc.nextLine();
				return 1;
		
			}
		}
		if(result.size()==0 && filmes.isEmpty()==false){
			System.out.println("\n\nFilme n�o encontrado");
		}
		
		System.out.println("\nAperte Enter para continuar...");
		sc.nextLine();
		return 0;
	
	}	
	
	
	//Editar filme
		
	public Filme EditarFilme(int codigo){
		
		for(Filme f : filmes){
			
			if(f.getCodigo()==codigo){
				
				return f;
			
			}else{
				
				System.out.println("\n\nC�digo do Filme n�o encontrado");
			
			}
		
		}
		
		System.out.println("\nAperte Enter para continuar...");
		sc.nextLine();
		return null;
		
	}	
	
	
	public void InserirDadosEdicao(Filme filme,String titulo,String descricao,int ano, Genero genero){
		
		this.filme = filme;
		filme.setTitulo(titulo);
		filme.setDescricao(descricao);
		filme.setAno(ano);
		filme.setGenero(genero);
		
		System.out.println("Filme editado com sucesso");
		System.out.println("\n\nAperte Enter para continuar...");
		sc.nextLine();
	}
	
	
	public Filme RemoverFilme(int codigo) {
		
		List<Filme> result=new ArrayList<>();
		
		for(Filme f : filmes){
			
			if(f.getCodigo()==codigo){
				
				result.add(f);
				return f;	

			}
		
		}
		
		if(result.size()==0) {
			System.out.println("\n\nC�digo do Filme n�o encontrado");
		}
		
		System.out.println("\nAperte Enter para continuar...");
		sc.nextLine();
		return null;
		
	}	
	
	
	public void RemoverFilmeSelecionado(Filme filme) {
		this.filme=filme;
		filmes.remove(filme);
		System.out.println("Filme Removido com sucesso");
		System.out.println("\n\nAperte Enter para continuar...");
		sc.nextLine();
	}

}
	


	

