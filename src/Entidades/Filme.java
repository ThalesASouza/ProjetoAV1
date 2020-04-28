package Entidades;

import Entidades_enum.Genero;

public class Filme {
	
	private String titulo;
	private Integer ano;
	private Genero genero;
	private String descricao;
	
	//Construtores
	public Filme(){
		
	}
	
	public Filme(String titulo, Integer ano, Genero genero, String descricao) {
		this.titulo = titulo;
		this.ano = ano;
		this.genero = genero;
		this.descricao = descricao;
	}

	// Getters
	
	

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
}
