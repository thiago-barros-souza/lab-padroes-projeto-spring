package one.digitalinnovation.gof.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import one.digitalinnovation.gof.model.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {}