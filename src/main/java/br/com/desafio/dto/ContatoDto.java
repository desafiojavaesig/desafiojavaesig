package br.com.desafio.dto;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.com.desafio.util.Estados;
import br.com.desafio.util.TipoPessoa;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class ContatoDto {
	
	@Getter @Setter
	@Column(name = "Id", nullable = false)
	private Long id;
	
	@Getter @Setter
	@Column(name = "Nome", nullable = true, length = 45)
	private String nome;
	
	@Getter @Setter
	@Column(name = "Cpf", nullable = true, length = 11)
	private String cpf;
	
	@Getter
	@Setter
	@Enumerated(EnumType.STRING)
	private Estados uf;	

	@Getter
	@Setter
	@Enumerated(EnumType.STRING)
	private TipoPessoa tipoPessoa;	
}
