package Youtube;

public class EnAuge extends Popularidad{

    private int reproducciones;
    private static int maxReproducciones = 50000;
    private static int maxDislikes = 5000;
    private int cantDislikes;
    private static int maxlikes = 20000;


    public EnAuge() {
        this.reproducciones = 0;
        this.cantDislikes=0;
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
        if(reproducciones>maxReproducciones && c.getLikes()>maxlikes){
            c.setPopularidad(new Tendencia());
        } else if (cantDislikes == maxDislikes) {
            c.setPopularidad(new Normal());
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
