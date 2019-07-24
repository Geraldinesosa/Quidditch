public class Guardian implements CategoriaJugador {

    private Integer velocidad;
    private Integer skills;
    private Integer nivelReflejos;
    private Integer fuerza;

    public Integer habilidadPorCategoria() {
        return velocidad+skills+nivelReflejos+fuerza;
    }
}
