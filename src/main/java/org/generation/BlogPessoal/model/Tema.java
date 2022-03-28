package src.main.java.org.generation.BlogPessoal.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GenerateValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import Javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@table(name = "tb_tema")
public class Tema {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String descricao;
	
	@OneToMany(mappedBy = "tema", cascade = CascadeType.ALL)
	@jsonIgnoreProperties("tema")
	private List<Postagem> postagem;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}
	
	
}
