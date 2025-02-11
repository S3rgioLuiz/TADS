package br.edu.ifsul.cstsi.tads_sergio.api.modulo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = false)
public interface ModuloRepository extends JpaRepository<Modulo, Long> {
}