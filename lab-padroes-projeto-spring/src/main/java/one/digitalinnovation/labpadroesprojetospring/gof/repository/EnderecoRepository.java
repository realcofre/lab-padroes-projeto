package one.digitalinnovation.labpadroesprojetospring.gof.repository;

import one.digitalinnovation.labpadroesprojetospring.gof.model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {
}
