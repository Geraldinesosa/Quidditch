public class Jugador {

    private Integer skills;
    private Integer peso;
    private CategoriaJugador categoriaJugador;
    private Escoba escoba;
    private Equipo equipo;

    //Punto 1a) Saber el manejo de escoba de un jugador. Se calcula los skills / peso
    public Integer nivelManejoDeEscoba(){
        return skills/peso;
    }

    //punto 1b) Saber la ​ velocidad​ de un jugador, que es la velocidad de la escoba que use multiplicado
    //por su nivel de manejo de escoba
    public Double velocidadJugador(){
        return this.escoba.velocidadEscoba()*nivelManejoDeEscoba();
    }

    //punto 1c) saber la habilidad de un jugador.
    public Integer habilidadJugador(){
        return this.categoriaJugador.habilidadPorCategoria();
    }

    //punto 2a) si un jugador le pasa el trapo a otro si por lo menos es el doble de habilidoso que otro jugador
    public Boolean lePasaElTrapoA(Jugador jugador){
        return habilidadJugador()>= jugador.habilidadJugador()*2;
    }

    //punto 2b)un jugador es groso si su hablidad es mayor al promedio de su equipo
    // y su velocidad mayor a un valor arbitrario q a medida q el mercado
    //de escobas mejora, se actualiza para todos por igual
    //public Boolean esGroso(){
    //    return this.habilidadJugador > equipo.promedioEquipo && this.velocidadJugador


}
