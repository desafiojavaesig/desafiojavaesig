package br.com.desafio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.desafio.entity.Contato;

@Repository
public interface IContatoRepository extends JpaRepository<Contato, Long>{

	List<Contato> findByCpfEquals(String cpf);
	
	@Query("select c from Contato c WHERE c.nome like %:nome%")
	List<Contato> findByNomeEquals(@Param("nome") String nome);	
}
