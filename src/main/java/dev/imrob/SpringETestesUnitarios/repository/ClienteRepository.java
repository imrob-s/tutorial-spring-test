package dev.imrob.SpringETestesUnitarios.repository;

import dev.imrob.SpringETestesUnitarios.entities.Cliente;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends ListCrudRepository<Cliente, Long> {
}
