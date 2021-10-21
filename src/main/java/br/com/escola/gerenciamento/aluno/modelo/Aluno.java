package br.com.escola.gerenciamento.aluno.modelo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.com.escola.gerenciamento.aluno.enums.SEXO;

@Entity
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private SEXO sexo;
	private LocalDate dataNascimento;

	public Aluno() {
		super();
	}
 
	public Aluno(Long id, String nome, SEXO sexo, LocalDate dataNascimento, Turma turma) {
		super();
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.turma = turma;
	}



	@ManyToOne
	private Turma turma;

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

	public SEXO getSexo() {
		return sexo;
	}

	public void setSexo(SEXO sexo) {
		this.sexo = sexo;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
