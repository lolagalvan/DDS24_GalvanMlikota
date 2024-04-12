package Youtube;

import java.time.LocalDate;

public class Cancion {
    private String nombre;
    private Album album;
    private int reproducciones;
    private int likes;
    private int dislikes;
    private LocalDate ultimaRepro;
    private Popularidad popularidad;

    public Cancion(String nombre, Album album, int reproducciones, int likes, int dislikes, LocalDate ultimaRepro, Popularidad popularidad) {
        this.nombre = nombre;
        this.album = album;
        this.reproducciones = reproducciones;
        this.likes = likes;
        this.dislikes = dislikes;
        this.ultimaRepro = ultimaRepro;
        this.popularidad = popularidad;
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

    public int getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
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

    public LocalDate getUltimaRepro() {
        return ultimaRepro;
    }

    public void setUltimaRepro(LocalDate ultimaRepro) {
        this.ultimaRepro = ultimaRepro;
    }

    public Popularidad getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(Popularidad popularidad) {
        this.popularidad = popularidad;
    }
    public void reproducir(){
        reproducciones++;
        popularidad.actualizarEstado(this);
        ultimaRepro= LocalDate.now();
    }
    public void detalleCompleto(){
        popularidad.detalleCompleto(this);
    }
}
