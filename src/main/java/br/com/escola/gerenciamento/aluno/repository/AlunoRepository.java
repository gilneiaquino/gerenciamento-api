package br.com.escola.gerenciamento.aluno.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.escola.gerenciamento.aluno.modelo.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{

}
