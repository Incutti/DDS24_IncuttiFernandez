package TendenciasMusicales;

public abstract class Popularidad {
    public abstract void actEstado(Cancion cancion);

    public String detalleCompleto(Cancion cancion){
        String texto=icono()+"-"+leyenda(cancion);
        return texto;
    }

    protected abstract String icono();
    protected abstract String leyenda(Cancion cancion);
}
