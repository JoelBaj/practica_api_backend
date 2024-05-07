package com.joel.ec.model.dao;

import com.joel.ec.model.entity.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona, Integer> {
}
