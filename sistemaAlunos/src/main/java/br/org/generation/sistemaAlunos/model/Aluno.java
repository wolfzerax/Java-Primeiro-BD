package br.org.generation.sistemaAlunos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 	//INDICO QUE A CLASSE ALUNO É UMA ENTIDADE ARMAZENAVEL EM BANCO DE DADOS
@Table(name = "tbl_aluno") // ASSOCIO EXPLICITAMENTE O NOME DA TABELA QUE ARMAZENA
public class Aluno {
	
	@Column(name = "email", length = 100, unique = true)
	private String email;
	@Column(name = "nome", length = 100)
	private String nome;
	@Column (name = "telefone", length = 100)
	private String telefone;
	
	@Column(name = "ra") // DEFINO QUE O ATRIBUTO AGORA É UMA COLUNA DA TABELA
	@Id // ESSE ATRIBUI A CHAVE PRIMARIA
	@GeneratedValue(strategy = GenerationType.IDENTITY) // INDICA QUE RA É AUTO GERADO PELO BANCO DE DADOS
	private int Ra;
	
	
	
	public int getRa() {
		return Ra;
	}
	public void setRa(int ra) {
		Ra = ra;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
