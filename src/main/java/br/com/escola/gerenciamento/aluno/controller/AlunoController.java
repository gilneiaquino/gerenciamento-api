package br.com.escola.gerenciamento.aluno.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.escola.gerenciamento.aluno.controller.dto.AlunoDto;
import br.com.escola.gerenciamento.aluno.controller.form.AlunoForm;
import br.com.escola.gerenciamento.aluno.modelo.Aluno;
import br.com.escola.gerenciamento.aluno.repository.AlunoRepository;
import br.com.escola.gerenciamento.aluno.repository.TurmaRepository;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

	@Autowired
	private AlunoRepository alunoRepository;

	@Autowired
	private TurmaRepository turmaRepository;

	@PostMapping("/cadastrar")
	@Transactional
	public ResponseEntity<AlunoDto> cadastrar(@RequestBody AlunoForm alunoForm, UriComponentsBuilder uriBuilder) {
		Aluno aluno = alunoForm.converter(turmaRepository);
		alunoRepository.save(aluno);

		URI uri = uriBuilder.path("/aluno/alterar/{id}").buildAndExpand(aluno.getId()).toUri();
		return ResponseEntity.created(uri).body(new AlunoDto(aluno));
	}

	@RequestMapping("/alterar")
	public boolean Alterar(Aluno aluno) {
		return true;
	}

	@RequestMapping("/excluir/{id}")
	@Transactional
	public ResponseEntity<Aluno> excluir(Long id) {
		Optional<Aluno> optional = alunoRepository.findById(id);
		if (optional.isPresent()) {
			alunoRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
	}

	@RequestMapping("/listar")
	public List<AlunoDto> listar() {
		List<Aluno> alunos = alunoRepository.findAll();
		return AlunoDto.converter(alunos);
	}

}
