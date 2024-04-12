package Youtube;

public class Album {
    private Artista artista;
    private int anio;
    private String nombre;

    public Album(Artista artista, int anio, String nombre) {
        this.artista = artista;
        this.anio = anio;
        this.nombre = nombre;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
