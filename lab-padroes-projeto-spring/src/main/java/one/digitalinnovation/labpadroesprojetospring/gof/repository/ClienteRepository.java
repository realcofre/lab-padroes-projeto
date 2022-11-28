package one.digitalinnovation.labpadroesprojetospring.gof.repository;

import one.digitalinnovation.labpadroesprojetospring.gof.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
