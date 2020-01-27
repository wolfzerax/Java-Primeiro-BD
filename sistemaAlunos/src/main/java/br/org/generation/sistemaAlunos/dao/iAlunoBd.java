package br.org.generation.sistemaAlunos.dao;
import br.org.generation.sistemaAlunos.model.Aluno;
import org.springframework.data.repository.CrudRepository;


public interface iAlunoBd extends CrudRepository <Aluno, Integer> {
	

}
