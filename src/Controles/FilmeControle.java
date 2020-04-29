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
				
				System.out.println("ERRO!!!\nFilme já cadstrado no sistema");
				return 0;
			}	
			
		}
		
		filmes.add(filme);
		System.out.println("Filme cadastrado com sucesso");
		return 1;
	}
	
	
	//Pesquisar filme
	public void PesquisaFilme(String titulo){
		
		if(filmes.isEmpty())
			
			System.out.println("\n\nERRO AO PESQUISAR!!!\nNão existem filmes cadastrados");
		
		for(Filme f : filmes) {
			
			if(f.getTitulo().toLowerCase().contains(titulo)){
				
				System.out.println("\n\nFilmes encontrados\n");
				f.MostrarFilme();
			
			}else{
				
				System.out.println("\n\nFilme não encontrado");
			
			}
		
		}
		
		System.out.println("\nAperte Enter para continuar...");
		sc.nextLine();
	
	}	
	
	
	//Editar filme
		
	public Filme EditarFilme(int codigo){
		
		for(Filme f : filmes){
			
			if(f.getCodigo()==codigo){
				
				return f;
			
			}else{
				
				System.out.println("\n\nCódigo do Filme não encontrado");
			
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
		
	}
}

	

