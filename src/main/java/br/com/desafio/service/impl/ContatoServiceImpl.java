package br.com.desafio.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.desafio.entity.Contato;
import br.com.desafio.repository.IContatoRepository;
import br.com.desafio.service.IContatoService;

@Service
@Transactional
public class ContatoServiceImpl implements IContatoService {

	private IContatoRepository contatoRepository;
	
	@Autowired
	public ContatoServiceImpl(IContatoRepository contatoRepository) {
		this.contatoRepository = contatoRepository;
	}
	
	@Override
	public List<Contato> listarTodos() {
		List<Contato> contatos = contatoRepository.findAll();
		return contatos;
	}

	@Override
	public Contato buscarPorId(Long id) {
		Contato contato = contatoRepository.findOne(id);
		return contato;
	}

	@Override
	public Contato cadastrar(Contato entity) {
		Contato contato = contatoRepository.save(entity);
		return contato;
	}

	@Override
	public Contato atualizar(Contato entity) {
		Contato contato = contatoRepository.save(entity);
		return contato;
	}

	@Override
	public void remover(Long id) {
		contatoRepository.delete(contatoRepository.getOne(id));
		
	}

	@Override
	public List<Contato> pesquisar(Contato contato) {
		List<Contato> contatos = new ArrayList<Contato>();
		if ( isPreenchido(contato.getNome()) && !(isPreenchido(contato.getCpf())) ) {
			contatos = contatoRepository.findByNomeEquals(contato.getNome());
		} else if ( isPreenchido(contato.getCpf()) && !(isPreenchido(contato.getNome()))) {
			contatos = contatoRepository.findByCpfEquals(contato.getCpf());
		} else if ( !(isPreenchido(contato.getCpf())) && !(isPreenchido(contato.getNome()))) {
			contatos = new ArrayList<Contato>();
		} else {
			contatos = contatoRepository.findAll();
		}
		return contatos;			
	}

	private boolean isPreenchido(String string) {
		boolean resultado = true;
        if ((string == null) || (string.isEmpty()) || (string.trim().isEmpty()) ) {
        	resultado = false;
        }
        return resultado;
    }	
}