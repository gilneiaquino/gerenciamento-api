package br.com.escola.gerenciamento.aluno.controller.form;

import java.time.LocalDateTime;

import br.com.escola.gerenciamento.aluno.enums.SEXO;
import br.com.escola.gerenciamento.aluno.modelo.Aluno;
import br.com.escola.gerenciamento.aluno.modelo.Turma;
import br.com.escola.gerenciamento.aluno.repository.TurmaRepository;

public class AlunoForm {
	
	private Long id;
	private String nome;
	private SEXO sexo;
	private LocalDateTime dataNascimento;
	private Turma turma;
	
	public AlunoForm(Aluno aluno) {
		this.id = aluno.getId();
		this.nome = aluno.getNome();
		this.sexo = aluno.getSexo();
		this.turma = aluno.getTurma();
	}	
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public SEXO getSexo() {
		return sexo;
	}
	public LocalDateTime getDataNascimento() {
		return dataNascimento;
	}
	
	public Turma getTurma() {
		return turma;
	}
	

	public Aluno converter(TurmaRepository turmaRepository) {
 		return null;
	}



	

}
