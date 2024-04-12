package TendenciasMusicales;

public class Normal extends Popularidad{
    private int reproduccionesActuales;

    private static int maxReproducciones=1000;


    public Normal() {
        this.reproduccionesActuales = 0;
    }

    public int getReproduccionesActuales() {
        return reproduccionesActuales;
    }

    public void setReproduccionesActuales(int reproduccionesActuales) {
        this.reproduccionesActuales = reproduccionesActuales;
    }

    public static int getMaxReproducciones() {
        return maxReproducciones;
    }

    public static void setMaxReproducciones(int maxReproducciones) {
        Normal.maxReproducciones = maxReproducciones;
    }

    @Override
    public void actEstado(Cancion cancion){
        reproduccionesActuales++;
        if(reproduccionesActuales>maxReproducciones){
            cancion.setPopularidad((new EnAuge()));
        }
    }
    @Override
    protected String icono(){
        return Icono.MUSICAL_NOTE.texto();
    }

    @Override
    protected String leyenda(Cancion cancion){
        return cancion.getArtista().getNombre() +" - "+ cancion.getAlbum().getNombreAlbum() + " - " +cancion.getNombre();
    }


}
