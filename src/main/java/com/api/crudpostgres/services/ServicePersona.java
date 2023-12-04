package com.api.crudpostgres.services;

import com.api.crudpostgres.models.Persona;
import com.api.crudpostgres.repositories.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServicePersona {

    @Autowired
    private Repository repository;

    public String getPersona(){
        return "conectado";
    }
    public List<Persona> getPersonas(){
        return repository.findAll();
    }
    public Persona createPersonas(Persona persona){
        return repository.save(persona);
    }
    public Persona updatePersonas(Persona persona ,Long id){
        Persona person = repository.findById(id).get();
        person.setName(persona.getName());
        person.setPhone(persona.getPhone());
        repository.save(person);
        return person;
    }
    public void deletePersonas(Long id){
        repository.deleteById(id);
    }
}
