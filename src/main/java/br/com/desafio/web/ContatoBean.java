package br.com.desafio.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafio.entity.Contato;
import br.com.desafio.service.IContatoService;
import br.com.desafio.util.Estados;
import br.com.desafio.util.TipoPessoa;
import lombok.Getter;
import lombok.Setter;

@RestController
@RequestMapping(path = "api/contato")
@Controller
@Scope("session")
public class ContatoBean {
	
	@Getter @Setter
	private Long id;
	
	@Getter @Setter
	private String nome;
	
	@Getter @Setter
	private String cpf;
	
	@Getter @Setter
	private String uf;
	
	@Getter @Setter
	private Contato contato;
	
	@Getter @Setter
	private List<Contato> listaContatos;
	
	private IContatoService contatoService;
	
	@Autowired	
	public ContatoBean(IContatoService contatoService) {
		this.contatoService = contatoService;
		this.contato = new Contato();		
		this.listaContatos = new ArrayList<Contato>();
	}
	
	@RequestMapping(value = "listaestados", method= RequestMethod.GET)
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
		this.contato.setCpf(this.contato.getCpf().replaceAll("\\D", ""));
		this.contato.setUf(this.contato.getUf());
		this.contato.setTipoPessoa(this.contato.getTipoPessoa());
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
		this.contato.setTipoPessoa(contato.getTipoPessoa());
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
	
}
