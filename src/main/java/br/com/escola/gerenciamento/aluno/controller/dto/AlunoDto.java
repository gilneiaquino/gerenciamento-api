package br.com.escola.gerenciamento.aluno.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.escola.gerenciamento.aluno.modelo.Aluno;

public class AlunoDto {

	public AlunoDto(Aluno aluno) {
		this.nome = aluno.getNome();
		this.id = aluno.getId();
	}

	private Long id;
	private String nome;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public static List<AlunoDto> converter(List<Aluno> alunos) { 
		return alunos.stream().map(AlunoDto::new).collect(Collectors.toList());
	}
	
}
