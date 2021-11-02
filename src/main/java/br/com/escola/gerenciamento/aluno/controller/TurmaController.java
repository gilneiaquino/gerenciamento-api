package br.com.escola.gerenciamento.aluno.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.escola.gerenciamento.aluno.controller.dto.TurmaDtoLista;
import br.com.escola.gerenciamento.aluno.modelo.Turma;
import br.com.escola.gerenciamento.aluno.repository.TurmaRepository;

@RestController
@RequestMapping("/turma")
public class TurmaController {

	@Autowired
	private TurmaRepository turmaRepository;
	
	@PostMapping("listar")
	public List<TurmaDtoLista> listar() {
		List<Turma> turmas = turmaRepository.findAll();
		return TurmaDtoLista.converter(turmas);
	}
}
