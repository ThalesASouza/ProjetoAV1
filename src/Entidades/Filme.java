package Entidades;

import Entidades_enum.Genero;

public class Filme {
	
	private static int id=0;
	private String titulo;
	private Integer ano;
	private Genero genero;
	private String descricao;
	private Integer codigo;
	
	//Construtores
	
	public Filme(){
		
	}
	
	public Filme(String titulo, Integer ano, Genero genero, String descricao) {
		this.codigo=++id;
		this.titulo = titulo;
		this.ano = ano;
		this.genero = genero;
		this.descricao = descricao;
	}	

	// Getters
	
	public Integer getCodigo() {
		return codigo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public Integer getAno() {
		return ano;
	}
	
	public Genero getGenero() {
		return genero;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	// Setters
	
	
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void MostrarFilme() {
		System.out.println("\n--------FILME----------\n");
		System.out.println("Código:"+this.codigo);
		System.out.println("Titulo:"+this.titulo);
		System.out.println("Ano:"+this.ano);
		System.out.println("Genero:"+this.genero);
		System.out.println("Descrição:"+this.descricao);
	}
	
	
	
	
	
}
