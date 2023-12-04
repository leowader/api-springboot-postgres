package com.api.crudpostgres.repositories;

import com.api.crudpostgres.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Persona,Long> {

}
