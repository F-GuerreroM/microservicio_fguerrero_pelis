package com.example.microservicio_fguerrero_pelis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.microservicio_fguerrero_pelis.model.Pelicula;

public interface PeliculaRepository extends JpaRepository<Pelicula, Long>{
    
}
