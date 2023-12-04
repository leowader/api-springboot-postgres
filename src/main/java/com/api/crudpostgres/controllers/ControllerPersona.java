package com.api.crudpostgres.controllers;

import com.api.crudpostgres.models.Persona;
import com.api.crudpostgres.services.ServicePersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ControllerPersona {
    @Autowired
    private ServicePersona servicePersona;
    @GetMapping
    public String getPersona(){
        return servicePersona.getPersona();
    }
    @GetMapping("personas")
    public List<Persona> getPersonas(){
        return servicePersona.getPersonas();
    }
    @PostMapping("personas")
    public Persona createPersonas(@RequestBody Persona persona){
        return servicePersona.createPersonas(persona);
    }
    @PutMapping("personas/{id}")
    public Persona updatePersonas(@RequestBody Persona persona , @PathVariable Long id){
        return servicePersona.updatePersonas(persona,id);
    }
    @DeleteMapping("personas/{id}")
    public ResponseEntity<Map<String, String>> deletePersonas(@PathVariable Long id){
        Map<String, String> response = new HashMap<>();
        response.put("status","ok");
        response.put("message", "persona eliminada: "+id);
        servicePersona.deletePersonas(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
