package br.com.escola.gerenciamento.aluno.controller.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import br.com.escola.gerenciamento.aluno.enums.SEXO;
import br.com.escola.gerenciamento.aluno.modelo.Aluno;

public class AlunoDto {

	private Long id;
	private String nome;
	private LocalDate dataNascimento;
	private SEXO sexo;
	
	public AlunoDto(Aluno aluno) {
		this.nome = aluno.getNome();
		this.id = aluno.getId();
		this.sexo = aluno.getSexo();
		this.dataNascimento = aluno.getDataNascimento();
	}
 
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

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public SEXO getSexo() {
		return sexo;
	}

	public void setSexo(SEXO sexo) {
		this.sexo = sexo;
	}
	
}
