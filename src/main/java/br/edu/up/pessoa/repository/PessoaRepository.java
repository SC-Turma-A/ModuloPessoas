package br.edu.up.pessoa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.up.pessoa.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
