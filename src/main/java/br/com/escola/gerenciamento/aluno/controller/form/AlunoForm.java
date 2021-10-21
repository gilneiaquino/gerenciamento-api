package br.com.escola.gerenciamento.aluno.controller.form;

import java.time.LocalDate;

import br.com.escola.gerenciamento.aluno.enums.SEXO;
import br.com.escola.gerenciamento.aluno.modelo.Aluno;
import br.com.escola.gerenciamento.aluno.modelo.Turma;
import br.com.escola.gerenciamento.aluno.repository.TurmaRepository;

public class AlunoForm {

	private Long id;
	private String nome;
	private SEXO sexo;
	private LocalDate dataNascimento;
	private Turma turma;

	public AlunoForm(Aluno aluno) {
		this.id = aluno.getId();
		this.nome = aluno.getNome();
		this.sexo = aluno.getSexo();
		this.turma = aluno.getTurma();
	}

	public AlunoForm() {
		super();
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

	public Turma getTurma() {
		return turma;
	}

	public Aluno converter(TurmaRepository turmaRepository, AlunoForm alunoForm) {
		Aluno alunoFormulario = new Aluno(alunoForm.getId(), alunoForm.getNome(), alunoForm.getSexo(),
				alunoForm.getDataNascimento(), alunoForm.getTurma());
		return alunoFormulario;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

}
