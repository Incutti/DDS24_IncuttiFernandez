package TendenciasMusicales;

public class Album {
    private Artista artista;
    private int anio;
    private String nombreAlbum;

    public Album(Artista artista, int anio, String nombreAlbum) {
        this.artista = artista;
        this.anio = anio;
        this.nombreAlbum = nombreAlbum;
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

    public String getNombreAlbum() {
        return nombreAlbum;
    }

    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }
}
