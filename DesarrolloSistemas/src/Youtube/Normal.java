package Youtube;

public class Normal extends Popularidad {

    private int reproducciones;
    private static int maxReproducciones = 1000;

    public Normal() {
        this.reproducciones = 0;
    }



    public int getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
    }

    @Override
    public void actualizarEstado(Cancion c) {
        reproducciones++;
        if(reproducciones>Normal.maxReproducciones){
            c.setPopularidad(new EnAuge());
        }
    }

    @Override
    protected String icono() {
        return Icono.ROCKET.texto();
    }

    @Override
    protected String leyenda(Cancion c) {
        return c.getNombre()+ "-" + c.getAlbum().getArtista().getNombre() + "(" + c.getAlbum().getNombre() + "-" + c.getAlbum().getAnio() + ")";
    }
}
