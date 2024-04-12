package TendenciasMusicales;

public class EnAuge extends Popularidad{
    private int reproduccionesActuales;
    private int dislikesActuales;
    private static int maxReproducciones= 50000;
    private static int maxDislikes=5000;
    private static int maxLikes=20000;

    public EnAuge() {
        this.reproduccionesActuales = 0;
        this.dislikesActuales = 0;
    }

    public int getReproduccionesActuales() {
        return reproduccionesActuales;
    }

    public void setReproduccionesActuales(int reproduccionesActuales) {
        this.reproduccionesActuales = reproduccionesActuales;
    }

    public int getDislikesActuales() {
        return dislikesActuales;
    }

    public void setDislikesActuales(int dislikesActuales) {
        this.dislikesActuales = dislikesActuales;
    }

    public static int getMaxReproducciones() {
        return maxReproducciones;
    }

    public static void setMaxReproducciones(int maxReproducciones) {
        EnAuge.maxReproducciones = maxReproducciones;
    }

    public static int getMaxDislikes() {
        return maxDislikes;
    }

    public static void setMaxDislikes(int maxDislikes) {
        EnAuge.maxDislikes = maxDislikes;
    }

    public static int getMaxLikes() {
        return maxLikes;
    }

    public static void setMaxLikes(int maxLikes) {
        EnAuge.maxLikes = maxLikes;
    }

    @Override
    public void actEstado(Cancion cancion){
        reproduccionesActuales++;
        if(reproduccionesActuales>maxReproducciones){
            cancion.setPopularidad((new Tendencia()));
        }
    }
    @Override
    protected String icono(){
        return Icono.ROCKET.texto();
    }

    @Override
    protected String leyenda(Cancion cancion){
        return cancion.getArtista().getNombre() +" - "+ cancion.getNombre()+"("+cancion.getAlbum().getNombreAlbum() + " - " +cancion.getAlbum().getAnio()+")";
    }
}
