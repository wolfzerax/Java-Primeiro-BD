package br.org.generation.sistemaAlunos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.sistemaAlunos.model.Aluno;
import br.org.generation.sistemaAlunos.servicos.IAlunoService;

@RestController
@CrossOrigin("*")
public class alunosController {

	@Autowired
	private IAlunoService servico;

	@GetMapping("/alunos/{id}")
	public ResponseEntity<Aluno> buscarAlunoPorId(@PathVariable int id) {
		return null;

	}

	@PostMapping("/aluno/novo")
	public ResponseEntity<Aluno> InserirNovoAluno(@RequestBody Aluno aluno) {
		try {
			servico.gravarAlunoNoBanco(aluno);
			return ResponseEntity.ok(aluno);

		} catch (Exception ex) {
			return ResponseEntity.badRequest().build();
		}

	}

	@PutMapping("/aluno/alterar")
	public ResponseEntity<Aluno> atualizarDados(@RequestBody Aluno aluno) {
		return null;
	}

}
