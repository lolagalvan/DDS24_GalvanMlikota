package Youtube;

public class Tendencia extends Popularidad{

    public void moverANormalSiEsPosible(Cancion c){}
    @Override
    public void actualizarEstado(Cancion c) {
        moverANormalSiEsPosible(c);
    }

    @Override
    protected String icono() {
        return Icono.FIRE.texto();
    }

    @Override
    protected String leyenda(Cancion c) {
        return c.getNombre()+ "-" + c.getAlbum().getArtista().getNombre() + "(" + c.getAlbum().getNombre() + "-" + c.getAlbum().getAnio() + ")";
    }
}
