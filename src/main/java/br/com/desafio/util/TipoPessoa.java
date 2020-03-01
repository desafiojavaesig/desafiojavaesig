package br.com.desafio.util;

import java.util.Arrays;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

public enum TipoPessoa {
	F("Física", "F"),
	J("Júridica", "J");
	
	@Getter @Setter
	private String descricao;
	
	@Getter @Setter
	private String sigla;
	
	private TipoPessoa(String descricao, String sigla) {
		this.descricao = descricao;
		this.sigla = sigla;
	}

	public static List<TipoPessoa> getTipoPessoas() {
		return Arrays.asList(TipoPessoa.values());
	}
	
	public static TipoPessoa findBySigla(String sigla) {
		for (TipoPessoa tipo : Arrays.asList(TipoPessoa.values())) {
			if (tipo.getSigla().equals(sigla)) {
				return tipo;
			}
		}
		return null;
	}	
	
	public static TipoPessoa findByDescricao(String descricao) {
		for (TipoPessoa tipo : Arrays.asList(TipoPessoa.values())) {
			if (tipo.getDescricao().equals(descricao)) {
				return tipo;
			}
		}
		return null;
	}

}
