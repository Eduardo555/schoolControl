package model;

import java.sql.Date;

public class Materia {
	
	public Integer getCodMateria() {
		return CodMateria;
	}
	public void setCodMateria(Integer codMateria) {
		CodMateria = codMateria;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	private Integer CodMateria;
	private String Nome;
	private String Descricao;
	
}
