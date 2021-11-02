package br.com.escola.gerenciamento.aluno.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.escola.gerenciamento.aluno.modelo.Turma;
import br.com.escola.gerenciamento.aluno.modelo.Turno;

public class TurmaDtoLista {

	private Long id;
	private String nome;
	private Turno turno;

	public TurmaDtoLista(Turma turma) {
		this.id = turma.getId();
		this.nome = turma.getNome();
		this.turno = turma.getTurno();
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

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	public static List<TurmaDtoLista> converter(List<Turma> turmas) {
		return turmas.stream().map(TurmaDtoLista::new).collect(Collectors.toList());
	}
}
