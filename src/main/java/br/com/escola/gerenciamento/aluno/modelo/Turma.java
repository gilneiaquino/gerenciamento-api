package br.com.escola.gerenciamento.aluno.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Turma {

 	@Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 	
  
	private TURNO turno;
	
 	private String nome;
 	
	@OneToMany(mappedBy = "turma")
 	private List<Aluno> alunos;
 	
	@ManyToOne
	private Professor professor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TURNO getTurno() {
		return turno;
	}

	public void setTurno(TURNO turno) {
		this.turno = turno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
 	

}
