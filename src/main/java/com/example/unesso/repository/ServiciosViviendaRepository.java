package com.example.unesso.repository;

import org.springframework.context.annotation.Description;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.unesso.model.ServiciosVivienda;

@Description("Esta clase realiza operaciones CRUD en la entidad serviciosVivienda de la Base de datos unesso") 
public interface ServiciosViviendaRepository extends JpaRepository<ServiciosVivienda, Integer> {

}
