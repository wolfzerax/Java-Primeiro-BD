package br.org.generation.sistemaAlunos.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.generation.sistemaAlunos.dao.iAlunoBd;
import br.org.generation.sistemaAlunos.model.Aluno;

@Component
public class ServicosAlunos implements IAlunoService {

	@Autowired
	iAlunoBd repo;

	public void gravarAlunoNoBanco(Aluno aluno) {
		try {
		repo.save(aluno);
			
		}
	catch (Exception ex) {
		throw new RuntimeException("error error error");
	}
	}

	public void atualizarAlunoNoBanco(Aluno aluno) {
		try {
		repo.save(aluno);
		}
		catch (Exception ex) {
			throw new RuntimeException("Error ao atualizar");
		}
	}

	public Aluno recuperarAlunoPorId(int id) {
		return repo.findById(id).get();

	}

}
