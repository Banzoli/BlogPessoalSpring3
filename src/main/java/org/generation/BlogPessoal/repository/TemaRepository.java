package src.main.java.org.generation.BlogPessoal.repository;

import org.springframework.data.jpa.repository.jpaRepository;

import generation.org.BlogPessoal.model.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long>{
	public List<Tema> findAllByDescricaoContainingIgonoreCase( String descricao);
}
