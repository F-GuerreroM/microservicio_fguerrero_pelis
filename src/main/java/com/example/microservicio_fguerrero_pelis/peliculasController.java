package com.example.microservicio_fguerrero_pelis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/peliculas")
public class peliculasController 
{

    private List<peliculas> peliculas = new ArrayList<>();

    public peliculasController() {
        // Inicializar algunas películas para pruebas
        peliculas.add(new peliculas(1, "Inception", "Ciencia ficción", 2010, 
            "Un ladrón experto en robar secretos mediante el sueño es ofrecido una oportunidad de redención si realiza una tarea de 'inception'.", 
            "Christopher Nolan"));
        peliculas.add(new peliculas(2, "The Dark Knight", "Acción", 2008, 
            "Batman enfrenta a un nuevo villano, el Joker, que amenaza con destruir Gotham City.", 
            "Christopher Nolan"));
        peliculas.add(new peliculas(3, "Interstellar", "Ciencia ficción", 2014, 
            "Un grupo de astronautas viaja a través de un agujero de gusano en busca de un nuevo hogar para la humanidad.", 
            "Christopher Nolan"));
        peliculas.add(new peliculas(4, "The Matrix", "Acción/Sci-Fi", 1999, 
            "Un hacker descubre que el mundo que conoce es una simulación controlada por máquinas.", 
            "Lana Wachowski, Lilly Wachowski"));
        peliculas.add(new peliculas(5, "The Godfather", "Crimen", 1972, 
            "La saga de la familia Corleone, una de las más poderosas organizaciones mafiosas de Nueva York.", 
            "Francis Ford Coppola"));
    
    }
    
    @GetMapping
    public List<peliculas> obtenerPeliculas() {
        return peliculas;
    }

    @GetMapping("/{id}")
    public peliculas obtenerPeliculaPorId(@PathVariable int id) {
        for (peliculas pelicula : peliculas) {
            if (pelicula.getId() == id) {
                return pelicula; 
            }
        }
        return null;
}
}
