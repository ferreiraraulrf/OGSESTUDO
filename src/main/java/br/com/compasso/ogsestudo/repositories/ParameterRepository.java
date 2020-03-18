package br.com.compasso.ogsestudo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.compasso.ogsestudo.model.Parameter;

@Repository
public interface ParameterRepository extends CrudRepository<Parameter, Integer>{

	@Query(value = "SELECT p FROM Parameter p WHERE TO_UPPER(p.key) like :key")
	Optional<Parameter> findByKey(String key);
	
	Parameter findByValue(String value);
	
}
