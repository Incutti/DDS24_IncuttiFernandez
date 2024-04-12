package TendenciasMusicales;

import java.time.LocalDateTime;

public class Cancion {
    private String nombre;
    private Album album;
    private LocalDateTime ultVezReproducida;
    private int reproducciones;
    private Popularidad popularidad;
    private int likes;
    private int dislikes;

    public Cancion(String nombre, Album album) {
        this.nombre = nombre;
        this.album = album;
        this.ultVezReproducida = ultVezReproducida;
        this.reproducciones = 0;
        this.popularidad = new Normal();
        this.likes = 0;
        this.dislikes = 0;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public LocalDateTime getUltVezReproducida() {
        return ultVezReproducida;
    }

    public void setUltVezReproducida(LocalDateTime ultVezReproducida) {
        this.ultVezReproducida = ultVezReproducida;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
    }

    public Popularidad getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(Popularidad popularidad) {
        this.popularidad = popularidad;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public void reproducir(){
        reproducciones++;
        this.popularidad.actEstado(this);
        ultVezReproducida=LocalDateTime.now();
    }
    public void detalleCompleto(){
        System.out.println(this.popularidad.detalleCompleto(this));
    }
    public void cambiarPopularidad(){
        this.popularidad.actEstado(this);
    }
}
