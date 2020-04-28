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
	
	
	public Filme PesquisaFilme(String titulo){
		
		for(Filme f : filmes) {
			if(f.getTitulo().toLowerCase().contains(titulo)) {
				System.out.println("\nFilmes encontrados\n");
				return f;
			}
		}
		System.out.println("Filme não encontrado");
		return null;
	}
	
	
}
