public class Buscador implements CategoriaJugador {

    private Integer skills;
    private Integer velocidad;
    private Integer nivelReflejos;
    private Integer nivelVision;

    //1c) habilidad de un jugador
    public Integer habilidadPorCategoria() {
        return velocidad+skills+nivelReflejos*nivelVision;
    }
}
