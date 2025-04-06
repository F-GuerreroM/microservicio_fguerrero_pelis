package com.example.microservicio_fguerrero_pelis.service;

import com.example.microservicio_fguerrero_pelis.model.Pelicula;
import java.util.List;
import java.util.Optional;

public interface PeliculaService {
    List<Pelicula> getAllPeliculas();
    Optional<Pelicula> getPeliculaById(Long id);
    Pelicula createPelicula(Pelicula pelicula);
    Pelicula updatePelicula(Long id,Pelicula student);
    void deletePelicula(Long id);
}