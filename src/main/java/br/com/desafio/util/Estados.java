package br.com.desafio.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Estados {
	AC("Acre", "AC", "Rio Branco", "Norte"), 
	AL("Alagoas", "AL", "Maceió", "Nordeste"),
	AP("Amapá", "AP", "Macapá", "Norte"), 
	AM("Amazonas", "AM", "Manaus", "Norte"),
	BA("Bahia", "BA", "Salvador", "Nordeste"), 
	CE("Ceará", "CE", "Fortaleza", "Nordeste"),
	DF("Distrito Federal", " DF", "Brasília", "Centro-Oeste"), 
	ES("Espírito Santo", "ES", "Vitória", "Sudeste"),
	GO("Goiás", "GO", "Goiânia", "Centro-Oeste"), 
	MA("Maranhão", " MA", "São Luís", "Nordeste"),
	MT("Mato Grosso", "MT", "Cuiabá", "Centro-Oeste"), 
	MS("Mato Grosso do Sul", "MS", "Campo Grande", "Centro-Oeste"),
	MG("Minas Gerais", " MG", "Belo Horizonte", "Sudeste"), 
	PA("Pará", " PA", "Belém", "Norte"),
	PB("Paraíba", "PB", "João Pessoa", "Nordeste"), 
	PR("Paraná", "PR", "Curitiba", "Sul"),
	PE("Pernambuco", "PE", "Recife", "Nordeste"), 
	PI("Piauí", "PI", "Teresina", " Nordeste"),
	RJ("Rio de Janeiro", "RJ", "Rio de Janeiro", "Sudeste"), 
	RN("Rio Grande do Norte", "RN", "Natal", "Nordeste"),
	RS("Rio Grande do Sul", "RS", "Porto Alegre", " Sul"), 
	RO("Rondônia", " RO", "Porto Velho", "Norte"),
	RR("Roraima", "RR", "Boa Vista", "Norte"), 
	SC("Santa Catarina", "SC", "Florianópolis", "Sul"),
	SP("São Paulo", "SP", "São Paulo", "Sudeste"), 
	SE("Sergipe", "SE", "Aracaju", "Nordeste"),
	TO("Tocantins", "TO", "Palmas", "Norte");

	public static final String REGIAO_NORTE = "Norte";
	public static final String REGIAO_SUL = "Sul";
	public static final String REGIAO_NORDESTE = "Nordeste";
	public static final String REGIAO_SUDESTE = "Sudeste";
	public static final String REGIAO_CENTRO_OESTE = "Centro-Oeste";

	private String descricao;
	private String sigla;
	private String capital;
	private String regiao;

	/***
	 * Construtor da enumeração
	 * 
	 * @param descricao {@link String}
	 * @param sigla     {@link String}
	 * @param capital   {@link String}
	 * @param regiao    {@link String}
	 */
	private Estados(String descricao, String sigla, String capital, String regiao) {
		this.descricao = descricao;
		this.sigla = sigla;
		this.capital = capital;
		this.regiao = regiao;
	}

	/***
	 * Retorna uma lista contendo todos os estados brasileiros
	 * 
	 * @return {@linkplain List}
	 */
	public static List<Estados> getEstados() {
		return Arrays.asList(Estados.values());
	}

	/***
	 * Retorna uma lista contendo todos os estados brasileiros da região Norte
	 * 
	 * @return {@linkplain List}
	 */
	public static List<Estados> getEstadosRegiaoNorte() {
		List<Estados> list = new ArrayList<Estados>();

		for (Estados estado : getEstados()) {
			if (estado.getRegiao().equals(REGIAO_NORTE)) {
				list.add(estado);
			}
		}
		return list;
	}

	/***
	 * Retorna uma lista contendo todos os estados brasileiros da região Sul
	 * 
	 * @return {@linkplain List}
	 */
	public static List<Estados> getEstadosRegiaoSul() {
		List<Estados> list = new ArrayList<Estados>();

		for (Estados estado : getEstados()) {
			if (estado.getRegiao().equals(REGIAO_SUL)) {
				list.add(estado);
			}
		}
		return list;
	}

	/***
	 * Retorna uma lista contendo todos os estados brasileiros da região Nordeste
	 * 
	 * @return {@linkplain List}
	 */
	public static List<Estados> getEstadosRegiaoNordeste() {
		List<Estados> list = new ArrayList<Estados>();

		for (Estados estado : getEstados()) {
			if (estado.getRegiao().equals(REGIAO_NORDESTE)) {
				list.add(estado);
			}
		}
		return list;
	}

	/***
	 * Retorna uma lista contendo todos os estados brasileiros da região Sudeste
	 * 
	 * @return {@linkplain List}
	 */
	public static List<Estados> getEstadosRegiaoSudeste() {
		List<Estados> list = new ArrayList<Estados>();

		for (Estados estado : getEstados()) {
			if (estado.getRegiao().equals(REGIAO_SUDESTE)) {
				list.add(estado);
			}
		}
		return list;
	}

	/***
	 * Retorna uma lista contendo todos os estados brasileiros da região
	 * Centro-Oeste
	 * 
	 * @return {@linkplain List}
	 */
	public static List<Estados> getEstadosRegiaoCentroOeste() {
		List<Estados> list = new ArrayList<Estados>();

		for (Estados estado : getEstados()) {
			if (estado.getRegiao().equals(REGIAO_CENTRO_OESTE)) {
				list.add(estado);
			}
		}
		return list;
	}

	/***
	 * Efetua a pesquisa de um estado federativo por sua sigla
	 * 
	 * @param sigla {@link String}
	 * @return {@linkplain TipoEstados}
	 */
	public static Estados findBySigla(String sigla) {
		for (Estados tipo : Arrays.asList(Estados.values())) {
			if (tipo.getSigla().equals(sigla)) {
				return tipo;
			}
		}
		return null;
	}

	/***
	 * Efetua a pesquisa de um estado federativo por sua descrição
	 * 
	 * @param descricao {@link String}
	 * @return {@linkplain TipoEstados}
	 */
	public static Estados findByDescricao(String descricao) {
		for (Estados tipo : Arrays.asList(Estados.values())) {
			if (tipo.getDescricao().equals(descricao)) {
				return tipo;
			}
		}
		return null;
	}

	/** Gets and Sets **/
	public String getDescricao() {
		return descricao;
	}

	public String getSigla() {
		return sigla;
	}

	public String getCapital() {
		return capital;
	}

	public String getRegiao() {
		return regiao;
	}
}
