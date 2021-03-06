package br.com.desafio.service;

import java.util.List;

import br.com.desafio.entity.Contato;

public interface IContatoService {
	
	List<Contato> listarTodos();
	
	List<Contato> pesquisar(Contato contato);

	Contato buscarPorId(Long id);

	Contato cadastrar(Contato entity);

	Contato atualizar(Contato entity);

	void remover(Long id);
}
