package com.api.crudpostgres.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Setter
    private Long id;
    @Column
    @Setter
    private String name;
    @Column(name="telefono")//name en bd
    @Setter
    private String phone;
}
