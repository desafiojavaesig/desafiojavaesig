package br.com.desafio.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.desafio.entity.Contato;
import br.com.desafio.service.IContatoService;
import br.com.desafio.util.Estados;
import br.com.desafio.util.TipoPessoa;

@Controller
@Scope("session")
public class ContatoBean {
	
	private Long id;
	private String nome;
	private String cpf;
	private String uf;
	
	private IContatoService contatoService;
	
	private Contato contato = new Contato();
	private List<Contato> listaContatos = new ArrayList<Contato>();
	
	@Autowired	
	public ContatoBean(IContatoService contatoService) {
		this.contatoService = contatoService;
	}
	
	public List<Estados> getEstados() {
		return Estados.getEstados();
	}

	public List<TipoPessoa> getTipoPessoas() {
		return TipoPessoa.getTipoPessoas();
	}

	public String cadastro() {
		this.contato = new Contato();
		return "/pages/contato/form?faces-redirect=true";
	}
	
	public String salvar() {		
		this.contato.setId(this.contato.getId());
		this.contato.setNome(this.contato.getNome());
		this.contato.setCpf(this.contato.getCpf());
		this.contato.setUf(this.contato.getUf());
		this.contatoService.cadastrar(this.contato);
		this.contato = new Contato();
		listaContatos = contatoService.pesquisar(this.contato);
		return "/pages/contato/list?faces-redirect=true";
	}
	
	public String editar(Contato contato) {
		this.contato.setId(contato.getId());
		this.contato.setNome(contato.getNome());
		this.contato.setCpf(contato.getCpf());
		this.contato.setUf(contato.getUf());
		return "/pages/contato/form?faces-redirect=true";
	}
	
	public void remover(long id) {
		this.contatoService.remover(id);
		listaContatos = contatoService.pesquisar(this.contato);
	}
	
	public void pesquisar(Contato contato) {
		listaContatos = contatoService.pesquisar(contato);
		this.contato = new Contato();
	}
	
	public Contato getContato() {
		return this.contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public IContatoService getContatoService() {
		return contatoService;
	}

	public void setContatoService(IContatoService contatoService) {
		this.contatoService = contatoService;
	}

	public List<Contato> getListaContatos() {
		return this.listaContatos;
	}

	public void setListaContatos(List<Contato> listaContatos) {
		this.listaContatos = listaContatos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}
