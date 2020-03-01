package br.com.desafio.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.desafio.util.Estados;
import br.com.desafio.util.TipoPessoa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Contato")
public class Contato implements Serializable {

	private static final long serialVersionUID = 1L;

	@Getter
	@Setter
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", nullable = false)
	private Long id;

	@Getter
	@Setter
	@Column(name = "Nome", nullable = true, length = 45)
	private String nome;

	@Getter
	@Setter
	@Column(name = "Cpf", nullable = true, length = 14)
	private String cpf;

	@Getter
	@Setter
	@Column(name = "Uf", nullable = true, length = 2)
	@Enumerated(EnumType.STRING)
	private Estados uf;

	@Getter
	@Setter
	@Column(name = "tipopessoa", nullable = true, length = 1)
	@Enumerated(EnumType.STRING)
	private TipoPessoa tipoPessoa;
}
