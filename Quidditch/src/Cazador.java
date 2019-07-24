public class Cazador implements CategoriaJugador {

    private Integer velocidad;
    private Integer skills;
    private Integer punteria;
    private Integer fuerza;

    public Integer habilidadPorCategoria() {
        return velocidad+skills+punteria*fuerza;
    }



}
