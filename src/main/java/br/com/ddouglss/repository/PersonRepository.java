package br.com.ddouglss.repository;

import br.com.ddouglss.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {}
