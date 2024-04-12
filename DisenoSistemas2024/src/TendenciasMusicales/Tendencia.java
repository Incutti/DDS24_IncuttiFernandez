package TendenciasMusicales;

import javax.swing.*;

public class Tendencia extends Popularidad{

    public void moverANormalSiEsPosible(Cancion cancion){

    }
    @Override
    public void actEstado(Cancion cancion) {
        moverANormalSiEsPosible(cancion);
    }

    @Override
    protected String icono() {
        return Icono.FIRE.texto();
    }

    @Override
    protected String leyenda(Cancion cancion) {
        return cancion.getNombre()+" - "+cancion.getArtista().getNombre()+"("+cancion.getAlbum().getNombreAlbum() + " - " +cancion.getAlbum().getAnio()+")";

    }
}
