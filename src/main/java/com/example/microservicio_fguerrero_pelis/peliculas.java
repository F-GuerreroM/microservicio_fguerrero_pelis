package com.example.microservicio_fguerrero_pelis;

public class peliculas {
    private int id;
    private String titulo;
    private String genero;
    private int año;
    private String sinopsis;
    private String director;  // Nuevo campo

    // Constructor actualizado con director
    public peliculas(int id, String titulo, String genero, int año, String sinopsis, String director) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.año = año;
        this.sinopsis = sinopsis;
        this.director = director;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}