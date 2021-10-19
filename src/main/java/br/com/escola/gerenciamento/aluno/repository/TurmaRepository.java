package br.com.escola.gerenciamento.aluno.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.escola.gerenciamento.aluno.modelo.Turma;

public interface TurmaRepository extends JpaRepository<Turma, Long>{

	
}
