package com.example.microservicio_fguerrero_pelis.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pelicula")
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name= "titulo")
    private String titulo;
    @Column(name= "anno")
    private int año;
    @Column(name= "genero")
    private String genero;
    @Column(name= "director")
    private String director;
    @Column(name= "sinopsis")
    private String sinopsis;
    //Getters and setters    
    public Long getId() {
        return id;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getAnno() {
        return año;
    }    
    public String getGenero() {
        return genero;
    }    
    public String getDirector() {
        return director;
    }
    public String getSinopsis() {
        return sinopsis;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAnno(int año) {
        this.año = año;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
}